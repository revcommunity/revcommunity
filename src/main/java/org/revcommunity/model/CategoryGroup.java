package org.revcommunity.model;

import java.util.Set;

import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class CategoryGroup extends AbstractCategory {

	private Set<AbstractCategory> children;

	public Set<AbstractCategory> getChildren() {
		return children;
	}

	public void setChildren(Set<AbstractCategory> children) {
		this.children = children;
	}

}
