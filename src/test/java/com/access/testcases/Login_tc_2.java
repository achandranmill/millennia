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
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.annotations.Test;
import com.access.pageobject.loginpage;

public class Login_tc_2  extends BaseClass
{
	@Test
	public void loginpage()
	{
	driver.get(baseURL);
	//User Check Successful login on valid email and password
	loginpage lp= new loginpage(driver);
	lp.setUserName(email);
	lp.setPassword(password);
	lp.clickSubmit();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	if(driver.findElement(By.xpath("//body/main[1]/div[1]/registration[1]/section[1]/aside[1]/button[5]")).isDisplayed())
	{
		AssertJUnit.assertTrue(true);
	}
	else
	{
		AssertJUnit.assertTrue(false);
	}
}
}
