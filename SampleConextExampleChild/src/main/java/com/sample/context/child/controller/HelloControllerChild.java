package com.sample.context.child.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerChild {

	//Default method for GET request, otherwise explicitly mention it
	//http://localhost:7070/hello
	@RequestMapping("/hello6")
	public String sayHi6() {
		return "Hi6";

	}

}
