package com.micro.client3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy

@SpringBootApplication
public class ZuuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuuleApplication.class, args);
	}

}
