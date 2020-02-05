package org.arb_tech.entity;

/**
 * Movie entity class 
 * @author Aniket Bharsakale
 */
public class Movie {
	private String id;
	private String name;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public Movie(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

}
