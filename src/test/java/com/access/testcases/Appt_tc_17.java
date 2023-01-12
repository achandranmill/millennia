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
public class Appt_tc_17 extends BaseClass	

{
	//-----------------------Confirm / Unconfirm Appointment --------------------------------
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
		//----------------------CLIP BOARD-------------------------------
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Mahveer");
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
		addp.Clip_Seeing();
		addp.Clip_Thoms();
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Comment("Routine checkup");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		//--------------------------APPOINTMENT PAGE-------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(15000);
		
		//-------------------------------CONFIGURE LIST---------------------
		ap.Configurelist();
		Thread.sleep(10000);
		ap.EditStatusFilter();
		Thread.sleep(2000);
		WebElement SelectAll = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input"));
		if(SelectAll.isSelected())
		{
			SelectAll.click();
		}
		else
		{
			
		}
		Thread.sleep(2000);
		ap.StatusUnconfirmed();
		Thread.sleep(2000);
		ap.StatusSave();
		Thread.sleep(10000);
		ap.SearchLastName("Mahveer");
		ap.SearchButton();
		Thread.sleep(15000);
		WebElement UNCONFIRM_PATIENT = driver.findElement(By.xpath("//span[@ng-if=\"$ctrl.patient.apptStatus == 'UNCONFIRMED'\"]"));
		String UNCONFIRM_EXPECTED = "UNCONFIRMED";
		Assert.assertEquals(UNCONFIRM_PATIENT.getText(), UNCONFIRM_EXPECTED);
		System.out.println("Unconfirmed status is displayed---Passed");
		Thread.sleep(10000);
		ap.Patient_Displayed();

	}


}
