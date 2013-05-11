package com.online.sarees.pages;

import org.openqa.selenium.By;

import com.online.sarees.base.Page;

public class LoginPage extends Page{
	
	public LandingPage dologin(String userName, String password){
		
		/*driver.findElement(By.xpath("//*[@id='login-email-address']")).sendKeys("defaultUserName");
		driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("defaultPassword");
		driver.findElement(By.linkText("Login")).click();
		*/
		
		// null - If the login is successful 
		// Object of LandingPage - If login is successful. 
		
		driver.get(CONFIG.getProperty("testSiteLandingPageURL"));
		click("LOGIN_LINK");
		input("EMAIL",userName);
		input("PASSWORD", password);
		click("LOGIN_BUTTON");
		if (isElementPresent("LOGOUT"))
			return new LandingPage();
		else
			return null;
		
	}
	
	public void register(){
		
	}
	
}
