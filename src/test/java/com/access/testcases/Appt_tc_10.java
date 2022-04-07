package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_10 extends BaseClass

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
		Thread.sleep(3000);
		ap.AppointDATE();
		Thread.sleep(3000);
		ap.AppointDATE1("20220301");
	    ap.AppointDATE2("20220406");
	    ap.AppointDATEAPPLY();
	    Thread.sleep(3000);
	    ap.ThreeDot();
	    Thread.sleep(3000);
	    ap.ThreeDotForms();
	    Thread.sleep(10000);
	    ap.FormsMakechange();
	    Thread.sleep(10000);
	    ap.FormsFirstName("2");
	    Thread.sleep(3000);
	    ap.FormsSave();
	    Thread.sleep(3000);
	    ap.FormsCancel();
	    Thread.sleep(3000);
	    
	    
}
}