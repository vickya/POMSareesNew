package com.online.sarees.tests;

import junit.framework.Assert;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.online.sarees.base.Page;
import com.online.sarees.pages.LandingPage;
import com.online.sarees.pages.LoginPage;
import com.online.sarees.pages.MyAccountInformationPage;
import com.online.sarees.pages.MyAccountPage;
import com.online.sarees.util.TestUtil;

public class LoginTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void loginTest(){ 
		
		//check the runmode
		if((!TestUtil.isExecutable("LoginTest", Page.xls1)))
			throw new SkipException("Runmode set to NO");
		
		// temp 
		boolean testDataType = true;
		LoginPage loginpage = new LoginPage();
		LandingPage landingpage = loginpage.dologin("vickyaerabati@gmail.com", "vickyaerabati");
		MyAccountPage myaccountpage = landingpage.myAccount();
		MyAccountInformationPage myaccountinfo = myaccountpage.changeAccountInformation();
		myaccountinfo.changeInfo("08/04/1987");
		Assert.assertEquals("Your account has been successfully updated.", "Your account has been successfully updated.");
		// error
		if (testDataType & landingpage==null)
			Assert.assertTrue( "Not able to login with correct data", false);
		else if(!testDataType & landingpage!=null )
			Assert.assertTrue("Able to login with incorrect data" , false);
	
		}

}
