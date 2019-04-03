package org.arb_tech.entity;

public class CatalogItem {
	private String name;
	private String description;
	private Integer rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public CatalogItem(String name, String description, Integer rating) {
		super();
		this.name = name;
		this.description = description;
		this.rating = rating;
	}

}
