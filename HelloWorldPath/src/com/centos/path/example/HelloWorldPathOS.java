package com.centos.path.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HelloWorldPathOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Jyotirmoy3");
		
		//String filename = "testing.txt";
		String filename = "general.properties";
		String workingDir = System.getProperty("user.dir");
		
		Properties prop = new Properties();
		InputStream input = null;
		
		System.out.println(" Path: "+workingDir);
		
		String absoluteFilePath = "";
		
		//****************//
			
		String your_os = System.getProperty("os.name").toLowerCase();
			
		if (your_os.indexOf("win") >= 0) {
				
			//if windows
			absoluteFilePath = workingDir + "\\" + filename;
			System.out.println("Windows OS");
				
		} else if (your_os.indexOf("nix") >= 0 || 
                           your_os.indexOf("nux") >= 0 || 
                           your_os.indexOf("mac") >= 0) {
				
			//if unix or mac 
			absoluteFilePath = workingDir + "/" +"AutomationJarAndProp"+"/"+ filename;
			System.out.println(" UNIX or Mac OS");
				
		}else{
				
			//unknow os?
			absoluteFilePath = workingDir + "/" + filename;
			System.out.println(" Not Identified OS");
			
				
		}

		System.out.println("Final filepath : " + absoluteFilePath);
		
		try{
			
			input = new FileInputStream(absoluteFilePath);
    		if(input==null){
    	            System.out.println("Sorry, unable to find " + filename);
    		    return;
    		}

    		//load a properties file from class path, inside static method
    		prop.load(input);
 
                //get the property value and print it out
                System.out.println(prop.getProperty("host"));
    	        System.out.println(prop.getProperty("port"));
    	        System.out.println(prop.getProperty("protocol"));
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		

	}

}
