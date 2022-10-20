package revision;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//vishaljoshi//Documents//git//self-learning//chromeDriver//v105//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stores.xoxoday.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]"));
		element.click();
		WebElement cart = driver.findElement(By.xpath("//div[text()='Cart']"));
		cart.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		// move to iframe - can select quantity
		
		
		WebElement quantity = driver.findElement(By.xpath("//div[text()='Quantity 1']"));
		quantity.sendKeys("2");
		//come out of iframe
		//get the webElement Text of the Unit quantity and calculate it by unit price*quantity
		
		// move to iframe of order summary
		// find the text of total price and check that it matches with the above (unit price*quantity)
		
		
		//action.contextClick(element).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
