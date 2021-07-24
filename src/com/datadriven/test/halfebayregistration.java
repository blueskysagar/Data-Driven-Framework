package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class halfebayregistration {

	WebDriver driver;

	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");   
	     WebDriver driver= new ChromeDriver(); 
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     driver.get("https://signup.ebay.com.au/pa/crte?ru=https%3A%2F%2Fwww.ebay.com.au%2F");
	}
	@DataProvider
	//Now we need the functions that could fetch the excel data using Apache POI
	public void getTestData() {
		
	}
	
	@Test
	public void ebayRegistrationTest(String firstName, String lastName, String Email, String Password) {
		//enter data
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstName);
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastName);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Password);
		
		
		
	}
	
	
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
