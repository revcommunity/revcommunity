package org.revcommunity.schedule.job;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.revcommunity.model.Product;
import org.revcommunity.model.Review;
import org.revcommunity.model.User;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.service.SubscriptionService;
import org.revcommunity.util.MailService;
import org.revcommunity.util.newsletter.NewsletterDefault;
import org.revcommunity.util.newsletter.NewsletterMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Tomek Straszewski Dec 16, 2013
 */
public class NewsletterJob
    extends QuartzJobBean
{

    private static final Logger logger = Logger.getLogger( NewsletterJob.class );

    private UserRepo userRepo;

    private ProductRepo productRepo;

    private org.revcommunity.repo.ReviewRepo reviewRepo;

    private SubscriptionService subscriptionService;

    private MailService mailService;

    private int daysAgo;

    @Override
    protected void executeInternal( JobExecutionContext arg0 )
        throws JobExecutionException
    {
        long czas = 0;
        if ( logger.isDebugEnabled() )
        {
            logger.debug( "Cron... Newsletter" );
            czas = System.currentTimeMillis();
        }

        Date yesterday = DateUtils.addDays( new Date(), -daysAgo );

        String yesterdayTime = "" + yesterday.getTime();

        List<Product> products = productRepo.findNewerThanSpecifiedDate( yesterdayTime );
        if ( logger.isDebugEnabled() )
        {
            logger.debug( "Znalazłem: " + products.size() + " nowych produktów" );
        }

        List<Review> reviews = reviewRepo.findNewerThanSpecifiedDate( yesterdayTime );
        if ( logger.isDebugEnabled() )
        {
            logger.debug( "Znalazłem: " + reviews.size() + " nowych recenzji" );
        }

        NewsletterMessage newsletterMsg = new NewsletterDefault();
        String report = newsletterMsg.createMessage( products, reviews );

        List<User> users = userRepo.findUsersToSendNewsLetter();
        String[] addressTo = new String[users.size()];
        int j = 0;
        for ( int i = 0; i < users.size(); ++i )
        {
            if ( users.get( i ).getEmail() != null )
            {
                addressTo[j] = users.get( i ).getEmail();
                j++;
            }

        }

        if ( users.size() > 0 )
        {
            mailService.sendEmails( report, addressTo );
        }

        if ( logger.isDebugEnabled() )
        {
            logger.debug( "Newsletter koniec..., czas : " + ( System.currentTimeMillis() - czas ) + " ms" );
        }

    }

    public UserRepo getUserRepo()
    {
        return userRepo;
    }

    public void setUserRepo( UserRepo userRepo )
    {
        this.userRepo = userRepo;
    }

    public void setProductRepo( ProductRepo productRepo )
    {
        this.productRepo = productRepo;
    }

    public void setReviewRepo( org.revcommunity.repo.ReviewRepo reviewRepo )
    {
        this.reviewRepo = reviewRepo;
    }

    public void setSubscriptionService( SubscriptionService subscriptionService )
    {
        this.subscriptionService = subscriptionService;
    }

    public void setMailService( MailService mailService )
    {
        this.mailService = mailService;
    }

    public int getDaysAgo()
    {
        return daysAgo;
    }

    public void setDaysAgo( int daysAgo )
    {
        this.daysAgo = daysAgo;
    }

}
