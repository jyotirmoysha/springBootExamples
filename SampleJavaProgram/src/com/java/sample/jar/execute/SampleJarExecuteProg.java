package com.java.sample.jar.execute;

import java.io.IOException;
import java.io.InputStream;

public class SampleJarExecuteProg {

	public static void main(String[] args) throws IOException, InterruptedException {
				
		/*ProcessBuilder pb = new ProcessBuilder("/com/java/sample/program", "-jar", "HelloWorldMain.jar");
		pb.directory(new File("C:/Users/js0e1608/Desktop/Rough/jar"));
		Process p = pb.start();*/
		
		// Option 1
		Process proc = Runtime.getRuntime().exec("java -jar C:/Users/js0e1608/Desktop/Rough/jar/HelloWorldMain.jar");
	    proc.waitFor();
	    // Then retreive the process output
	    InputStream in = proc.getInputStream();
	    InputStream err = proc.getErrorStream();

	    byte b[]=new byte[in.available()];
	    in.read(b,0,b.length);
	    System.out.println(new String(b));

	    byte c[]=new byte[err.available()];
	    err.read(c,0,c.length);
	    System.out.println(new String(c));
	    
	    //Option 2
	    
	   /* String filePath = "C:/Users/js0e1608/Desktop/Rough/jar/HelloWorldMain.jar"; //where your jar is located.
	    Runtime.exec(" java -jar " + filePath);
	   */ 

	}

}
