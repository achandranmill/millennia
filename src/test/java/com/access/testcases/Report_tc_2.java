package com.access.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.Reports;
import com.access.pageobject.loginpage;

@Test
public class Report_tc_2 extends BaseClass  {
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
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Reports select  = new Reports(driver);
		select.ReportClick();
		Thread.sleep(3000);
		select.appointmentTab();
		select.selectallappointment();
		Thread.sleep(2000);
		select.selectallappointment();

	}
}
