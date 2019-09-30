package com.pravin.logback.main1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.pravin"})
public class SpringBootLogbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLogbackApplication.class, args);
	}
}
