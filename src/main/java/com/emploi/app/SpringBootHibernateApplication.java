package com.emploi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.emploi")
public class SpringBootHibernateApplication {
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootHibernateApplication.class, args);   
	}
}
