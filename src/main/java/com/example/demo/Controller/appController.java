package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController
{
	@GetMapping("/test")
	public String index()
	{
		return "test";
	}

}
