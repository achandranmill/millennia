package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_13 extends BaseClass
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
		Thread.sleep(15000);
		ap.ThreeDot();
		Thread.sleep(10000);
		ap.ThreeDotForms();
		Thread.sleep(10000);
		ap.FormsFirstName("jone");
		Thread.sleep(15000);
		ap.FormsSave();
		Thread.sleep(15000);
}
	
}