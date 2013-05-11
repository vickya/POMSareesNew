package com.online.sarees.pages;

import com.online.sarees.base.Page;

public class MyAccountPage extends Page{
	
	public MyAccountInformationPage changeAccountInformation(){
		
		click("change_account_information");
		
		return new MyAccountInformationPage();
		
	}
	
	public void changeEntriesInAddressBook(){
		
	}
	
	public ChangePasswordPage changeAccountPassword(){
		
		click("CHANGE_ACC_PASSWORD");
		return new ChangePasswordPage();
	}
	
	public void subscribeNewsletters(){
		
	}
	
	public void changeproductNotificationList(){
		
	}

}

