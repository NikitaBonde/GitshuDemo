package com.micro5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroClient3Application.class, args);
	}

}
