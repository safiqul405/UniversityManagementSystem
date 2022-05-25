package com.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.main")
@EntityScan( basePackages = {"com.spring.main"} )
public class UniversityManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityManagementSystemApplication.class, args);
	}

}
