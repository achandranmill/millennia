package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Appt_tc_19 extends BaseClass

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
		try
		{
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
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
		//----------------------CLIP BOARD PAGE-------------------------------
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("chandke");
		//User Enter FirstName
		addp.fname("Umesh");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("Umesh@mailinator.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
        addp.Clip_Comment("Nill");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		Thread.sleep(15000);
        //--------------------------APPOINTMENT PAGE-------------------------
        Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		ap.SearchLastName("Yadav");
		ap.SearchButton();
		Thread.sleep(15000);
		ap.ThreeDot();
		Thread.sleep(10000);
		ap.ThreDotSetConfirmed();
		Thread.sleep(10000);
		ap.ThreeDot();
		Thread.sleep(10000);
		ap.ThreDotSetUnconfirmed();
		Thread.sleep(10000);
		
		
	}
}
