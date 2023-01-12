package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;

@Test
public class Palkup_tc_6 extends BaseClass

{
	public void UserTestPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		UserTestPage u =new  UserTestPage(driver);

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		u.linkUserTest();
		Thread.sleep(3000);
		u.patientLookup();
		u.Location();
		Thread.sleep(3000);
		u.CheckAll();
		Thread.sleep(3000);
		u.Date();
		u.daterangepicker_start("2022-09-01");
		u.daterangepicker_end("2022-10-12");
		u.DateApply();
		u.Search();
		Thread.sleep(3000);
	}
}
