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
public class Appt_tc_16 extends BaseClass

{
	//-----------------------Confirm / Unconfirm Appointment ------------------

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
		//----------------------CLIP BOARD PAGE--------------------------
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Wardo");
		//User Enter FirstName
		addp.fname("Carlos");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1999");
		//User Enter PhoneNumber
		addp.pnumber("9878900913");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("carlos@mailinator.com");
		addp.Clip_AppointTime("09:45");
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
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
		//----------------------APPOINTMENT PAGE----------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(10000);
		//----------------------CONFIGURE LIST-----------------------------
		ap.Configurelist();
		Thread.sleep(10000);
		ap.EditStatusFilter();
		Thread.sleep(3000);
		WebElement SelectAll = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input"));
		if(SelectAll.isSelected())
		{
			SelectAll.click();
		}
		else
		{

		}
		WebElement Unconfirmed = driver.findElement(By.xpath("//*[@id=\"Unconfirmed\"]"));
		if(!Unconfirmed.isSelected())
		{
			Unconfirmed.click();
		}
		else
		{

		}
		WebElement confirmed = driver.findElement(By.xpath("//*[@id=\"Confirmed\"]"));
		if(!confirmed.isSelected())
		{
			confirmed.click();
		}
		else
		{

		}
		Thread.sleep(2000);
		ap.StatusSave();
		Thread.sleep(10000);
		ap.Patient_Appointment_Displayed();
		//---------------------Advance Search-------------------------------
		WebElement AdvanceSearch = driver.findElement(By.xpath("//button[contains(text(),'Advanced Search')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", AdvanceSearch);
		Thread.sleep(1000);
		ap.Advance_Lastname("Wardo");
		ap.Advance_Firstname("Carlos");
		ap.Advance_Initial("Thomson");
		Thread.sleep(3000);
		ap.Advance_Phone("9878900913");
		ap.Advance_Email("carlos@mailinator.com");
		ap.Advance_DOB("01031999");
		Thread.sleep(3000);
		ap.Advance_Mrn("");
		//------------------------------------SEARCH BUTTON------------------------------
		ap.Searchbtn();
		Thread.sleep(20000);
		ap.ThreeDot();
		ap.ThreDotSetConfirmed();
		Thread.sleep(5000);
		ap.Patient_Appointment_Displayed();
		WebElement CONFIRM_PATIENT = driver.findElement(By.xpath("//span[@ng-if=\"$ctrl.patient.apptStatus == 'CONFIRMED'\"]"));
		String CONFIRM_EXPECTED = "CONFIRMED";
		Assert.assertEquals(CONFIRM_PATIENT.getText(), CONFIRM_EXPECTED);
		System.out.println("Confirmed status displayed---Passed");



	}

}
