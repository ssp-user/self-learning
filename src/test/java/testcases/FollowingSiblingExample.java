package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSiblingExample {
	public static void main(String[] args) {
		WebDriver driver;
    	String driverPath = "C://Vishal//ChromeDriver//chromedriver_win32//chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();        
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.testandquiz.com/selenium/testing.html");

        //Search element inside 'Popular course' which are sibling of control 'SELENIUM' ,Here first we will find a h2 whose text is ''A few of our most popular courses' ,then we move to its parent element which is a 'div' , inside this div we will find a link whose text is 'SELENIUM' then at last we will find all of the sibling elements of this link('SELENIUM')
        
        List <WebElement> dateBox = driver.findElements(By.xpath("//div[@class='container']/child::div[@class='row']"));

        //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }     

        driver.close();
    }
}