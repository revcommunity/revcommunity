package org.revcommunity.model;

import java.util.Set;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class CategoryFilter
{

    @GraphId
    private Long nodeId;

    private String name;

    private String symbol;

    private Long remoteId;
    
    private CategoryFilterType type;

    private Set<String> values;

    public CategoryFilter()
    {
    }

    public CategoryFilter( String name, CategoryFilterType type )
    {
        super();
        this.name = name;
        this.symbol = generateSymbol( name );
        this.type = type;
    }

    public String generateSymbol( String name )
    {
        return name.replaceAll( "\\W", "" ).toLowerCase();
    }

    public Long getNodeId()
    {
        return nodeId;
    }

    public void setNodeId( Long nodeId )
    {
        this.nodeId = nodeId;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol( String symbol )
    {
        this.symbol = symbol;
    }

    public CategoryFilterType getType()
    {
        return type;
    }

    public void setType( CategoryFilterType type )
    {
        this.type = type;
    }

    public Set<String> getValues()
    {
        return values;
    }

    public void setValues( Set<String> values )
    {
        this.values = values;
    }

    @Override
    public String toString()
    {
        return "CategoryFilter [name=" + name + ", symbol=" + symbol + ", type=" + type + "]";
    }

    public Long getRemoteId()
    {
        return remoteId;
    }

    public void setRemoteId( Long remoteId )
    {
        this.remoteId = remoteId;
    }

}
