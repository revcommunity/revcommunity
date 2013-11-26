package org.revcommunity.test;

import java.io.IOException;
import java.net.URL;

import org.apache.axis.encoding.Base64;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.auth.BasicScheme;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.util.HttpURLConnection;
import org.junit.Test;

public class SkapiecTest
{

    @Test
    public void autoryzacja(){
        
        try {
            // URL url = new URL ("http://ip:port/download_url");
            URL url = new URL("http://api.skapiec.pl/beta_listProducts.xml?category=1,2&amount=4&offset=1");
            String authStr = "reviewcommunityallegro@gmail.com" + ":" + "CKXW0.)a";
            String authEncoded = Base64.encode(authStr.getBytes());

            sun.net.www.protocol.http.HttpURLConnection connection = (sun.net.www.protocol.http.HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Basic " + authEncoded);

            String in = connection.getResponseMessage();
            System.out.println(in);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
//        
//        
//        HttpClient httpClient = new HttpClient();
//        Credentials defaultcreds = new UsernamePasswordCredentials("reviewcommunityallegro@gmail.com", "CKXW0.)a");
//        httpClient.getState().setCredentials(new AuthScope("http://api.skapiec.pl", 80, AuthScope.ANY_REALM), defaultcreds);
//
//
//        GetMethod get = new GetMethod( "http://api.skapiec.pl/beta_listProducts.xml?category=1,2&amount=4&offset=1" );
//        get.setDoAuthentication( true );
//        get.se
//        try
//        {
//            httpClient.executeMethod( get );
//            int status = get.getStatusCode();
//            System.out.println(get.getResponseBodyAsString());
//        }
//        catch ( HttpException e )
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        catch ( IOException e )
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
        
    }
}
