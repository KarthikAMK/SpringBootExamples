package com.websystique.SpringBootRestApiExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages= {"com.websystique.SpringBootRestApiExample"})
public class SpringBootRestApiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SpringBootRestApiExampleApplication.class, args);
		
		
		for (String str : ctx.getBeanDefinitionNames()) {
			System.out.println(str);
		}
		
		
	}
}
