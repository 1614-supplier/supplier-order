package com.supplier.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SupplierOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierOrderApplication.class, args);
	}
}
