package com.access.testcases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.annotations.Test;
import com.access.pageobject.loginpage;

public class Login_tc_3 extends BaseClass
{
	@Test
	public void loginpage()
	{
		driver.get(baseURL);
		//User Check Validation on invalid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(femail);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//span[contains(text(),'Authentication Error: Username does not exist.')]")).isDisplayed())
		{
			AssertJUnit.assertTrue(true);
		}
		else
		{
			AssertJUnit.assertTrue(false);
		}
	}
}
