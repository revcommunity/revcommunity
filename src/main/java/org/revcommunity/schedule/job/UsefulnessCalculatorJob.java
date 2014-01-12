package org.revcommunity.schedule.job;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.revcommunity.model.KeyValuePair;
import org.revcommunity.model.Review;
import org.revcommunity.repo.KeyValuePairRepo;
import org.revcommunity.repo.ReviewRepo;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Dawid Janaszak
 */
public class UsefulnessCalculatorJob
    extends QuartzJobBean
{

    private static final Logger logger = Logger.getLogger( UsefulnessCalculatorJob.class );

    private ReviewRepo reviewRepo;

    private KeyValuePairRepo keyValuePairRepo;

    @Override
    protected void executeInternal( JobExecutionContext arg0 )
        throws JobExecutionException
    {

        long czas = 0;
        if ( logger.isDebugEnabled() )
        {
            logger.debug( "Cron UsefulnessCalculatorJob start" );
            czas = System.currentTimeMillis();
        }
        Double sum = 0.0;
        Double avg;
               
        EndResult<Review> reviews =  reviewRepo.findAll();     
        
        for ( Review r : reviews )
        {
            // średnia użyteczność reprezentowana jest przez liczbę z zakresu [0;1]
            sum += ( r.getUsefulness() / 100 );
        } 

        avg = sum / reviewRepo.count();
        KeyValuePair keyValuePair = keyValuePairRepo.findOneByKey( "avgUsefulness" );
        if ( keyValuePair == null )
        {
            keyValuePair = new KeyValuePair();
            keyValuePair.setKey( "avgUsefulness" );
        }
        keyValuePair.setValue( avg );
        keyValuePairRepo.save( keyValuePair );
        
        if ( logger.isDebugEnabled() )
        {
            logger.debug( "calculated avg:" + avg );
        }

        if ( logger.isDebugEnabled() )
        {
            logger.debug( "UsefulnessCalculatorJob koniec, czas : " + ( System.currentTimeMillis() - czas ) + " ms" );
        }

    }

    public void setReviewRepo( ReviewRepo reviewRepo )
    {
        this.reviewRepo = reviewRepo;
    }

    public void setKeyValuePairRepo( KeyValuePairRepo keyValuePairRepo )
    {
        this.keyValuePairRepo = keyValuePairRepo;
    }

}
