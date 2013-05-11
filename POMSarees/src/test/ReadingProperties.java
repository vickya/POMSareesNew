package test;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingProperties {
	
	public static void main (String [] args){
		
		// To read the properties file, create an object of properties which is an inbuilt class in Java
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\com\\online\\sarees\\config\\Config.properties";
		System.out.println(System.getProperty("user.dir"));
		System.out.println(path);

		
		// Create an object for the FileInputStream which is also an in built class in Java
		// With the help of FileInputStream object, we can connect to the file
		try{
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		// In the property object load fs 
		// fs is pointing towards the path in the FileInputStream and load everything into prop. 
		}catch(Exception e){
			return;
		}
		
		System.out.println(System.getProperty("testSiteLandingPageURL"));
		System.out.println(System.getProperty("defaultUserName"));
	}	

}
