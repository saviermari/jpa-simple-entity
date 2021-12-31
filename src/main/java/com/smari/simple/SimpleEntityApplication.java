package com.smari.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This example demonstrate the basic CRUD operations on standalone entity, this does not cover unit testing and exception handling.
 * Please the attribute partNumber is required and unique.
 * @author smari
 */
@SpringBootApplication
public class SimpleEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleEntityApplication.class, args);
	}

}
