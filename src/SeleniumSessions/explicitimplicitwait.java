package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitimplicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
	     WebDriver driver= new ChromeDriver(); 
	     
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	    //dynamic wait
	     //pageload
	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     //all elements load
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S353355881%3A1609664098442764&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	     WebElement lastname = driver.findElement(By.name("lastName"));
	     WebElement firstname = driver.findElement(By.name("firstName"));
	     sendkeys(driver, lastname, 13, "Shrestha");
	     sendkeys(driver, firstname, 5, "Sagar");
	     
	    
	}


public static void sendkeys(WebDriver driver, WebElement element, int Timeout, String values)
{
	new WebDriverWait(driver,Timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(values);
	}
}