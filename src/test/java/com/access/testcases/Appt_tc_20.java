package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Appt_tc_20 extends BaseClass

{
 @Test
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
		r.Registration();

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Lori");
		//User Enter FirstName
		addp.fname("Cory");
		//User Enter MiddleName
		addp.mname("Ell");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("cory@mailinator.com");
		addp.Clip_AppointTime("09:45");

		//-------Select Date Range > Include today through next week > Apply------------------------
		addp.Clip_Appointment_Date("02-22-2023");
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
		Thread.sleep(3000);
		Thread.sleep(10000);
		//-------------------------------CONFIGURE LIST---------------------
		ap.Configurelist();
		Thread.sleep(10000);
		ap.EditStatusFilter();
		Thread.sleep(2000);
		WebElement SelectAll = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input"));
		if(!SelectAll.isSelected())
		{
			SelectAll.click();
		}
		else
		{
			
		}
		Thread.sleep(2000);
		ap.StatusSave();
		Thread.sleep(10000);
		//-----------------DATE RANGE------------------------------------
		ap.AppointDATE();
		Thread.sleep(2000);
		ap.AppointDATE1("2023-02-15");
		Thread.sleep(2000);
		ap.AppointDATE2("2023-02-22");
		Thread.sleep(2000);
		ap.AppointDATEAPPLY();
		Thread.sleep(10000);
		ap.Patient_Displayed();
		ap.SearchLastName("Lori");
		ap.SearchButton();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		boolean patient = driver.findElement(By.xpath("//span[contains(text(),'Lori, Cory')]")).isDisplayed();
		Assert.assertTrue(patient, "Lori, Cory patient not displayed --TestCase Failed");
		System.out.println("Lori, Cory patient displayed --TestCase Passed");
        
	}
}
