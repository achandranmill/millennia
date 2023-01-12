package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test

public class Reg_tc_2  extends BaseClass
{
	public void RegistrationPage() throws Exception
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
		r.Headline_Message();
		Thread.sleep(2000);
		r.HOLD();
		Thread.sleep(10000);
		WebElement message = driver.findElement(By.xpath("/html/body/div[2]/div/span"));
		try
		{
			r.Hold_Patient_Message();
		}
		catch(Exception e)
		{
			System.out.println("Hold Message not displayed");
		}

		Thread.sleep(10000);
		r.Holdlist();
		Thread.sleep(10000);
		r.Remove_HoldList();
		Thread.sleep(10000);
		try
		{
			r.Remove_Hodlist_Message();
		}
		catch(Exception e)
		{
			System.out.println("Remove hold list Message not displayed");
		}

	}
}
