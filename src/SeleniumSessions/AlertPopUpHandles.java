package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandles {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
	     WebDriver driver= new ChromeDriver(); 
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     Thread.sleep(5000);
	     driver.findElement(By.name("proceed")).click();
	     Alert alert = driver.switchTo().alert();
	     System.out.println(alert.getText());
	     alert.accept();

	}

}
