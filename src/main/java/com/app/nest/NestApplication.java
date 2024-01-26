package com.app.nest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.app.nest")
public class NestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NestApplication.class, args);
	}

}
