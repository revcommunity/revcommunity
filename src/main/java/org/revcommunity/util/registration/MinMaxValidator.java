package org.revcommunity.util.registration;

public class MinMaxValidator implements Validator
{
    private int min;
    private int max;
    
    public boolean validate( String o )
    {
        if(o == null)
            return false;
        
        if(o.length() < min || o.length() > max)
            return false;
          
        return true;
        
    }
    public MinMaxValidator( int min, int max )
    {
        super();
        this.min = min;
        this.max = max;
    }
    public void setMin( int min )
    {
        this.min = min;
    }
    public void setMax( int max )
    {
        this.max = max;
    }
    
}
