package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CourseApiApplication {

	public static void main(String[] args) {
		System.out.println("+++ Hello Inside CourseApiApplication");
		SpringApplication.run(CourseApiApplication.class, args);
				
		/*SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder()
				.sources(CourseApiApplication.class);
		applicationBuilder.child(CourseApiDataApplication.class);
		//applicationBuilder.child(childApplication2);
		applicationBuilder.run(args);*/
		
	}
}
