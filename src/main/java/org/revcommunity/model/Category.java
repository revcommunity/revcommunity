package org.revcommunity.model;

import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Category
    extends AbstractCategory
{

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
        return true;
    }

	@Override
	public String toString() {
	    String parentName = "";
        
        if(getParent() != null){
            parentName = getParent().getName();
        }
	    
		return "Category [getRemoteId()=" + getRemoteId() + ", getFilters()="
				+ getFilters() + ", getNodeId()=" + getNodeId()
				+ ", getParentName()=" + parentName + ", getName()=" + getName()
				+ "]";
	}

    
    
}
