package revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//vishaljoshi//Documents//git//self-learning//chromeDriver//v107//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//WebElement body = driver.findElement(By.xpath("//body[@jsmodel='hspDDf']"));
		WebElement body = driver.findElement(By.xpath("//input[@name='q']"));
		

		
		// String n = Keys.chord(Keys.COMMAND + "T");
	//	 String n = Keys.chord(Keys.COMMAND, "T");
		//String tab = Keys.COMMAND + "T";
		
	//	 Actions action = new Actions(driver);
	//	 action.keyDown(Keys.COMMAND).sendKeys("t").keyUp(Keys.COMMAND).perform();
		 
		body.sendKeys("Hello world");
		//body.sendKeys(Keys.COMMAND +"t");
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.open();");
		//body.sendKeys(Keys.COMMAND);
	//	body.sendKeys("T");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String activeWindowHandle = driver.getWindowHandle();
		System.out.println("Active window handle is "+ activeWindowHandle);
		Set<String> hs = driver.getWindowHandles();
		for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("Value of string is " + string);
			System.out.println("Window handle is "+ string);
			if (string.equals(activeWindowHandle)) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
				driver.switchTo().window(string);
			}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
