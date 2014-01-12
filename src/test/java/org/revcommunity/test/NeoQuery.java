package org.revcommunity.test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.util.DateUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.CategoryFilter;
import org.revcommunity.model.CategoryGroup;
import org.revcommunity.model.Product;
import org.revcommunity.model.User;
import org.revcommunity.repo.AbstractCategoryRepo;
import org.revcommunity.repo.CategoryGroupRepo;
import org.revcommunity.repo.CategoryRepo;
import org.revcommunity.repo.ProductRepo;
import org.revcommunity.repo.UserRepo;
import org.revcommunity.util.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( { "classpath*:applicationContext-test.xml" } )
public class NeoQuery
{

    @Autowired
    private Neo4jTemplate tpl;
    
    @Autowired
    private ProductRepo productRepo;
    
    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private AbstractCategoryRepo cr;
    
    @Autowired
    private CategoryGroupRepo cg;
    
    //@Test
    public void test(){
        
        
//        Date d = DateUtils.addDays( new Date(), -1 );
//        
//        String time = "" + d.getTime();
//        
//        List<Product> res =productRepo.findNewerThanSpecifiedDate( ""+d.getTime() );
//        System.out.println("Koniec...");
//        for ( Product product : res )
//        {
//            System.out.println(product.getDateAdded().getTime());
//        }
        
        EndResult<AbstractCategory> l =   cr.findAll();
        for ( AbstractCategory abstractCategory : l )
        {
            for ( CategoryFilter s : abstractCategory.getFilters() )
            {
                System.out.println(s.getName());
                for ( String aa : s.getValues() )
                {
                    System.out.println("\t " + aa);
                }
            }
        }
        
    }
    
    @Test
    public void asdf(){
       List<AbstractCategory> l=  cg.findByBaseCategory( false );
       
       for ( AbstractCategory abstractCategory : l )
    {
        System.out.println(abstractCategory.getNodeId() + " " + abstractCategory.getName());
    }
       
    }
    
    //@Test
    public void mailTest(){
        
        
        MailService ms = new MailService();
        
        ms.sendEmails( ":p", "rosol88@gmail.com" );
        
    }
    
}
