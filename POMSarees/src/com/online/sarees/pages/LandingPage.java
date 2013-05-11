package com.online.sarees.pages;

import com.online.sarees.base.Page;

public class LandingPage extends Page{
	
	public MyAccountPage myAccount(){
		
		click("my_account");
		
		return new MyAccountPage();
	}
	
	public void Logout(){
		click("LOGOUT");
	//	isElementPresent("LOGOUT");
	}
	

	
}
