package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo","in.ashokit"})
public class Application {

	public static void main(String[] args) {
		//ConfigurableApplicationContext ctxt=
		SpringApplication.run(Application.class, args);
		
		//System.out.println(ctxt.getClass().getName());
	}

}
