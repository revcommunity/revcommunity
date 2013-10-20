package org.revcommunity.model;

public class ReviewRating {
	private Long nodeId;
	private Boolean positive;
	public Long getNodeId() {
		return nodeId;
	}
	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}
	public Boolean getPositive() {
		return positive;
	}
	public void setPositive(Boolean positive) {
		this.positive = positive;
	}
}
