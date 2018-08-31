package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import com.sample.context.child.ChildSpringClass;

@SpringBootApplication
public class SpringDevToolsDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringDevToolsDemoApplication.class, args);
		
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder()
				.sources(SpringDevToolsDemoApplication.class).child(ChildSpringClass.class);
		
		ConfigurableApplicationContext applicationContext  = applicationBuilder.run(args);
				
		//System.out.println("++++++++"+applicationContext.getApplicationName());
		System.out.println("++++++++"+applicationContext.getBeanDefinitionCount());
		System.out.println("++++++++"+applicationContext.getAutowireCapableBeanFactory());
		//System.out.println("++++++++"+applicationContext.getBeansWithAnnotation(RestController.class));
		System.out.println("++++++++"+applicationContext.getBeansWithAnnotation(Controller.class));
		
	}
}
