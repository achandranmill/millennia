package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_6 extends BaseClass

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
		addp.lname("Lorii");
		//User Enter FirstName
		addp.fname("Cory");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("lori@mailinator.com");
		addp.Clip_AppointTime("0945");
		Thread.sleep(5000);
		//-------------Appointment three days in advance ----------------------
		addp.Clip_Appointment_Date("02032023");
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
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
		Thread.sleep(20000);
		//--------------------------ADVANCE SEARCH BUTTON------------------------------
		WebElement AdvanceSearch = driver.findElement(By.xpath("//button[contains(text(),'Advanced Search')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", AdvanceSearch);
		Thread.sleep(1000);
		ap.Advance_Lastname("Lorii");
		ap.Advance_Firstname("Cory");
		ap.Advance_Initial("Thomson");
		Thread.sleep(3000);
		ap.Advance_Phone("9878900912");
		ap.Advance_Email("lori@mailinator.com");
		ap.Advance_DOB("01031993");
		Thread.sleep(3000);
		ap.Advance_Mrn("");
		//------------------------------------SEARCH BUTTON------------------------------
		ap.Searchbtn();
		Thread.sleep(20000);
		try
		{
		boolean patient= driver.findElement(By.xpath("//span[contains(text(),'Lorii, Cory')]")).isDisplayed();
		Assert.assertTrue(patient, "Patient displayed-TestCase Failed");
		}
		catch(Exception e)
		{
			System.out.println("Lorii Cory patient not displayed-TestCase Passed");
		}
		ap.Patient_Displayed();
	}
}