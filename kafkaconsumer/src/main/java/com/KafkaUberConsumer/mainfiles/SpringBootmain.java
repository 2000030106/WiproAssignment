package com.KafkaUberConsumer.mainfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.KafkaUberConsumer")
@EnableJpaRepositories(basePackages = "com.KafkaUberConsumer.repository")
@EntityScan("com.KafkaUberConsumer.entity")
public class SpringBootmain {

	public static void main(String[] args) {
	      SpringApplication.run(SpringBootmain.class, args);

	}
}
