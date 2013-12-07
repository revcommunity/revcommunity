package org.revcommunity.util.search;

public class Sorter
{

    private String property;

    private SortDirection direction;

    Sorter()
    {
        super();
    }

    public Sorter( SortDirection direction, String property )
    {
        this.direction = direction;
        this.property = property;
    }

    public String getProperty()
    {
        return property;
    }

    public void setProperty( String property )
    {
        this.property = property;
    }

    public SortDirection getDirection()
    {
        return direction;
    }

    public void setDirection( SortDirection direction )
    {
        this.direction = direction;
    }

}
