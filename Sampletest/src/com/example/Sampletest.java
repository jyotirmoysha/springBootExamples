package com.example;

public class Sampletest {
	
	public String hello(Object h){
		return "A";
	}
	
public String hello(String h){
	return "B";
	}
   public static void main(String args[]){
	   System.out.println((new Sampletest()).hello(null));
   }

}
