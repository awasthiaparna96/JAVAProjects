package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//because we are working with urls
public class AppConfiguration {
	
@RequestMapping("/hello")
public String hello() {
	return "Hello World!!";
	
}
}
