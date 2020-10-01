package com.demo.financeproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoEurekaFinanceproductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaFinanceproductsServiceApplication.class, args);
	}

}
