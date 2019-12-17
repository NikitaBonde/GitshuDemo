package com.micro.client1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rest;
	
	
	@RequestMapping("/get")
	public List m1()
	{
		String url="http://zuul/getpro/getdata";
		//String url="http://zuul/getproduce/getdata";
		List l=rest.getForObject(url,List.class);
		return l;
	}

}
