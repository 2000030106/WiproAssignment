package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.Restaurant;
import com.pojo.RestaurantClient;

@RestController
@RequestMapping("/consumer")

public class RestaurantConsumerController 
{
	  @Autowired
	    private RestaurantClient restaurantClient;

	    @GetMapping("/restaurants")
	    public List<Restaurant> getAllRestaurants() {
	        return restaurantClient.getRestaurants();
	    }

}
