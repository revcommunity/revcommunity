package org.revcommunity.util;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.revcommunity.util.search.Sorter;

public class ControllerUtils
{

    public static List<Sorter> readSorters( String sSorters )
    {
        ObjectMapper om = new ObjectMapper();
        if ( StringUtils.isBlank( sSorters ) )
            return null;
        List<Sorter> sorters;
        try
        {
            sorters = om.readValue( sSorters, new TypeReference<List<Sorter>>()
            {
            } );
            return sorters;
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }

    }
}
