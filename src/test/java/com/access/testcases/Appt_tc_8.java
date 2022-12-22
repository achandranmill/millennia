package com.access.testcases;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Appt_tc_8 extends BaseClass
{
	
	//-----------------------------Cancel Appointment from Connect--------------------------

	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		try {
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
		//--------------------REGISTRATION PAGE------------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Rohan");
		//User Enter FirstName
		addp.fname("mahajan");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("rohan@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		//Thread.sleep(2000);
		//addp.Clip_Seeing();
		addp.Clip_Flag();
		addp.clipflag1();
		Thread.sleep(2000);
		addp.Clip_Comment("Nill");
		//addp.Clip_Reason("only checkup");
		//addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.connect();
		addp.relation();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		Thread.sleep(10000);
		addp.Alert_ok();
		Thread.sleep(10000);
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(5000);
		ap.ThreeDot();
		Thread.sleep(3000);
		ap.ThreeDotCancel();

	}
}