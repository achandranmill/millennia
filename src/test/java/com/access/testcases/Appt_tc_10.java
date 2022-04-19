package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
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
		Thread.sleep(5000);
		ap.AppointDATE();
		Thread.sleep(5000);
		ap.AppointDATE1("20220301");
	    ap.AppointDATE2("20220418");
	    ap.AppointDATEAPPLY();
	    Thread.sleep(13000);
	    ap.ThreeDot();
	   Thread.sleep(5000);
	   ap.EditAppointment();
	   Thread.sleep(3000);
	   ap.AppointmentType();
	   Thread.sleep(10000);
	   ap.Appointment1();
	   
	   Thread.sleep(3000);
	   ap.AppointmentTypeSave();
	   
	   Thread.sleep(15000);
	   WorkListPage w = new WorkListPage(driver);
	   
	   w.worklist();
	    
}
}