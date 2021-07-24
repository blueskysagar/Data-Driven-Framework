package com.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class parametertestclass {
	WebDriver driver;
	@Parameters({"url","emailID"})
	@Test
	
	public void yahooLoginTest(String url, String emailID) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//input[@class = 'phone-no ']")).clear();
		driver.findElement(By.xpath("//input[@class = 'phone-no ']")).sendKeys(emailID);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		 
		
	}

}
