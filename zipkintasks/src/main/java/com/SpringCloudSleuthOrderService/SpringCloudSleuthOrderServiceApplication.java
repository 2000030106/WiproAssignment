package com.SpringCloudSleuthOrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCloudSleuthOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSleuthOrderServiceApplication.class, args);
	}

	 @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
}

