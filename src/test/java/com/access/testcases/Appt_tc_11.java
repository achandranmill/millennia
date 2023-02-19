package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_11 extends BaseClass
{

	//----------Appointment Type (Forms)-------------------------------
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
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Gomez");
		//User Enter FirstName
		addp.fname("Gemma");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("gandhi@mailinator.com");
		addp.Clip_AppointTime("09:45");
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Seeing();
		addp.Clip_Thoms();
		addp.Clip_Comment("Routine checkup");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		addp.Clip_Checkin();
		Thread.sleep(5000);
		addp.Alert_ok();
		Thread.sleep(15000);
		//-----------------APPOINTMENT PAGE-------------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(15000);
		//-----------------DATE RANGE------------------------------------
		ap.SearchLastName("Gomez");
		ap.SearchButton();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		Thread.sleep(5000);
		ap.ThreeDot();
		Thread.sleep(5000);
		ap.EditAppointment();
		Thread.sleep(5000);
		WebElement Forms = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/ul/li[2]/a"));
		Forms.click();
		Thread.sleep(20000);
		ap.Forms_option();
		ap.Forms_Display();
		WebElement Patient = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/patient-details-modal/ul/li[1]/a"));
		Patient.click();
		Thread.sleep(5000);
		ap.AppointmentType();
		Thread.sleep(3000);
		ap.Visit();
		Thread.sleep(3000);
		ap.AppointmentTypeSave();
		Thread.sleep(15000);
		ap.ThreeDot();
		Thread.sleep(5000);
		ap.ThreeDotForms();
		Thread.sleep(5000);
		ap.Forms_option1();
		Thread.sleep(5000);
		ap.Forms_Display2();
		
		
		




	}
}
