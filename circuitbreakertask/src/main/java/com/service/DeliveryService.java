package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class DeliveryService {
	

	    @Autowired
	    private RestTemplate restTemplate;

	    @CircuitBreaker(name = "deliveryService", fallbackMethod = "fallbackDeliveryStatus")
	    public String getDeliveryStatus() {
	        return restTemplate.getForObject("http://localhost:8081/delivery/status", String.class);
	    }

	    public String fallbackDeliveryStatus(Exception e) {
	        return "Delivery service unavailable!";
	    }
	}
