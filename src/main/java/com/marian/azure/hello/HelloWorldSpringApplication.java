package com.marian.azure.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldSpringApplication {

	@GetMapping("/hello")
	public String helloMessage() {
		return "Hello world Success in Azure!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringApplication.class, args);
	}

}
