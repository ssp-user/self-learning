package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\git\\self-learning\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/");
		driver.findElement(By.xpath("//div[@id='sbq-wrap']/input")).sendKeys("Hello World!!");
		driver.findElement(By.xpath("//div[@class='mag-glass']")).click();
		driver.quit();
	}
}