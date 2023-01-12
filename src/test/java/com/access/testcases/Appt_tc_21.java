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

public class Appt_tc_21 extends BaseClass
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
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		//--------Find an appointment on the appt tab > Click patient record> Click cancel this appt at top of screen> click yes--------
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Gandhi");
		//User Enter FirstName
		addp.fname("Sourabh");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("gandhi@mailinator.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
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
		Thread.sleep(10000);
		ap.Configurelist();
		ap.EditDepartFillter();
		WebElement SellectAll = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/department-filter/div[2]/div/div[1]/label/input"));
		if(!SellectAll.isSelected())
		{
			SellectAll.click();
		}
		else
		{
			
		}
		ap.Departmentsavechange();
		Thread.sleep(5000);
		ap.Configurelist();
		ap.EditStatusFilter();
		WebElement Status_SellectAll = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input"));
		if(!Status_SellectAll.isSelected())
		{
			Status_SellectAll.click();
		}
		else
		{
			
		}
		ap.StatusSave();
		Thread.sleep(5000);
		//-----------------DATE RANGE------------------------------------
		ap.SearchLastName("Gandhi");
		ap.SearchButton();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		Thread.sleep(10000);
		ap.ThreeDot();
		Thread.sleep(5000);
		ap.EditAppointment();
		Thread.sleep(5000);
		ap.Edit_Appointmen_Cancel_btn();
		Thread.sleep(5000);
		ap.Edit_Appointmen_Cancel_Yes();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		WebElement Edit_App_Cancel_status = driver.findElement(By.xpath("//span[contains(text(),'CANCELLED')]"));
		String  Excepted  =  "CANCELLED";
		Assert.assertEquals(Edit_App_Cancel_status.getText(), Excepted);
		System.out.println("Test Case Passed");

	}
}
