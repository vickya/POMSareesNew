package com.online.sarees.pages;

import com.online.sarees.base.Page;

public class HomePage extends Page{
	
	public LoginPage login(){
		click("LOGIN_LINK");
		return new LoginPage();
	}
	
	public CreateAccountPage createAccount(){
		
		driver.get(CONFIG.getProperty("testSiteLandingPageURL"));
		click("CREATE_ACCOUNT");
		
		return new CreateAccountPage();
	}

}



