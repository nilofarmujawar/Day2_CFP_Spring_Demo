package com.example.cfpday2;

/**
 * import classes
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1) @SpringBootApplication :-
 *                The @SpringBootApplication annotation is a convenience annotation that combines the @EnableAutoConfiguration,
 *                @Configuration and the @ComponentScan annotations in a Spring Boot application.
 *                These annotations do the following: @EnableAutoConfiguration – This enables Spring Boot's autoconfiguration mechanism.
 */

@SpringBootApplication
/**
 * create a class name as SpringDemoApplication
 */
public class SpringDemoApplication {

	/**
	 * create a main method,all program execute in main method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello From Bridgelabz..!");
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
