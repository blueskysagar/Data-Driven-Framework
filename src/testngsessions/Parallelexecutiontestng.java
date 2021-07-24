	package testngsessions;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
	
	public class Parallelexecutiontestng {
		WebDriver driver1;
		WebDriver driver2;
		WebDriver driver3;
		private WebElement element;
		
		@Test
		public void Test1() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
		     driver1= new ChromeDriver();	
		     driver1.get("https://howtodoinjava.com/testng/testng-executing-parallel-tests/");
		     driver1.findElement(By.xpath("//*[@id=\"menu-item-13485\"]/a/span")).click();
		     Thread.sleep(3000);
		     
		
		}
		@Test
		public void Test2() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
		     driver2= new ChromeDriver();	
		     driver2.get("https://login.yahoo.com/");
		     driver2.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys("sagar@yahoo.com");
		     Thread.sleep(3000);
		     
		
		}
	    @Test
		public void Test3() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
		     driver3= new ChromeDriver();
		     driver3.get("https://www.toolsqa.com/selenium-tutorial/");
		     Thread.sleep(3000);
		     Actions action = new Actions(driver3);

		     WebElement element2 = driver3.findElement(By.xpath("//*[@id='primary-menu']/li[2]/a/span/span"));
		     WebElement element = driver3.findElement(By.linkText("HOME"));
		     WebElement element3 = driver3.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span"));
		     WebElement element4 = driver3.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/ul/li[1]/a/span/span"));
		     action.moveToElement(element).build().perform();

		     Thread.sleep(2000);

		     action.moveToElement(element2).click().build().perform();


		     System.out.println("Move the first element");
		     Thread.sleep(2000);
		     action.moveToElement(element3).click().build().perform();
		     Thread.sleep(2000);
		     System.out.println("Move the first element");
		     action.moveToElement(element4).click().build().perform();
		    
		     
		     
		}
		
		
	    
	}
