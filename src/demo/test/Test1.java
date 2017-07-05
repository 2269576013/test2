package demo.test;

import org.testng.annotations.Test;

import utils.Log;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Test1 {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://www.baidu.com");	  
	  Log.info("baidu is open");
	  driver.findElement(By.id("kw")).sendKeys("abc");
	  Log.info("input keyword:abc");
	  driver.findElement(By.id("su")).click();
	  Log.info("click baiduyixia button"); 	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  Log.info("firefox launched");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  Log.info("firefox closed");
  }
}
