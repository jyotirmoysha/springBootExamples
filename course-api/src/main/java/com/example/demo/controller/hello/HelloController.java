package com.example.demo.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//Default method for GET request, otherwise explicitly mention it
	//http://localhost:7070/hello
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi1";

	}

}
