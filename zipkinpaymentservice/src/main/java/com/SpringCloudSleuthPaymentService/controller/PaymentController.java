package com.SpringCloudSleuthPaymentService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @GetMapping("/payment")
    public String payment() {
        return "Payment service called.";
    }
}
