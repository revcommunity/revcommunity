package org.revcommunity.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.security.core.GrantedAuthority;

@NodeEntity
public class Role implements GrantedAuthority {

	@GraphId
    private Long nodeId;
	
	private String role;
	
	public Role() {
	}
	
	public Role(String role) {
		this.role = role;
	}

	public String getAuthority() {
		return this.role;
	}

}
