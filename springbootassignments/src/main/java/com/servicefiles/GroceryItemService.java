package com.servicefiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daofiles.GroceryItemRepository;
import com.exception.ResourceNotFoundException;
import com.springbootprograms.GroceryItem;

@Service
public class GroceryItemService {

	@Autowired
    private GroceryItemRepository repository;

    public GroceryItem saveItem(GroceryItem item) {
        return repository.save(item);
    }
    
    public List<GroceryItem> getAllItems() {
        return repository.findAll();
    }

    public GroceryItem getItemById(int id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Item not found"));
    }

    public GroceryItem updateItem(int id, GroceryItem updatedItem) {
        GroceryItem item = getItemById(id);
        item.setName(updatedItem.getName());
        item.setQuantity(updatedItem.getQuantity());
        item.setPrice(updatedItem.getPrice());
        return repository.save(item);
    }

    public void deleteItem(int id) {
        repository.deleteById(id);
    }
}
