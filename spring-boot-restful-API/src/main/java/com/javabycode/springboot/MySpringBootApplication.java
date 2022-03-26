package com.javabycode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = {"com.javabycode.springboot"})
// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class MySpringBootApplication extends SpringBootServletInitializer
{

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
