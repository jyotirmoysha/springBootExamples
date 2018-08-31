package com.sample.context.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	//Default method for GET request, otherwise explicitly mention it
	//http://localhost:7070/hello
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi5";

	}

}
