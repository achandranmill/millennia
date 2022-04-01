package com.access.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.Date;
<<<<<<< HEAD
import org.junit.Assert;
=======
//import org.junit.Assert;
>>>>>>> 66b992c384895b3697a3b6897aba419bf92f7c3e
import java.util.Random;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.access.pageobject.Reports;
import com.access.pageobject.loginpage;
import com.access.testcases.BaseClass;
<<<<<<< HEAD
import com.aventstack.extentreports.utils.DateUtil;
=======

>>>>>>> 66b992c384895b3697a3b6897aba419bf92f7c3e
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
		Reports select  = new Reports(driver);
		select.ReportClick();
		Thread.sleep(3000);
		select.selectwaitTime();
		Thread.sleep(2000);
		select.selectwaitTime();
		//Thread.sleep(2000);
		//select.appointmentTab();
		//select.selectallappointment();
		//Thread.sleep(2000);
		//select.selectallappointment();
//		select.usersTab();
//		select.selectallusers();
//		Thread.sleep(2000);
//		select.selectallusers();
		//select.surveyTab();
//		select.totalVisitTab();
//		select.selectdepartmentVisitTab();
//		Thread.sleep(2000);
//		select.selectdepartmentVisitTab();
//		Thread.sleep(2000);
//		select.selectdepartment();
//		Thread.sleep(2000);
//		select.selectdepartment();
//		Thread.sleep(2000);
		select.exportsTab();
		select.selectexportsTab();
		Thread.sleep(2000);
		select.selectexportsTab();
		Thread.sleep(5000);
		select.exportButton();
	}}


