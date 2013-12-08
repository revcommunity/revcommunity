package org.revcommunity.search;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.revcommunity.model.FilterValue;
import org.revcommunity.util.search.Sorter;

public class CypherQueryBuilder
{

    public static void buildSort( StringBuilder sb, List<Sorter> sorters )
    {
        if ( sorters != null && !sorters.isEmpty() )
        {
            sb.append( " order by " );
            for ( Sorter sorter : sorters )
            {
                sb.append( StringUtils.join( "product.", sorter.getProperty(), "? ", sorter.getDirection().toString(), "," ) );
            }
            sb.setLength( sb.length() - 1 );
            sb.append( " " );
        }
    }

    public static String buildStart( Class<?> clazz )
    {
        return StringUtils.join( "start n=node:__types__(className='", clazz.getName(), "')" );
    }

    public static void buildPaging( StringBuilder sb, Map<String, Object> params, Integer start, Integer limit )
    {
        if ( start != null )
        {
            sb.append( " skip {offset} " );
            params.put( "offset", start );
        }
        if ( limit != null )
        {
            sb.append( " limit {pageSize} " );
            params.put( "pageSize", limit );
        }

    }

    public static void buildCategoryFilters( StringBuilder sb, Iterable<FilterValue> filters, Map<String, Object> params )
    {
        String endSeparator = " or ";
        for ( FilterValue filter : filters )
        {
            if ( filter.getValue() == null )
                continue;
            sb.append( " ( " );
            sb.append( StringUtils.join( " filter.symbol = {sym_", filter.getSymbol(), "} " ) );
            sb.append( " and " );
            sb.append( StringUtils.join( " filter.value is not null " ) );
            sb.append( " and " );
            sb.append( StringUtils.join( " filter.value? = {val_", filter.getSymbol(), "} " ) );
            sb.append( " ) " );
            sb.append( endSeparator );
        }
        sb.setLength( sb.length() - endSeparator.length() );

        for ( FilterValue filter : filters )
        {
            if ( filter.getValue() == null )
                continue;
            params.put( StringUtils.join( "sym_", filter.getSymbol() ), filter.getSymbol() );
            params.put( StringUtils.join( "val_", filter.getSymbol() ), filter.getValue() );
        }

    }
}
