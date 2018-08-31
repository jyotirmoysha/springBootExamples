package com.sample.context.child.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllersChild66 {

	//Default method for GET request, otherwise explicitly mention it
	//http://localhost:7070/hello
	@RequestMapping("/hello66")
	public String sayHi66() {
		return "Hi66";

	}

}
