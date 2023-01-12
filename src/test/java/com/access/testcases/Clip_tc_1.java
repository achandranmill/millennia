package com.access.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.Random;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Clip_tc_1 extends BaseClass
{
	public void Clipboard() throws InterruptedException, IOException
	{	
		//Clipboard addp = PageFactory.initElements(driver, Clipboard.class);

		driver.get(baseURL);
		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
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
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Robin");
		//User Enter FirstName
		addp.fname("John");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("john@gmail.com");
		addp.Gender("Male");
		addp.SSN("4444");
		addp.appointmentContactNumber("9876540998");
		addp.mrn("123456");
		addp.appointmentContactName("6778889990");
		//User Enter Appointment Time
		Thread.sleep(2000);
		addp.copay("60");
		Thread.sleep(2000);
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
		Thread.sleep(2000);
		addp.Clip_AppointTime("0900");
		addp.Clip_Appointment_Date("20221226");
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(1000);
		addp.Clip_Appointment_option();
		Thread.sleep(1000);
		addp.Clip_Seeing();
		Thread.sleep(1000);
		addp.Clip_Thoms();
		Thread.sleep(2000);
		addp.Flag1();
		Thread.sleep(2000);
		addp.FlagSelect();
		Thread.sleep(2000);
		addp.reason("Routine Checkup");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.connect();
		addp.relation();
		try
		{
			addp.addcheckin();
			Thread.sleep(5000);
			addp.Alert_ok();
			System.out.println(" Combine \"Add Patient\" and \"Check In\" Buttons");
		}
		catch(Exception e)
		{
			System.out.println(" Not combine \"Add Patient\" and \"Check In\" Buttons");
			addp.Clip_Addpatient();
			addp.Clip_Checkin();
			addp.Alert_ok();

		}

	}}
