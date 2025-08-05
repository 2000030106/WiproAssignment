package com.daofiles;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootprograms.Food;

public interface FoodRepository extends JpaRepository<Food,Integer>
{

}
