package com.app.screens;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	WebDriver driver = new FirefoxDriver(); 
// - https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin
	
	public void login(){	
		driver.findElement(By.id("account")).click();		
	}
}
