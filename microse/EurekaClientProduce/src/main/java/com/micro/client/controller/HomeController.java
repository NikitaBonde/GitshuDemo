package com.micro.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.client.model.student;

@RestController
public class HomeController {
	
	@RequestMapping("/getdata")
	public List login()
	{
		List al=new ArrayList();
		
		student s=new student();
		s.setRollno(1);
		s.setName("Nikita");
		s.setUsername("nikki");
		s.setPassword("nikki");
		
		al.add(s);
		
		return al;
		
	}

}
