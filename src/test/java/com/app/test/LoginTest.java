package com.app.test;

import org.testng.annotations.Test;

import com.app.screens.LoginPage;

public class LoginTest {
	
	@Test(groups = {"sanity","regression"})
	public void loginToLinkedIn(){
		LoginPage lip = new LoginPage();
		lip.launchBrowser();
		lip.login();
		lip.quitBrowser();
		
	}
	
	@Test(groups = {"regression"}) 
	public void secondTestCase(){
		System.out.println("************************Login File - Second Test Case************************");
	}	

}
