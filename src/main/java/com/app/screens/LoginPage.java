package com.app.screens;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class LoginPage {
	WebDriver driver;
	Wait wait;
	WebDriverWait explicitWait;
	FluentWait fWait;
	
	
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Setup\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin"); //Linkedin URL for testing
		driver.manage().window().maximize();		
	}
	
	public void login(){
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //Example of implicit wait
		String decrptData  ="b3JhY2xlMjVleWU=";
		byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
		explicitWait = new WebDriverWait(driver, 30);
		WebElement username = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));//Example of explicit wait
		username.sendKeys("joshivishal@yahoo.com");
		driver.findElement(By.id("password")).sendKeys(new String(decodeBytes));//Example to enter encrypted password		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void quitBrowser(){
		System.out.println();
		driver.close();
	}	
}
