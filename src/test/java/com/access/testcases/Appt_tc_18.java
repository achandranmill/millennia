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
public class Appt_tc_18 extends BaseClass

{
	//---------------------------------Confirm / Unconfirm Appointment -------------------
	
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
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
        addp.Clip_Comment("Nill");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
        //--------------------------APPOINTMENT PAGE-------------------------
        Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(10000);
		ap.ThreeDot();
		Thread.sleep(2000);
		//--------------------------THREE DOT ------------------------------
		ap.ThreDotSetConfirmed();
		Thread.sleep(5000);
		WebElement UNCONFIRM_PATIENT = driver.findElement(By.xpath("//span[@ng-if=\"$ctrl.patient.apptStatus == 'CONFIRMED'\"]"));
		String UNCONFIRM_EXPECTED = "UNCONFIRMED";
		Assert.assertEquals(UNCONFIRM_PATIENT.getText(), UNCONFIRM_EXPECTED);
		System.out.println("CONFIRMED_STATUS IS DISPLAYED---PASSED");
		Thread.sleep(10000);
		
	}
}
