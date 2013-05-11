package test;

import com.online.sarees.pages.LandingPage;
import com.online.sarees.pages.LoginPage;
import com.online.sarees.pages.MyAccountPage;

public class login {

	public static void main (String [] args){
		
	// When you create the object of LoginPage which has the function "dologin"
	// which will return the object of HomePage and when we call the function "myAccount" 
	// with the help of object of HomePage(homepage) the page will be navigated to "myAccount"
	// The above concept is called as POM
		
		LoginPage l = new LoginPage();
		LandingPage homepage = l.dologin("vickyaerabati@gmail.com", "vickyaerabati");
		MyAccountPage myaccount = homepage.myAccount();
		myaccount.changeAccountInformation();	
	}
	
}
