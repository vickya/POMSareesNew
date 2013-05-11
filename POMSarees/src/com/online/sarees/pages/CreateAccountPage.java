package com.online.sarees.pages;

import com.online.sarees.base.Page;

public class CreateAccountPage extends Page{

	public void createAccount(String CompanyName, String vivek, String anand, String streetadd, String add2, String city, String state, String postcode, String telephone, String dob, String confirmpassword){
		
		driver.get(CONFIG.getProperty("testSiteLandingPage"));
		click("CREATE_ACCOUNT");
		input("COMPANY_NAME", CompanyName);
		click("GENDER");
		input("FIRST_NAME", vivek);
		input("LAST_NAME", anand);
		input("STREET_ADDRESS", streetadd);
		input("ADDRESS_LINE2", add2);
		input("CITY", city);
		input("STATE", state);
		input("POSTCODE", postcode);
		click("COUNTRY");
		input("TELEPHONE", telephone);
		input("DOB", dob);
		input("CONFIRM_PASSWORD", confirmpassword);
		click("SUBMIT");
		
	}
}
