package com.java.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoProgram8List {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Kamlesh");
		names.add("Survesh");
		names.add("Paresh");
		names.add("Naresh");
		
		names.forEach(System.out::println);
		System.out.println("++++++++++++++++++");
		names.forEach(name -> print(name));

	}
	
	private static void print(String str){
		System.out.println("Hello "+str);
	}
	
	
	
}
