package com.springboot.WiproEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WiproEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiproEurekaServerApplication.class, args);
	}

}
