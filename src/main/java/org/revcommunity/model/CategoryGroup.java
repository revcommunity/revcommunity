package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class CategoryGroup
    extends AbstractCategory
{

    @RelatedTo( type = "CONTAINS", direction = Direction.OUTGOING )
    private Set<AbstractCategory> children = new HashSet<AbstractCategory>();

    public CategoryGroup()
    {
    }

    public CategoryGroup( Long nodeId )
    {
        this.setNodeId( nodeId );
    }

    public Set<AbstractCategory> getChildren()
    {
        return children;
    }

    public void setChildren( Set<AbstractCategory> children )
    {
        this.children = children;
    }

	@Override
	public String toString() {
	    
	    String parentName = "";
	    
	    if(getParent() != null){
	        parentName = getParent().getName();
	    }
	    
		return "CategoryGroup [children=" + children + ", getChildren()="
				+ getChildren() + ", getRemoteId()=" + getRemoteId()
				+ ", getFilters()=" + getFilters() + ", getNodeId()="
				+ getNodeId() + ", getParentName()=" + parentName + ", getName()="
				+ getName() +"]";
	}

	public void addCategoryFilter( CategoryFilter categoryFilter )
    {
        getFilters().add( categoryFilter );

    }

    public void addChild( AbstractCategory ac )
    {
        getChildren().add( ac );
    }

    @Override
    public boolean isLeaf()
    {
        return false;
    }
}
