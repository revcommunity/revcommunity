package org.revcommunity.schedule.job;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class NewsletterJob extends QuartzJobBean 
{
    
    private static final Logger logger = Logger.getLogger( NewsletterJob.class );

    @Override
    protected void executeInternal( JobExecutionContext arg0 )
        throws JobExecutionException
    {
        if(logger.isDebugEnabled()){
            logger.debug( "Cron... Newsletter" );
        }
        
    }

    
}
