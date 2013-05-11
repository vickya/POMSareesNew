package com.online.sarees.pages;

import com.online.sarees.base.Page;

public class MyAccountInformationPage extends Page{

	
	public void changeInfo(String dob) {
		
		clear("DOB");
		input("DOB", dob);
		click("UPDATE");
	}


}
