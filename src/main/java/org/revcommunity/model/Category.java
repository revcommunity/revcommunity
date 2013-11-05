package org.revcommunity.model;

import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Category
    extends AbstractCategory
{

    private boolean leaf = true;

    public Category()
    {
        super();
    }

    public Category( Long nodeId )
    {
        super( nodeId );
    }

    public boolean isLeaf()
    {
        return leaf;
    }

}
