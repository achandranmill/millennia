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


@	Test
public class Appt_tc_3 extends BaseClass
{

    //----------------------EDIT PATEINT-------------------

	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		driver.manage().deleteAllCookies();
		try {
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		System.out.println("USER LOCATION IS PRESENT");
		}
		catch(Exception e) 
		{
			System.out.println("USER LOCATION IS PRESENT");
			
		}
		//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("yadav");
		//User Enter FirstName
		addp.fname("sumitraji");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("user_test@mailinator.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		Thread.sleep(1000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
        addp.Clip_Comment("Nill");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		//---------------APPOINTMENT PAGE----------------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(3000);
		//----------------THREE DOT---------------------------------------
		ap.ThreeDot();
		Thread.sleep(10000);
		ap.ThreDotSetConfirmed();
		WebElement SetConfirmed = driver.findElement(By.xpath("//span[@ng-if=\"$ctrl.patient.apptStatus == 'CONFIRMED'\"]"));
		String CONFIRMED_Excepted = "CONFIRMED";
		Assert.assertEquals(SetConfirmed.getText(), CONFIRMED_Excepted);
		System.out.println("CONFIRMED_STATUS IS DISPLAY - ASSERT PASSED");
		Thread.sleep(10000);
		//----------------THREE DOT---------------------------------------
		ap.ThreeDot();
		Thread.sleep(3000);
		ap.EditAppointment();
		Thread.sleep(3000);
		ap.EditEmail(" deany120@gmail.com ");
		ap.EditDob("06111999");
		Thread.sleep(3000);
		ap.EditFlag();
		Thread.sleep(1000);
		ap.EditFlag1();
		Thread.sleep(3000);
		ap.EditSave();
		Thread.sleep(10000);
		//-------------------Navigate to the Patient on Reg Card------------------------
		r.clickRegistrationPage();
		Thread.sleep(1000);
		r.search("yadav", "sumitraji");
		Thread.sleep(1000);
		
		

	}
}