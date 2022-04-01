package com.access.testcases;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass 
{
public String baseURL="https://access-stage-b.jellyfishhealth.com.";
public String email="user_test@mailinator.com";
public String password="Imenso@test123";

public static WebDriver driver;


  @BeforeClass
  public  void setup()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ATM\\chromedriver.exe\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get(baseURL);
	   driver.manage().window().maximize();
	  
	  
  }
@AfterClass
public void tearDown()
{
	driver.quit();
}
}
