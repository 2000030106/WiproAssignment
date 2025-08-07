package com.springbootgroceryitemtesting.SpringBootGroceryItemCrudTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootgroceryitemtesting.SpringBootGroceryItemCrudTesting.entity.GroceryItem;


public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {

}
