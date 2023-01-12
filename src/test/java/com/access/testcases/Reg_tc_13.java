package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Reg_tc_13 extends BaseClass

{
	public void RegtPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		try
		{
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		boolean ACCESSPASS1 = driver.findElement(By.xpath("//button[contains(text(),'Access Pass')]")).isDisplayed();
		Assert.assertTrue(ACCESSPASS1, "Access Pass button not displayed");
		boolean ACCESSPASS = driver.findElement(By.xpath("//button[contains(text(),'Access Pass')]")).isEnabled();
		Assert.assertTrue(ACCESSPASS, "Access Pass button disabled");
		r.ACCESSPASS();
	}
}