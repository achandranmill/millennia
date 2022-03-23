package com.access.testcases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import com.access.pageobject.loginpage;
import org.testng.annotations.Listeners;

public class BaseClass
{	
	public String baseURL="https://access-staging-b.jellyfishhealth.com/#/";
	public String email="Imenso@mailinator.com";
	public String password="Random@123";
	public String femail="admin2@mailinator.com";
	public static WebDriver driver;

	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "/home/vikram/eclipse-workspace/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Logger.getLogger("Access");
		PropertyConfigurator.configure("Log4j.properties");
	}

	public void loginpage()
	{
		driver.get(baseURL);

		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		//System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Millennia Access"))
		{
			AssertJUnit.assertTrue(true);
		}
		else {
			AssertJUnit.assertTrue(false);
	}
	}

/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/

public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}


public String randomestring()
{
	String generatedstring=RandomStringUtils.randomAlphabetic(8);
	return(generatedstring);
}


public static String randomeNum() {
	String generatedString2 = RandomStringUtils.randomNumeric(4);
	return (generatedString2);
}


}
