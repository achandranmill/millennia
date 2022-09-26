package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_02 extends BaseClass

{
	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(5000);
		ap.apptdaterange();
		Thread.sleep(5000);
		ap.apptdaterangestartdate("2022-09-01");
		Thread.sleep(5000);
		ap.apptdaterangeenddate("2022-10-30");
		Thread.sleep(5000);
		ap.applybtnclk();
		Thread.sleep(5000);
		ap.newthreedotclk();
		Thread.sleep(5000);
		ap.neweditappointment();
		Thread.sleep(5000);
		ap.formsclick();
		Thread.sleep(5000);
		
		
	}
}