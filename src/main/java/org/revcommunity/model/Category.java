package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Category
    extends AbstractCategory
{

    @RelatedTo( type = "CATEGORY_PARENT", direction = Direction.INCOMING )
    private Category parent;
    
    @RelatedTo( type = "FILTERS", direction = Direction.OUTGOING )
    private Set<CategoryFilter> filters;

    @Fetch
	@RelatedTo(type = "CATEGORY_PRODUCTS", direction = Direction.OUTGOING)
	private Set<Product> products = new HashSet<Product>();
    
    @Fetch
	@RelatedTo(type = "CATEGORY_CHILDS", direction = Direction.INCOMING)
	private Set<Category> childs = new HashSet<Category>();

	public Set<Category> getChilds() {
		return childs;
	}

	public void setChilds(Set<Category> childs) {
		this.childs = childs;
	}

	public void addChildren(Category ac){
		this.childs.add(ac);
	}
    
    public Category getParent()
    {
        return parent;
    }

    public void setParent( Category parent )
    {
        this.parent = parent;
    }

    public Set<CategoryFilter> getFilters()
    {
        return filters;
    }

    public void setFilters( Set<CategoryFilter> filters )
    {
        this.filters = filters;
    }

    public void addProduct(Product p){
    	this.products.add(p);
    }

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [parent=" + parent + ", filters=" + filters
				+ ", products=" + products + ", childs=" + childs
				+ ", getNodeId()=" + getNodeId() + ", getName()=" + getName()
				+ ", getId()=" + getId() + ", getUrl()=" + getUrl()
				+ ", getTree()=" + getTree() + ", getParentId()="
				+ getParentId() + ", getImageUrl()=" + getImageUrl()
				+ ", getProductCount()=" + getProductCount()
				+ ", getTreeName()=" + getTreeName() + ", getTreeLevel()="
				+ getTreeLevel() + ", getIsLeaf()=" + getIsLeaf() + "]";
	}
	
	
}
