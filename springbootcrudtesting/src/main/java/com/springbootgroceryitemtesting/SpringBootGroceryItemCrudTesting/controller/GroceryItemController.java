package com.springbootgroceryitemtesting.SpringBootGroceryItemCrudTesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootgroceryitemtesting.SpringBootGroceryItemCrudTesting.entity.GroceryItem;
import com.springbootgroceryitemtesting.SpringBootGroceryItemCrudTesting.service.GroceryItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/grocery")
public class GroceryItemController 
{
	 @Autowired
	    private GroceryItemService service;

	    @PostMapping
	    public GroceryItem addItem(@Valid @RequestBody GroceryItem item) {
	        return service.save(item);
	    }
//	    @PostMapping("/add")
//	    public GroceryItem addItem(@RequestBody GroceryItem item) {
//	        return service.save(item);
//	    }

	    @GetMapping
	    public List<GroceryItem> getAllItems() {
	        return service.findAll();
	    }

	    @GetMapping("/{id}")
	    public GroceryItem getItem(@PathVariable Long id) {
	        return service.findById(id);
	    }

	    @PutMapping("/{id}")
	    public GroceryItem updateItem(@PathVariable Long id, @Valid @RequestBody GroceryItem item) {
	        return service.update(id, item);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteItem(@PathVariable Long id) {
	        service.delete(id);
	    }

}
