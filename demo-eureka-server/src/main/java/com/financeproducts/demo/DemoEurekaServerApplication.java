package com.financeproducts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaServerApplication.class, args);
	}

}
