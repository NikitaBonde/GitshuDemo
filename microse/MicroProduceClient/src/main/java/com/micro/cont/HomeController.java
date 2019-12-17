package com.micro.cont;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.model.Student;



@RestController
public class HomeController {
	@RequestMapping("/consum")
	public List log()
	{
		List l=new ArrayList();
		Student s=new Student();
		s.setName("Nikita");
		s.setAddr("abc");
		l.add(s);
		return l;
	}
}
