package org.revcommunity.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( { "classpath*:applicationContext-test.xml" } )
public class AllegroApiTest
{
    
//    @Qualifier("AllegroService")
    //RemoteService allegro = new AllegroService();
    
    @Autowired
    AbstractCategoryRepo a;
    
    @Test
    public void connect(){
        
        //allegro.downloadAllCategories();
        
        EndResult<AbstractCategory> l = a.findAll();
        AbstractCategory c = l.iterator().next();
        
        c.setRemoteId( new Long(100) );
        
        System.out.println(c.toString());
        
        a.save( c );
        
        AbstractCategory b = a.findByRemoteId( new Long(100) );
        System.out.println(b.toString());
    }
    
   // @Test
    public void exceptionTest(){
        
        boolean wyjatek = true;
        for(int i = 0;i<10; i++){
            if( i == 5 && wyjatek){
                try{
                    wyjatek = false;
                    throw new java.lang.Exception();
                }catch(java.lang.Exception e){
                    i--;
                    continue;
                }
            }
            System.out.println(i);
        }
    }
}
