package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
	     WebDriver driver= new ChromeDriver(); 
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	     WebElement frameelement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	     driver.switchTo().frame(frameelement);
	     Actions action = new Actions(driver);
	     action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"))).moveToElement(driver.findElement(By.xpath("//div[@id='trash']"))).release().build().perform();

	}

}
