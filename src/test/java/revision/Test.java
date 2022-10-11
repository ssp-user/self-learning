package revision;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//vishaljoshi//Documents//git//self-learning//chromeDriver//v105//chromedriver");
		WebDriver driver = new ChromeDriver();
		//Actions action = new Actions(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
		WebElement element = driver.findElement(By.xpath("//select[@title='Search in']"));
		element.click();
		//action.contextClick(element).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> elements = driver.findElements(By.xpath(""));
		
		
		driver.quit();
	}

}
