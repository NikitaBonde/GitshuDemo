package com.micro.controllr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rtemp;
	
	@RequestMapping("/pro")
	public List pre()
	{
		String url="http://localhost:8087/consum";
		List al=rtemp.getForObject(url, List.class);
		return al;
	}

}
