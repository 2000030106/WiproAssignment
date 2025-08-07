package com.springsecurity.SpringSecurityTask.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.SpringSecurityTask.entity.GroceryItem;
import com.springsecurity.SpringSecurityTask.entity.Order;

@RestController
@RequestMapping("/grocery")
public class GroceryController {
	@GetMapping("/public")
    public String publicEndpoint() {
        return "Welcome to Grocery Store API (Public Endpoint)";
    }

    @GetMapping("/items")
    public List<GroceryItem> getGroceryItems() {
        return Arrays.asList(
                new GroceryItem("Apple", 50),
                new GroceryItem("Milk", 30),
                new GroceryItem("Bread", 25)
        );
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return Arrays.asList(
                new Order("Order1", "Apple", 2),
                new Order("Order2", "Milk", 1)
        );
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin-only")
    public String adminEndpoint() {
        return "This is an admin-only endpoint.";
    }

}
