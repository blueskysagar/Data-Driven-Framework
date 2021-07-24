package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginTest {

	WebDriver driver;
	@Parameters({"browser"})
	@Test(priority = 1)
	public void launchURLTest(String browser) {
		System.out.println("Running browser is: " + browser);
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
		     driver= new ChromeDriver();
		}
		else if(browser.equals("fireFox")) {
			driver = new FirefoxDriver();
		}
	driver.get("https://ui.cogmento.com/");
	}
	
	@Parameters({"username","password"})
	@Test(priority = 2)
	public void loginintoTest(String username, String password)
	{
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	
}

