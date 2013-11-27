package org.revcommunity.util;

public class LinkBuilder
{

    public static String buildReviewUrl( Long reviewId )
    {
        StringBuilder sb = new StringBuilder( "#review/" );
        sb.append( reviewId );
        return sb.toString();
    }

    public static String buildUserUrl( String userName )
    {
        StringBuilder sb = new StringBuilder( "#reviews/user/" );
        sb.append( userName );
        return sb.toString();
    }

    public static String buildUserLink( String userName, String text )
    {
        return buildLink( buildUserUrl( userName ), text );
    }

    public static String buildReviewLink( Long reviewId, String text )
    {
        return buildLink( buildReviewUrl( reviewId ), text );
    }

    private static String buildLink( String url, String text )
    {
        StringBuilder sb = new StringBuilder( "<a href=\"" );
        sb.append( url );
        sb.append( "\">" );
        sb.append( text );
        sb.append( "</a>" );
        return sb.toString();
    }

    public static String buildProductUrl( Long productId )
    {
        StringBuilder sb = new StringBuilder( "#product/" );
        sb.append( productId );
        return sb.toString();
    }

    public static String buildProductLink( Long productId, String text )
    {
        return buildLink( buildProductUrl( productId ), text );
    }
}
