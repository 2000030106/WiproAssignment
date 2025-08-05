package com.controllerfiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicefiles.GroceryItemService;
import com.springbootprograms.GroceryItem;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/items")
public class GroceryItemController 
{
	
	@Autowired
    private GroceryItemService service;

    @PostMapping
    public ResponseEntity<GroceryItem> createItem(@Valid @RequestBody GroceryItem item) {
        return new ResponseEntity<>(service.saveItem(item), HttpStatus.CREATED);
    }

    @GetMapping
    public List<GroceryItem> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public GroceryItem getItem(@PathVariable int id) {
        return service.getItemById(id);
    }

    @PutMapping("/{id}")
    public GroceryItem updateItem(@PathVariable int id, @Valid @RequestBody GroceryItem item) {
        return service.updateItem(id, item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable int id) {
        service.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
	
}
