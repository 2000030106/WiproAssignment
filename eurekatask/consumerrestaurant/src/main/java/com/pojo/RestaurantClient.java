package com.pojo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WiproSpringbootProducer")

public interface RestaurantClient {

	@GetMapping("/restaurants")
    List<Restaurant> getRestaurants();
	
}
