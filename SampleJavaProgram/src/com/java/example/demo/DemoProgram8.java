package com.java.example.demo;

import com.java.example.demo.api.GreetingService;
import com.java.example.demo.api.MathOperation;

public class DemoProgram8 {

	public static void main(String[] args) {
	 
		DemoProgram8 tester = new DemoProgram8();
		
		MathOperation addition = (int a, int b) -> a+b;
		
		MathOperation substraction = (a,b)->a-b;
		
		MathOperation multiplication = (int a, int b) -> {return  a*b;};
		
		MathOperation division = (int a, int b)-> a/b;
		
	  System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
      System.out.println("10 - 5 = " + tester.operate(10, 5, substraction));
      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
      
      System.out.println("++ Test : "+addition.operation(10, 15));
      
      //without parenthesis
      GreetingService greetService1 = message -> System.out.println("Hello " + message);
		
      //with parenthesis
      GreetingService greetService2 = (message) -> System.out.println("Hello1 " + message);
      
      greetService1.sayMessage("Jyotirmoy");
      greetService2.sayMessage("Jyotirmoy Sarmah");

	}
	
	/*interface MathOperation{
		
		 int operation(int a, int b);
	}
	
	interface GreetingService {
	      void sayMessage(String message);
	   }*/
		
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	
	

}
