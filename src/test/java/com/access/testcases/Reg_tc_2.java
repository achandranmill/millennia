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
		Thread.sleep(5000);
		System.out.println("USER LOCATION IS PRESENT");
    	}
    	catch(Exception e) 
    	{
    		System.out.println("USER LOCATION IS Not PRESENT");
    		
    	}
    	//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		r.HOLD();
		Thread.sleep(10000);
		try
		{
		r.Hold_Patient_Message();
		}
		catch(Exception e)
		{
			System.out.println("Hold Message is not Display");
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
			System.out.println("Remove hold lis Message is not Display");
		}
		
	}
}
