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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class NewsletterJob
    extends QuartzJobBean
{

    private static final Logger logger = Logger.getLogger( NewsletterJob.class );

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ProductRepo productRepo;
    
    @Autowired
    private org.revcommunity.repo.ReviewRepo reviewRepo;
    
    @Autowired
    private SubscriptionService subscriptionService;
    
    private MailService mailService;
    
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

        Date yesterday = DateUtils.addDays( new Date(), -1 );
        
        String yesterdayTime = "" + yesterday.getTime();
        
        List<Product> products = productRepo.findNewerThanSpecifiedDate( yesterdayTime );
        if(logger.isDebugEnabled()){
            logger.debug( "Znalazłem: " + products.size() + " nowych produktów" );
        }
        
        for ( Product product : products )
        {
            //generujemy raport
            System.out.println(product.getDateAdded().getTime());
        }
        
        
        List<Review> reviews = reviewRepo.findNewerThanSpecifiedDate( yesterdayTime );
        if(logger.isDebugEnabled()){
            logger.debug( "Znalazłem: " + reviews.size() + " nowych recenzji" );
        }
        
       
        for ( Review review : reviews )
        {
            //generujemy raport
            System.out.println(review.getDateAdded().getTime());
        }
        
        
        
        String report = "Tresc newsletter'a";
        
        List<User> users = userRepo.findUsersToSendNewsLetter();
        String [] addressTo = new String[users.size()];
        for(int i = 0; i< users.size(); ++i){
            addressTo[i] = users.get( i ).getEmail();
        }
        
        mailService.sendEmails( report, addressTo );
        
        if(logger.isDebugEnabled()){
            logger.debug( "Newsletter koniec..., czas : " + (System.currentTimeMillis() - czas) +" ms" );
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
    
    
}
