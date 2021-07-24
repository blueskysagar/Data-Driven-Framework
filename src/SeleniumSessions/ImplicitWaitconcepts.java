package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitconcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
	     WebDriver driver= new ChromeDriver(); 
	     driver.get("https://www.softwaretestinghelp.com/handling-iframes-using-selenium/");
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	    //dynamic wait
	     //pageload
	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     //all elements load
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	     // difference between thread and dynamic wait is that, in thread, we have to wait the specified time till then whole script is paused but in dynamic, evenif elements are found in 2 seconds, the remaining predefined implicit wait time is ignored

	}

}
