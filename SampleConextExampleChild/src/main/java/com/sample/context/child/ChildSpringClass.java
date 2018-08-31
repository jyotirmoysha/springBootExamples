package com.sample.context.child;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:/child1.properties")
public class ChildSpringClass {

	public static void main(String[] args) {
		System.out.println("+++ Hello Inside ChildSpringClass");
		SpringApplication.run(ChildSpringClass.class, args);
				
		/*SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder()
				.sources(CourseApiApplication.class);
		applicationBuilder.child(CourseApiDataApplication.class);
		//applicationBuilder.child(childApplication2);
		applicationBuilder.run(args);*/
		
	}
	
	/* @Bean
	    public ChildBean1 childBean(RootBean rootBean, @Value("${root.property}") String someProperty) {
	        return new ChildBean1(rootBean, someProperty);
	    }
	*/

}
