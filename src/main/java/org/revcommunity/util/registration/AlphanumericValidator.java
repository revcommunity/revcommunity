package org.revcommunity.util.registration;

import java.util.regex.Pattern;

public class AlphanumericValidator implements Validator
{
    private static String ALPHA_NUMERIC_REGEXP =  "^[a-zA-Z0-9]*$";

    public boolean validate( String o )
    {
        return Pattern.matches( ALPHA_NUMERIC_REGEXP, o );
    }
    
    
}
