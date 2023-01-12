package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_12 extends BaseClass

{
	//---------------------Conversations----------------------------
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
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		//-----------------REGISTRATION PAGE ------------------------------
		//-----------------------REGISTRATION PAGE-----------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		//---------------------APPOINTMENT PAGE-------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(3000);
		//If data is not available on current date then we can set the date filter
		ap.AppointDATE();
		Thread.sleep(3000);
		ap.AppointDATE1("20220301");
		ap.AppointDATE2("20220408");
		ap.AppointDATEAPPLY();
		Thread.sleep(3000);
		ap.ThreeDot();
		Thread.sleep(3000);
		ap.EditAppointment();
		Thread.sleep(3000);
		ap.Conversations();
		Thread.sleep(3000);
		ap.StartMessage("Hi");
		Thread.sleep(3000);
		ap.SendMessage();
		Thread.sleep(1000);
		ap.Paneltitle();
		Thread.sleep(5000);
		ap.Reply();
		Thread.sleep(2000);
		ap.MessageReply("Hellow");
		Thread.sleep(2000);
		ap.ReplyHere();



	}
}
