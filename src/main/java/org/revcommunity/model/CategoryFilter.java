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

    private CategoryFilterType type;

    private Set<String> values;

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

}
