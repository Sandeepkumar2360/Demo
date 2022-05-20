package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootCoreApplication.class, args);
	BulbService bulbService =ctx.getBean(BulbService.class);
	System.out.println(bulbService.askBulb());
	}

}
