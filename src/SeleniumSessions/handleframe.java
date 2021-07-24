package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handleframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
	     WebDriver driver= new ChromeDriver(); 
	     driver.get("https://freecrm.com/");
	     driver.manage().window().setSize(new Dimension(1920,1080));
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.linkText("LOG IN")).click();
	     driver.findElement(By.name("email")).sendKeys("blueskysagar01@gmail.com");
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sagar14");
	     driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	     WebElement contacts = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
	     Actions actions = new Actions(driver);
	     actions.moveToElement(contacts).build().perform();
         driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/button")).click();
	     //driver.findElement(By.xpath("//span[contains(text(),'Contacts')]/../../button")).click();

	     
	    
	}

}
