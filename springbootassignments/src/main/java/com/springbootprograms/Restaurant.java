package com.springbootprograms;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity

public class Restaurant 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Restaurant name must not be blank")
    private String name;

    @NotBlank(message = "Location must not be blank")
    private String location;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    @com.fasterxml.jackson.annotation.JsonManagedReference

    private List<Food> foodItems;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Food> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<Food> foodItems) {
		this.foodItems = foodItems;
	}

    
    

}
