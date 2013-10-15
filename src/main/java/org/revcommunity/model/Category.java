package org.revcommunity.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Category {
	@GraphId
	private Long id;

	private String name;

	private Long idParentCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdParentCategory() {
		return idParentCategory;
	}

	public void setIdParentCategory(Long idParentCategory) {
		this.idParentCategory = idParentCategory;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", idParentCategory="
				+ idParentCategory + "]";
	}

}
