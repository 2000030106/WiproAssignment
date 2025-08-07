package com.SpringCloudSleuthOrderService.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class OrderController {

    

    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/order")
    public String placeOrder() {
        String paymentResponse = restTemplate.getForObject("http://localhost:9444/payment", String.class);
        return "Order placed successfully. " + paymentResponse;
    }
}
