package org.arb_tech.entity;

import java.util.List;
/**
 * The View Layer Object for user Ratings 
 * @author Aniket Bharsakale
 */
public class UserRatingVO {
	private List<Rating> userRating;

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

}
