package com.app.test;

import org.testng.annotations.Test;

import com.app.screens.LoginPage;

public class LoginTest {
	
	@Test
	public void loginToLinkedIn(){
		LoginPage lip = new LoginPage();
		lip.launchBrowser();
		lip.login();
		
	}

}