package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_10 extends BaseClass

{
	//-----------------------Appointment Type-------------------------
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
		//User Enter FirstName
		addp.fname("Gemma");
		//User Enter lastName
		addp.lname("Riveraa");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("Gemma@mailinator.com");
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
		Thread.sleep(10000);
		//-----------------APPOINTMENT PAGE-------------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(15000);
		ap.Configurelist();
		ap.EditListColumns();
		WebElement Appt_Type = driver.findElement(By.xpath("//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[11]/td[2]/input"));
		if(!Appt_Type.isSelected())
		{
			Appt_Type.click();
		}
		else
		{
			
		}
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
		//-----------------DATE RANGE------------------------------------
		ap.SearchLastName("Riveraa");
		ap.SearchButton();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		Thread.sleep(5000);
		//---------------------THREE DOT------------------------------------------
		ap.ThreeDot();
		Thread.sleep(5000);
		ap.EditAppointment();
		Thread.sleep(10000);
		ap.AppointmentType();
		Thread.sleep(10000);
		ap.Appointment1();
		Thread.sleep(3000);
		ap.AppointmentTypeSave();
		Thread.sleep(15000);
		ap.Patient_Displayed();
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(30000);
		WebElement Patient_Rivera = driver.findElement(By.xpath("//span[contains(text(),'Gemma@mailinator.com')]"));
		String Actual = "Gemma@mailinator.com";
		Assert.assertEquals(Patient_Rivera.getText(), Actual);
		
		
        



	}
}