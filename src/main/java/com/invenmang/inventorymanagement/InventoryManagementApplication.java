package com.invenmang.inventorymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.invenmang.inventorymanagement")
//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableMongoRepositories(basePackages =
//	      "com.invenmang.inventorymanagement.dao.repository")
public class InventoryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementApplication.class, args);
	}

}
