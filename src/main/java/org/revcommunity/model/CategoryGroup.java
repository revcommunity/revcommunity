package org.revcommunity.model;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
@Deprecated
//FIXME Wydaje mi sie ze ta klasa jest niepotrzebna
//Category wystarczy, tam dodamy liste childs, dla liscia po prostu bd ona pusta
public class CategoryGroup extends AbstractCategory {

	@Fetch
	@RelatedTo(type = "CATEGORY_CHILDS", direction = Direction.INCOMING)
	private Set<AbstractCategory> childs = new HashSet<AbstractCategory>();

	public Set<AbstractCategory> getChilds() {
		return childs;
	}

	public void setChilds(Set<AbstractCategory> childs) {
		this.childs = childs;
	}

	public void addChildren(AbstractCategory ac){
		this.childs.add(ac);
	}
}
