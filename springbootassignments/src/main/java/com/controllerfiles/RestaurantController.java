package com.controllerfiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicefiles.RestaurantService;
import com.springbootprograms.Food;
import com.springbootprograms.Restaurant;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/restaurants")

public class RestaurantController {

	@Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public Restaurant createRestaurant(@Valid @RequestBody Restaurant restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurant(@PathVariable int id) {
        return restaurantService.getRestaurantById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRestaurant(@PathVariable int id) {
        restaurantService.deleteRestaurant(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/foods")
    public Food addFoodToRestaurant(@PathVariable int id, @Valid @RequestBody Food food) {
        return restaurantService.addFoodToRestaurant(id, food);
    }

    @DeleteMapping("/foods/{foodId}")
    public ResponseEntity<?> deleteFood(@PathVariable int foodId) {
        restaurantService.deleteFoodById(foodId);
        return ResponseEntity.ok().build();
    }
	
}
