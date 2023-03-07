package com.micro.rating.service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "rating")
public class Rating {

	@Id
	@Column(name = "ratingId")
	private String ratingId;
	
	@Column(name = "userId")
	private String userId;
	
	@Column(name = "hotelId")
	private String hotelId;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name = "feedback")
	private String feedback;
	
	
}
