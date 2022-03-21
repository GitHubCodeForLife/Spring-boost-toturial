package com.mongodb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.naming.Context;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(DemoApplication.class, args);

		GroceryService groceryService = ctx.getBean(GroceryService.class);
		//groceryService.createGroceryItems();
		groceryService.showAllGroceryItems();
	}

}
