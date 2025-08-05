package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.Restaurant;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController
{
	
	@GetMapping
    public List<Restaurant> getRestaurants() {
        return List.of(
            new Restaurant(1, "Food Plaza", "Hyderabad"),
            new Restaurant(2, "Biryani House", "Chennai")
        );
    }
	

}
