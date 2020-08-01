package com.app.screens;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver; 
	
// - https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin
	
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Setup\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
	}
	
	public void login(){	
		driver.findElement(By.id("username")).sendKeys("joshivishal@yahoo.com");		
		driver.findElement(By.id("password")).sendKeys("oracle25eye");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
