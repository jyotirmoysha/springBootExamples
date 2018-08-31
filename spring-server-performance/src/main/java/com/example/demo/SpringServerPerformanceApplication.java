package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringServerPerformanceApplication {

	public static void main(String[] args) {
		System.out.println("+++++++++++++++ Hello");
		SpringApplication.run(SpringServerPerformanceApplication.class, args);
	}
}
