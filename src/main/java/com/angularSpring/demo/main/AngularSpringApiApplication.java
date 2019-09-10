package com.angularSpring.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan (basePackages = {"com.angularSpring.demo"})
@EntityScan ("com.angularSpring.demo.entity")
@EnableJpaRepositories ("com.angularSpring.demo.repository")
public class AngularSpringApiApplication {
	
	public static void main (String [] args) {
		
		SpringApplication.run(AngularSpringApiApplication.class, args);
	}

}
