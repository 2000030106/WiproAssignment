package com.springbootmainfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springbootprograms.ClassKLM;
import com.springbootprograms.PropertySample;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.springbootmainfiles",
    "com.springbootprograms",
    "com.controllerfiles",
    "com.daofiles",
    "com.servicefiles",
    "com.exception",
    "com.testfiles"
})
@EnableJpaRepositories(basePackages = "com.daofiles")
@EntityScan(basePackages = "com.springbootprograms")
public class SpringBootMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con1=SpringApplication.run(SpringBootMain.class,args);
		ClassKLM klm = con1.getBean(ClassKLM.class);
		klm.pqr.display();
		
		PropertySample ps = con1.getBean(PropertySample.class);
		ps.displayvalues();
	}

}

/*
 * http://localhost:8088/wiproassignments/swagger-ui.html
 * http://localhost:8088/wiproassignments/swagger-ui/index.html

 */


/*
http://localhost:8088/wiproassignments/actuator/health

http://localhost:8088/wiproassignments/actuator/info

http://localhost:8088/wiproassignments/actuator/beans

http://localhost:8088/wiproassignments/actuator/mappings

http://localhost:8088/wiproassignments/actuator/env

http://localhost:8088/wiproassignments/actuator/metrics
*/