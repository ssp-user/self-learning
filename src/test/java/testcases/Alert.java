package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//Example for implicit timeout
public class Alert {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Vishal//ChromeDriver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit timeout example
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();

		WebDriverWait wait=new WebDriverWait(driver,20);
		// Wait till the element is not visible		 
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Generate Alert Box')]")));
		
		Wait w = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		//w.until(By.xpath("//button[contains(text(),'Generate Alert Box')]"));
		//Using contains clause to find dynamic elements
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		org.openqa.selenium.Alert alertBox = driver.switchTo().alert();
		System.out.println(" Text is " + alertBox.getText());
		Thread.sleep(2000);
		alertBox.accept();		
		//Using sibling clause to find elements
		driver.findElement(By.xpath("//b[text()='Click button to generate Alert box : ']/following-sibling::*")).click();
		Thread.sleep(2000);
		alertBox.accept();						
		//Using normal text() function to find elements
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(2000);
		alertBox.accept();				
		driver.quit();
	}
}