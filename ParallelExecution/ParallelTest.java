package com.ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;
	@Parameters("Browser")
	@BeforeTest
	public void launchBrowser(String str) {
		
		if(str.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavilion\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	
	}else if(str.equalsIgnoreCase("FireFox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pavilion\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		}
	}
	
  @Test
  public void testcase() {
	driver.findElement(By.name("q")).sendKeys("Selenium"); 
	driver.findElement(By.name("btnK")).click();
  }
}
