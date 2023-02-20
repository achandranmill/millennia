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


@Test
public class Appt_tc_13 extends BaseClass
{

	//---------------------Forms Completed------------------------------
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
		addp.lname("Gemma");
		//User Enter FirstName
		addp.fname("Rivera");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("Rivera@mailinator.com");
		addp.Clip_AppointTime("09:45");
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
		Thread.sleep(2000);
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		addp.Clip_Appointment_Type();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li//a//span[contains(text(),'Visit')]")).click();
		//addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Comment("Routine checkup");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		Thread.sleep(5000);
		addp.Alert_ok();
		Thread.sleep(10000);
		//-----------------APPOINTMENT PAGE---------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(10000);
		ap.Configurelist();
		Thread.sleep(3000);
		ap.EditListColumns();
		WebElement Forms_Completd = driver.findElement(By.xpath("//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[5]/td[2]/input"));
		if(!Forms_Completd.isSelected())
		{
			Forms_Completd.click();
		}
		else
		{
			
		}
		ap.ColumnsSaveChange();
		Thread.sleep(5000);
		ap.SearchLastName("Gemma");
		ap.SearchButton();
		Thread.sleep(5000);
		ap.Patient_Appointment_Displayed();
		ap.ThreeDot();
		Thread.sleep(3000);
		ap.ThreeDotForms();
		Thread.sleep(10000);
		try
		{
			r.RCB_Report();
		}
		catch(Exception e)
		{
			System.out.println("Rcb Form");
		}
		Thread.sleep(3000);
		r.RCB_FirstName("Rivera");
		r.RCB_LastName("Gemma");
		r.RCB_Dob("09081994");
		Thread.sleep(3000);
		r.RCB_Ssn("777777777");
		Thread.sleep(3000);
		r.RCB_PatientStreetAddress("New York");
		r.RCB_ZipCode("451010");
		r.RCB_Signature();
		r.RCB_Signature2();
		Thread.sleep(3000);
		r.RCB_save();
		Thread.sleep(25000);
		WebElement complete = driver.findElement(By.xpath("//span[contains(text(),'COMPLETE')]"));
		String ExpectedText = "COMPLETE";
		Assert.assertEquals(ExpectedText, complete.getText());
		//System.out.println("Complete text displayed –  Passed");
		Thread.sleep(1000);
		ap.Edit_Appointment_Close();
		Thread.sleep(10000);
		ap.Patient_Appointment_Displayed();
		Thread.sleep(15000);

	}

}