package org.revcommunity.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.revcommunity.remote.service.nokaut.NokautConstans;

public class NokautHTML
{

    @Test
    public void try_(){
        
        Connection connection = Jsoup.connect("http://www.nokaut.pl/laptopy/samsung-770z7e-s01pl.html"+NokautConstans.PRODUCT_DESCRIPTION_POSTFIX);
        
        try
        {
            Document doc =  connection.get();
            Elements properties = doc.select(".PathNavigation nav ul li");
            for ( Element element : properties )
            {
                System.out.println(element);
            }
            
            
        }
        catch ( IOException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
}
