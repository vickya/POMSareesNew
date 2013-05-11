package com.online.sarees.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.online.sarees.pages.ChangePasswordPage;
import com.online.sarees.pages.HomePage;
import com.online.sarees.pages.LandingPage;
import com.online.sarees.pages.LoginPage;
import com.online.sarees.pages.MyAccountPage;

public class ChangePasswordTest {

	// This is the test for changing the password
	@Test
	public void changePassword(){
		HomePage homepage = new HomePage();
		LoginPage loginpage = homepage.login();
		LandingPage landinpage = loginpage.dologin("vickyaerabati@gmail.com", "vickyaerabati");
		MyAccountPage myaccountpage = landinpage.myAccount();
		ChangePasswordPage changepasswordpage = myaccountpage.changeAccountPassword();
		@SuppressWarnings("unused")
		MyAccountPage myaccountpage1 = changepasswordpage.changePassword();
		Assert.assertTrue(true, " Your password has been successfully updated.");
		
	}
}
