package com.micro.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConsumeApplication.class, args);
	}
	
    @LoadBalanced
	@Bean
	public RestTemplate rest()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
	}

}
