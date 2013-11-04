package org.revcommunity.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Product {
	@GraphId
	private Long nodeId;

	private String name;

	private String producer;

	private String productCode;

	private String description;

	private Long shopCount;
	
	private Long offerCount;
	
	private String priceMin;
	
	private String priceMax;
	
	private String priceAvg;
	
	private String url;
	
	private String imageMini;
	
	private String imageMedium;
	
	private String imageLarge;
	
	private String thumbnail;
	
	private List<String> images;

	private Long id;
	
	private String image;
	
	private Category category;

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getImages() {
		if (images == null)
			images = new ArrayList<String>();
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public void addImage(String image) {
		if (getImages().isEmpty())
			setImage(image);
		getImages().add(image);
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getShopCount() {
		return shopCount;
	}

	public void setShopCount(Long shopCount) {
		this.shopCount = shopCount;
	}

	public Long getOfferCount() {
		return offerCount;
	}

	public void setOfferCount(Long offerCount) {
		this.offerCount = offerCount;
	}

	public String getPriceMin() {
		return priceMin;
	}

	public void setPriceMin(String priceMin) {
		this.priceMin = priceMin;
	}

	public String getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(String priceMax) {
		this.priceMax = priceMax;
	}

	public String getPriceAvg() {
		return priceAvg;
	}

	public void setPriceAvg(String priceAvg) {
		this.priceAvg = priceAvg;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImageMini() {
		return imageMini;
	}

	public void setImageMini(String imageMini) {
		this.imageMini = imageMini;
	}

	public String getImageMedium() {
		return imageMedium;
	}

	public void setImageMedium(String imageMedium) {
		this.imageMedium = imageMedium;
	}

	public String getImageLarge() {
		return imageLarge;
	}

	public void setImageLarge(String imageLarge) {
		this.imageLarge = imageLarge;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [nodeId=" + nodeId + ", name=" + name + ", producer="
				+ producer + ", productCode=" + productCode + ", description="
				+ description + ", shopCount=" + shopCount + ", offerCount="
				+ offerCount + ", priceMin=" + priceMin + ", priceMax="
				+ priceMax + ", priceAvg=" + priceAvg + ", url=" + url
				+ ", imageMini=" + imageMini + ", imageMedium=" + imageMedium
				+ ", imageLarge=" + imageLarge + ", thumbnail=" + thumbnail
				+ ", images=" + images + ", id=" + id + ", image=" + image
				+ ", category=" + category + "]";
	}
	
	
	
}
