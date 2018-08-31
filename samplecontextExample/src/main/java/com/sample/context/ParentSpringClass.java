/**
 * 
 */
package com.sample.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.sample.context.child.ChildSpringClass;
import com.spring.child2.Child2SpringClass;


/**
 * @author js0e1608
 *
 */
@SpringBootApplication
public class ParentSpringClass {
	
	public static void main(String[] args) {
		System.out.println("+++ Hello Inside ParentSpringClass 1");
		//SpringApplication.run(ParentSpringClass.class, args);
				
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder()
				.sources(ParentSpringClass.class);
		applicationBuilder.child(ChildSpringClass.class);
				
		//SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder()
		//		.sources(ParentSpringClass.class);
		//applicationBuilder.child(Child2SpringClass.class).sibling(ChildSpringClass.class);
		//applicationBuilder.child(ChildSpringClass.class).sibling(Child2SpringClass.class);
		//applicationBuilder.parent(ParentSpringClass.class).child(Child2SpringClass.class);
		//applicationBuilder.parent(ParentSpringClass.class).sibling(Child2SpringClass.class, ChildSpringClass.class);
		//applicationBuilder.sibling(ChildSpringClass.class,Child2SpringClass.class);
		
		//applicationBuilder.parent(ParentSpringClass.class)
		//applicationBuilder.child(Child2SpringClass.class).web(true);
		//.sibling(ChildSpringClass.class);
		//applicationBuilder.sibling(Child2SpringClass.class);
		
		//applicationBuilder.child(CourseApiApplication.class);
		//applicationBuilder.child(CourseApiDataApplication.class);
		//applicationBuilder.sibling(CourseApiDataApplication.class) ;
		//applicationBuilder.child(childApplication2);
		//applicationBuilder.sibling(childApplication2);
		//applicationBuilder.run(args);
		
		ConfigurableApplicationContext applicationContext  = applicationBuilder.run(args);
				
		System.out.println("++++++++"+applicationContext.getApplicationName());
		System.out.println("++++++++"+applicationContext.getBeanDefinitionCount());
		System.out.println("++++++++"+applicationContext.getAutowireCapableBeanFactory());
		System.out.println("++++++++"+applicationContext.getBeansWithAnnotation(RestController.class));
		System.out.println("++++++++"+applicationContext.getBeansWithAnnotation(Controller.class));
		System.out.println("++++++++"+applicationContext.getParentBeanFactory());
		System.out.println("++++++++"+applicationContext.getParent());
		//System.out.println("++++++++"+applicationContext.getBean(TopicController.class).getAllTopics());
		
		//SpringApplication.run(ParentSpringClass.class, args);
		
		
		//ClassPathBeanDefinitionScanner
		//AnnotationConfigApplicationContext
	}

}
