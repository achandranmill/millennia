package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Reg_tc_12  extends BaseClass

{
	@Test
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
		Thread.sleep(10000);
		r.SENDTO();
		Thread.sleep(5000);
		try
		{
			boolean New = driver.findElement(By.xpath("//a[contains(text(),'New')]")).isDisplayed();
			Assert.assertTrue(New, "New button not displayed");
			boolean New2 = driver.findElement(By.xpath("//a[contains(text(),'New')]")).isEnabled();
			Assert.assertTrue(New2, "New button disabled");
		}
		catch(Exception e) {
			System.out.println("New button not displayed");
		}
		r.SendNew();
		Thread.sleep(10000);
		r.StartPatient();

	}
}