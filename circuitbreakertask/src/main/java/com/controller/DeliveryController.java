package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/order")
public class DeliveryController 
{
	 @Autowired
	    private RestTemplate restTemplate;
	 
	 @GetMapping("/check")
	    @CircuitBreaker(name = "deliveryService", fallbackMethod = "fallbackDeliveryStatus")
	    public String checkDeliveryStatus() {
	        return restTemplate.getForObject("http://localhost:8081/delivery/status", String.class);
	    }

	    public String fallbackDeliveryStatus(Throwable t) {
	        return "Delivery service is currently unavailable. Please try again later.";
	    }

}
