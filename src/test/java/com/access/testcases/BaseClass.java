package com.access.testcases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass 
{
	//public String baseURL="https://access-stage-b.jellyfishhealth.com";
	public String baseURL="https://access-staging-a.jellyfishhealth.com";
	//public String email="a19@mailinator.com";
	public String email="123er@mailinator.com";

	//public String password="Random@123456788";
	public String password="Random@123456789";
	public String femail="a19e@mailinator.com";
	public static WebDriver driver;


	@BeforeClass
	public  void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
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
