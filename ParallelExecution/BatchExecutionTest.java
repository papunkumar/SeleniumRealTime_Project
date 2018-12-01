package com.ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BatchExecutionTest {
	public WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavilion\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
	}
  @Test
  public void tc_1() { 
	 driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
	String str= driver.findElement(By.id("draggable")).getAttribute("id");
	System.out.println(str);
  }
}
