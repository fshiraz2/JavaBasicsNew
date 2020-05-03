package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
		
		String file=System.getProperty("user.dir")+"/configs/configuration.propertie";
		
		try {
			
			FileInputStream fis=new FileInputStream(file);// new FileNotFoundException();
			fis.close();//stream is closed,IO will get Executed
			
			Properties prop=new Properties();
			prop.load(fis);//new IOException();
			
		} catch (IOException e) {//IO exception is child of exception
			e.printStackTrace();
		} catch (Exception e) {//exception is parent, you can handle all of these with exception
			e.printStackTrace();
		} 

		System.out.println(" ---------- END OF THE PROGRAM ----------");
	}
}
