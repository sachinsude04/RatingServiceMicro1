package com.micro.rating.service.services;

import com.micro.rating.service.entities.Rating;
import java.util.List;

import org.springframework.stereotype.Service;


public interface RatingService {

	
	//create
	Rating create(Rating rating);
	
	//get all raitings
	List<Rating> getAllRating();
	
	//get all by userId
	
	List<Rating> getRatingByUserId(String userId);
	
	//get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);
	
	
	
}
