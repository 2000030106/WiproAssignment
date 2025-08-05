package com.servicefiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daofiles.FoodRepository;
import com.daofiles.RestaurantRepository;
import com.exception.ResourceNotFoundException;
import com.springbootprograms.Food;
import com.springbootprograms.Restaurant;

@Service
public class RestaurantService 
{
	 @Autowired
	    private RestaurantRepository restaurantRepository;

	    @Autowired
	    private FoodRepository foodRepository;

	    
	    public Restaurant createRestaurant(Restaurant restaurant) {
	        return restaurantRepository.save(restaurant);
	    }

	    public List<Restaurant> getAllRestaurants() {
	        return restaurantRepository.findAll();
	    }

	    public Restaurant getRestaurantById(int id) {
	        return restaurantRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
	    }

	    public void deleteRestaurant(int id) {
	        Restaurant res = getRestaurantById(id);
	        restaurantRepository.delete(res);
	    }
	    
	    public Food addFoodToRestaurant(int restaurantId, Food food) {
	        Restaurant restaurant = getRestaurantById(restaurantId);
	        food.setRestaurant(restaurant);
	        return foodRepository.save(food);
	    }

	    public void deleteFoodById(int foodId) {
	        Food food = foodRepository.findById(foodId)
	                .orElseThrow(() -> new ResourceNotFoundException("Food not found with id: " + foodId));
	        foodRepository.delete(food);
	    }
	    
	    
}
