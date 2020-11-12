package testcases;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//Example for implicit timeout
public class FluentWaitExample {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Vishal//ChromeDriver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit timeout example
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		//w.until(By.xpath("//button[contains(text(),'Generate Alert Box')]"));
		//Using contains clause to find dynamic elements
		//driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			 public WebElement apply(WebDriver driver) {
			 WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]"));
			 String getTextOnPage = element.getText();
			 if(getTextOnPage.equals("Generate Alert Box")){
			 System.out.println(getTextOnPage);
			 return element;
			 }else{
			 System.out.println("FluentWait Failed");
			 return null;
			 }
			 }
			 });		

	}
}