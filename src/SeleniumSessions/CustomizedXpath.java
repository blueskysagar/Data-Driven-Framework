package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
	     WebDriver driver= new ChromeDriver(); 
	     driver.get("https://www.ebay.com/");
	     // we used one properties of html tag of ebay which is type lets check the other one
	    // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
	     
	     //we used the other attributes which is place holder now lets use the funcctions ook.
	     
	     //driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("jackets");
	     
	     
	     //we used dynamic xpath and use text functions for the link.
	    //driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	     
	     
	     // counting the number of links in a page.
	     List<WebElement> linklist = driver.findElements(By.tagName("a"));
	     System.out.println(linklist.size());
	     
	     // printing each text in a link
	     for(int i = 0; i< linklist.size(); i++)
	     {
	    	String linkText = linklist.get(i).getText();
	    	System.out.println(linkText);
	     }

	}

}
