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
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Yadav");
		//User Enter FirstName
		addp.fname("Rajesh");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031999");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("john@gmail.com");
		Thread.sleep(2000);
		addp.Clip_AppointTime("0930");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Location_option();
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Flag();
		Thread.sleep(2000);
		addp.Clip_Flag_Option();
		Thread.sleep(2000);
	//	addp.Clip_Seeing();
	//	Thread.sleep(2000);
	//	addp.Clip_Thoms();
		addp.Clip_Comment("only checkup");
	//	addp.Clip_Reason("only checkup ");
	//	addp.Clip_Copay("10000");
		Thread.sleep(2000);
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		//addp.printAccessPass();
		addp.Clip_Addpatient();
		Thread.sleep(10000);

		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		ap.SearchLastName("Yadav");
		ap.SearchButton();
		Thread.sleep(10000);
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
