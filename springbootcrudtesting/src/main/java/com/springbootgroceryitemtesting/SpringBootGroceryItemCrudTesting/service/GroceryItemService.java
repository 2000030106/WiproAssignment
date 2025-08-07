package com.springbootgroceryitemtesting.SpringBootGroceryItemCrudTesting.service;

import java.util.List;

import com.springbootgroceryitemtesting.SpringBootGroceryItemCrudTesting.entity.GroceryItem;


public interface GroceryItemService {

	 GroceryItem save(GroceryItem item);
	    List<GroceryItem> findAll();
	    GroceryItem findById(Long id);
	    GroceryItem update(Long id, GroceryItem item);
	    void delete(Long id);
}
