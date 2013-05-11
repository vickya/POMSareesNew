package com.online.sarees.pages;

import com.online.sarees.base.Page;

public class ChangePasswordPage extends Page {
	
	public MyAccountPage changePassword(){
		input("CURRENT_PASSWORD", "vickyaerabati");
		input("NEW_PASSWORD", "vickyaerabati");
		input("CONFIRM_PASSWORD", "vickyaerabati");
		click("SUBMIT_ACC_PASSWORD");
		return new MyAccountPage();
	}

}
