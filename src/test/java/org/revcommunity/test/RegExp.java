package org.revcommunity.test;

import java.util.regex.Pattern;

import org.junit.Test;

public class RegExp
{
    private static String ALPHA_NUMERIC_REGEXP = "^[a-zA-Z0-9]*$";
    
    @Test
    public void test(){
        
        
        String a = "asdfasdf";
        
        boolean w = Pattern.matches( ALPHA_NUMERIC_REGEXP, a );
        
        System.out.println(w);
        
    }

}
