package com.micro3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroClient2Application.class, args);
	}

}
