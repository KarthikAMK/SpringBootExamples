package com.websystique.SpringBootStandAlone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.websystique.SpringBootStandAlone"})
public class SpringBootStandAloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStandAloneApplication.class, args);
		
	}
}
