package com.online.sarees.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.online.sarees.pages.TopMenu;

public class Page {
	
	public static WebDriver driver = null;
	public static Properties CONFIG = null;
	public static Properties OR = null;
//	public static Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"//src//com//online//sarees//xls//TestCases.xlsx");
	public static TopMenu topMenu = new TopMenu();
	public static boolean isLoggedIn;
	
	public Page(){
		System.out.println("xxxxxxxxx");
		if (driver == null){
			// when driver is initialising, we will first initialize the properties file
			CONFIG = new Properties();
			OR = new Properties();
			
			try{
				// Loading CONFIG properties file. 
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\online\\sarees\\config\\Config.properties");
				CONFIG.load(fs);
				
				// Loading OR properties file.
				fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\online\\sarees\\config\\OR.properties");
				OR.load(fs);
			}catch(Exception e){
				return;
			}
		
		System.out.println(CONFIG.getProperty("browser"));
		if (CONFIG.getProperty("browser").equals("Mozilla"))
		{
			this.driver = new FirefoxDriver();
		}
		else if (CONFIG.getProperty("browser").equals("IE")){
			this.driver = new InternetExplorerDriver();
		}
		else if (CONFIG.getProperty("browser").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
			this.driver = new ChromeDriver();
		}
		
		// Implicit wait for whole application
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		topMenu = new TopMenu();
		}
		
		}
	
	

	// On a page we can do the following in 
	// The below functions can be used to click the links and input the data into the text 
		// We can call the functions where ever we want to click or input.  
	
		// Click
	public void click(String xpathKey){
		try{
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).click();
		}catch(Exception e){
			
		}
	}
		// Input
	public void input(String xpathKey, String text){
		try{
			driver.findElement(By.xpath(OR.getProperty(xpathKey))).sendKeys(text);
		}catch(Exception e){
			e.printStackTrace();
		}
			
		}
		
	// To clear the text box before typing in again in the text box. 
	public void clear(String xpathKey){
		try{
			driver.findElement(By.xpath(OR.getProperty(xpathKey))).clear();
		}catch(Exception e){
		
		}
	}
	
		// Select
	
	// Verification
	public boolean isElementPresent(String xpathKey){
		try{
			driver.findElement(By.xpath(OR.getProperty(xpathKey)));
		}catch(Exception e){
			return false;	
		}
		return true;
	}

	
	// finds the link on the page
	public boolean isLinkPresent(String linkText){
		try{
			driver.findElement(By.linkText(linkText));
		}catch(Exception e){
			return false;	
		}
		return true;
		
	}
	
}

			
		

	

	


