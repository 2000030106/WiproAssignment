package com.daofiles;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootprograms.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>
{

}
