package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;



@Test
public class Appt_tc_14 extends BaseClass

{
	
    //-------------------Message History-----------------------------------
	public void Appointments() throws Exception
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
		Thread.sleep(5000);
		System.out.println("USER LOCATION IS PRESENT");
		}
		catch(Exception e) 
		{
			System.out.println("USER LOCATION IS PRESENT");
			
		}
		//-----------------------REGISTRATION PAGE-----------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		//---------------------APPOINTMENT PAGE-------------------------
        Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(3000);
		//------------------DATE RANGE----------------------------------
		ap.AppointDATE();
		Thread.sleep(2000);
		ap.AppointDATE1("20220401");
		Thread.sleep(1000);
		ap.AppointDATE2("20220409");
		Thread.sleep(3000);
		ap.AppointDATEAPPLY();
		//----------------THREE DOT-----------------------------------
		ap.ThreeDot();
		ap.EditAppointment();
		Thread.sleep(3000);
		//----------------MESSAGE HISTORY---------------------------
		ap.MessageHistory();
		Thread.sleep(3000);
		ap.CheckHistory();
		Thread.sleep(3000);
		ap.HistorySaveChange();
		Thread.sleep(3000);
		ap.HistorySaveChangeMessage();
		Thread.sleep(5000);
	}
}