package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;
@Test
public class Massm_tc_2  extends BaseClass

{
	public void MassMessaging() throws Exception
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
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Robin");
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
		addp.textemail("Lorie@mailinator.com");
		addp.Clip_AppointTime("0945");
		Thread.sleep(5000);
		//-------------Appointment three days in advance --------Month-Day-Year--------------
		addp.Clip_Appointment_Date("02052023");
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
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(10000);
		ap.Configurelist();
		ap.EditStatusFilter();
		WebElement SelectAll = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input"));
		if(!SelectAll.isSelected())
		{
			SelectAll.click();
		}
		else
		{
			
		}
		ap.StatusSave();
		Thread.sleep(5000);
		ap.AppointDATE();
		Thread.sleep(2000);
		ap.AppointDATE1("2023-02-05");
		Thread.sleep(2000);
		ap.AppointDATE2("2023-02-05");
		Thread.sleep(2000);
		ap.AppointDATEAPPLY();
		Thread.sleep(15000);
		WebElement Patient=driver.findElement(By.xpath("//span[contains(text(),'Robin, Cory')]"));
		String Actual="Robin, Cory";
		Assert.assertEquals(Patient.getText(), Actual);
		System.out.println("Future patient is displayed --Testcase Passed");
		ap.Patient_Displayed();
		
		
	}
}