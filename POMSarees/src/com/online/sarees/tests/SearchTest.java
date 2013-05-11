package com.online.sarees.tests;

import org.testng.SkipException;

import com.online.sarees.base.Page;
import com.online.sarees.pages.HomePage;
import com.online.sarees.pages.LoginPage;
import com.online.sarees.util.TestUtil;

public class SearchTest {
	
	public void Search(){
		
		if(!TestUtil.isExecutable("SearchTest", Page.xls1));
		throw new SkipException("Runmode set to NO");
		HomePage homepage = null;
		//logged in 
		if(!Page.isLoggedIn){
			LoginPage loginpage = new LoginPage();
			HomePage homepage = loginpage.dologin("vickyaerabati@gmail.com", "vickyaerabati");
		else{
				// I am logged in 
			homepage = Page.topMenu.gotoHomePage();
		}
	}
	}

}
