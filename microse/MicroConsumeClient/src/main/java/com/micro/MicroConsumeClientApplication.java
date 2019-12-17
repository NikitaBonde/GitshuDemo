package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class MicroConsumeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroConsumeClientApplication.class, args);
	}
	@Bean
	public RestTemplate rtemp()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
