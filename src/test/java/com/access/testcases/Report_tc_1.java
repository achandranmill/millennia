package com.access.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.Date;
import java.util.Random;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.Reports;
import com.access.pageobject.loginpage;
import com.access.testcases.BaseClass;


@Test
public class Report_tc_1  extends BaseClass 
{
	public void Reports() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
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
		Reports select  = new Reports(driver);
		select.ReportClick();
		Thread.sleep(3000);
		select.selectwaitTime();
		Thread.sleep(2000);
		select.selectwaitTime();
		select.exportsTab();
		select.selectexportsTab();
		Thread.sleep(2000);
		select.selectexportsTab();
		Thread.sleep(5000);
		select.exportButton();
	}}


