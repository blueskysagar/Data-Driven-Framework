package SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
     WebDriver driver= new ChromeDriver(); 
     driver.get("https://demoqa.com/automation-practice-form");
     driver.manage().window().setSize(new Dimension(1920,1080));
     System.out.println(driver.getTitle());
     //driver.findElement(By.name("//input[@name='name']")).sendKeys("sagar");
    // driver.findElement(By.name("phone_number")).sendKeys("0334");
     
     // name locators
     
     //driver.findElement(By.name("name")).sendKeys("sagar");
     //driver.findElement(By.name("phone_number")).sendKeys("112");
     
     //handling drop box
     //WebElement element=driver.findElement(By.name("mm"));
    // Select select= new Select(element);
    // select.selectByIndex(10);
     
     // link test locators
    // driver.findElement(By.linkText("Sign in")).click();
     
     // xpath locators
     //driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("sagar");
     
     // css locators
     //driver.findElement(By.cssSelector("#usernamereg-firstName")).sendKeys("sagar");
     
     // 
     //WebElement element= driver.findElement(By.name("shortCountryCode"));
     //Select select= new Select(element);
     //select.selectByValue("AF");
     
     // multiselect for checkboxes
    List <WebElement> checkbox = driver.findElements(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div/input"));
    for (WebElement el : checkbox) {
    	if(!el.isSelected()) {
    		new Actions(driver).moveToElement(el).click().build().perform();
    	    Thread.sleep(2000);
    	}
     
    
    	
    	 	 
    }
     
    
    
     
     
   
     
	
	
	
	
    	 }
     
    
	}
    
  
     
	

	

	
	

