package com.controller.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloControllerChild2 {

	//Default method for GET request, otherwise explicitly mention it
	//http://localhost:7070/hello
	@RequestMapping("/hello7")
	public String sayHi7() {
		return "Hi7";

	}

}
