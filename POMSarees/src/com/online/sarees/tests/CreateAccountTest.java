package com.online.sarees.tests;

import org.testng.annotations.Test;

import com.online.sarees.pages.CreateAccountPage;
import com.online.sarees.pages.HomePage;
import com.online.sarees.pages.LoginPage;

public class CreateAccountTest {
	
	@Test
	public void createAccountTest(){
		
		HomePage homepage = new HomePage();
		CreateAccountPage createaccountpage = homepage.createAccount();
		createaccountpage.createAccount("CompanyName", "vivek", "anand", "streetadd", "add2", "city", "state", "postcode", "telephone", "dob", "confirmpassword");
				
		
	}

}
