package com.access.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

<<<<<<< HEAD


public class BaseClass 
{

=======
public class BaseClass {
	
>>>>>>> revert
	//public String baseURL="https://access-stage-b.jellyfishhealth.com";
		public String baseURL="https://access-staging-a.jellyfishhealth.com";
		//public String email="a19@mailinator.com";
		public String email="123er@mailinator.com";

<<<<<<< HEAD
	//public String password="Random@123456788";
	public String password="Random@123456789";
	public String femail="a19e@mailinator.com";
	//public String baseURL="https://access-staging-b.jellyfishhealth.com";
	//public String baseURL = "https://access-staging-a.jellyfishhealth.com";
	//public String email="123er@mailinator.com";
	//public String password="Random@123456789";
	//public String email="a19@mailinator.com";

	//public String password="Random@123456788";

	
	public static WebDriver driver;


	
	@BeforeClass
	public  void setup()
	{


		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ATM\\Downloads\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ATM\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
=======
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
>>>>>>> revert


		}
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
	}



