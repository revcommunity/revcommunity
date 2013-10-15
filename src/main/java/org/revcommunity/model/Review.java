package org.revcommunity.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Review {          

	public Review(){
	}
	
	@GraphId
	private Long id;

	@Indexed
	private String content;

	private Integer usefulness;

	private Integer rank;
    
	//TODO: replace with link to existing user
	private String authorName;
	
	//TODO: replace with link to existing product
	private Long productId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getUsefulness() {
		return usefulness;
	}

	public void setUsefulness(Integer usefulness) {
		this.usefulness = usefulness;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	


}
