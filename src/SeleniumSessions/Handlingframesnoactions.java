package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframesnoactions {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
	     WebDriver driver= new ChromeDriver(); 
	     driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	     driver.switchTo().frame("frame1");
	     driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("Sagar");
	     
	     driver.switchTo().frame("frame3");
	     WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
	     boolean isSelected = checkbox.isSelected();
	     if(isSelected == false) {
	    	 checkbox.click();
	    	 
	     }
	     driver.switchTo().defaultContent();
	     driver.switchTo().frame("frame2");
	     driver.findElement(By.xpath("//option[contains(@value,'avatar')]")).click();
	     
	}
	

}
