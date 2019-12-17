package com.micro1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroClientApplication.class, args);
	}

}
