package com.micro5.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro5.model.Student;

@RestController
public class HomeController {
	@RequestMapping("/getdata")
public java.util.List<Student> login()
{
	java.util.List<Student> i=new ArrayList<Student>();
		
		
	Student s=new Student();
	s.setRollno(1);
	s.setName("niki");
	s.setAdd("c");
		i.add(s);
	return i;
	
		

}
	

}
