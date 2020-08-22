package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimensionOfWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Setup\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin"); //Linkedin URL for testing
		driver.manage().window().maximize();	
		String username = "//input[@id='username']";
		System.out.println("Height of username field is " + driver.findElement(By.xpath(username)).getSize().height);
		System.out.println("Width of username field is " + driver.findElement(By.xpath(username)).getSize().width);
		System.out.println("Position of X co-ordinate is " + driver.findElement(By.xpath(username)).getLocation().x);
		System.out.println("Position of y co-ordinate is " + driver.findElement(By.xpath(username)).getLocation().y);		
		
	}
}
