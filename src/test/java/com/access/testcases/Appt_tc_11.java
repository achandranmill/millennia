package com.access.testcases;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_11 extends BaseClass
{

	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(10000);
		//If data is not available on current date then we can set the date filter
			ap.AppointDATE();
			Thread.sleep(10000);
			ap.AppointDATE1("20220901");
		   ap.AppointDATE2("20220914");
		   Thread.sleep(10000);
		   ap.AppointDATEAPPLY();
		 Thread.sleep(10000);
		ap.ThreeDot();
		Thread.sleep(10000);
		ap.EditAppointment();
		Thread.sleep(3000);
		ap.AppointmentType();
		Thread.sleep(3000);
		ap.Visit();
		Thread.sleep(3000);
		ap.AppointmentTypeSave();
		Thread.sleep(3000);




	}
}
