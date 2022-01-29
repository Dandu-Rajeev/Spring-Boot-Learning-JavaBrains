package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//static method to run the spring boot application
		SpringApplication.run(CourseApiApp.class, args);
		

	}

}

/***
 * Spring Boot Application does the following when run:
 * 1. Sets up the configuration.
 * 2. Creates the Spring Context (container)
 * 3. Does the component scan
 * 4. Runs the Tomcat server 
*/