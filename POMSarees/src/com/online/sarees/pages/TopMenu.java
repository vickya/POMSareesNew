package com.online.sarees.pages;

import org.openqa.selenium.By;

import com.online.sarees.base.Page;

public class TopMenu {
	
	//Logout
	public void Logout(){
		
	}

	public void Search(){
		
	}
	
	// Goes to home page 
	public LandingPage gotoHomePage(){
		
		Page.driver.findElement(By.xpath(Page.CONFIG.getProperty("homepage_link"))).click();
		
		return new LandingPage();
	}
}
