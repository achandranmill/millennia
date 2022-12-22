package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;

import com.access.pageobject.loginpage;


public class Appt_tc_1 extends BaseClass

{
	//---------------------------Search Patient --------------------------------------------
	
	@Test
	public void Appointments() throws Exception
	{

        //-----------LOGIN PAGE----------------------------------------
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
		Thread.sleep(5000);
		System.out.println("USER LOCATION IS PRESENT");
		}
		catch(Exception e)
		{
			System.out.println("USER LOCATION IS NOT Present");
		}
		//-------REGISTRATION PAGE ----------------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);  
		//------------APPOINTMENT PAGE ------------------------------------
		Appointments ap=new Appointments(driver);
        ap.linkAppointment();
        //-----------------------------------DATE RANGE----------------------
        ap.AppointDATE();
        ap.AppointDATE1("20221201");
        Thread.sleep(1000);
        ap.AppointDATE2("20221231");
        Thread.sleep(1000);
        ap.AppointDATEAPPLY();
        Thread.sleep(10000);
		ap.SearchLastName("dudhe");
		Thread.sleep(15000);
		//-------------------------------SEARCH BUTTON-----------------------
		ap.SearchButton();
		Thread.sleep(1000);
		//----------------ACCORDING TO SELECTED DATE IS IN DISPLAY PATIENT---------
		WebElement Patient_Display = driver.findElement(By.xpath("//span[contains(text(),'dudhe, praven')]"));
		String Expected_Patient = "dudhe, praven";
		Assert.assertEquals(Patient_Display.getText(), Expected_Patient);
		System.out.println("Search Patien is Displayed- PASSED");

	}

}
