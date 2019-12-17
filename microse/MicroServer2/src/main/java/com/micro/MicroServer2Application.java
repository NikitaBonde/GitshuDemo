package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicroServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServer2Application.class, args);
	}

}
