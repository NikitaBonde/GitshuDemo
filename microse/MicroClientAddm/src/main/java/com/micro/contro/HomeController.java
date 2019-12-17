package com.micro.contro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/getdada")
	public String log()
	{
		return "WELCOME";
	}

}
