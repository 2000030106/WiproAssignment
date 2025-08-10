package com.KafkaUberConsumer.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KafkaUberConsumer.entity.Ride;
import com.KafkaUberConsumer.repository.UberRepository;

@RestController
@RequestMapping("/rides")
public class UberRideController {

	
	
	 private final UberRepository repository;

	    public UberRideController(UberRepository repository) {
	        this.repository = repository;
	    }

	    @GetMapping
	    public List<Ride> getAll() {
	        return repository.findAll();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Ride> getById(@PathVariable int id) {
	        return repository.findById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }
}
