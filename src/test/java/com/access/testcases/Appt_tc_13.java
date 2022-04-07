package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
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
		
		  RegtPage r=new RegtPage(driver);
		   r.clickRegistrationPage();
		   Thread.sleep(3000);
		
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(3000);
		ap.Configurelist();
		Thread.sleep(3000);
		ap.EditListColumns();
		Thread.sleep(3000);
		ap.Appointment();
		Thread.sleep(3000);
		ap.FormsComplete();
		Thread.sleep(3000);
		ap.ColumnsSaveChange();
		Thread.sleep(3000);
		ap.AppointDATE();
		ap.AppointDATE1("20220301");
		ap.AppointDATE2("20220405");
		ap.AppointDATEAPPLY();
		Thread.sleep(3000);
	
		
}
}