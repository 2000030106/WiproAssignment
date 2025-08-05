package com.springboot.WiproSpringbootConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.pojo")
@ComponentScan(basePackages= {"com"})

public class WiproSpringbootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiproSpringbootConsumerApplication.class, args);
	}

}
