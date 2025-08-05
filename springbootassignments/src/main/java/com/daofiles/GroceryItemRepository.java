package com.daofiles;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootprograms.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Integer>
{

}
