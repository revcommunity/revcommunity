package org.revcommunity.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

public class NokautHTML
{

    @Test
    public void try_(){
        
        Document doc;
        try
        {
            doc = Jsoup.connect("http://www.nokaut.pl/laptopy/hp-h5e72ea.html").get();
            
            
            Elements newsHeadlines = doc.select(".Properties li");
            System.out.println(newsHeadlines);
        }
        catch ( IOException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
}
