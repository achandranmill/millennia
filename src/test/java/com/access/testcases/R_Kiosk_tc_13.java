package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Kiosk;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_13 extends BaseClass

{
	public void Kiosk() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
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
		Provider pd = new Provider(driver);
//		pd.LocationPopup("Florida");
		Thread.sleep(10000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Kiosk k = new Kiosk(driver);
		k.Department_Link();
		Thread.sleep(1000);
		k.Kiosk();
		Thread.sleep(1000);
		k.Kiosk_AddNewAppointmentFlow();
		Thread.sleep(10000);
		k.Kiosk_AddPage();
		Thread.sleep(10000);
		k.Kiosk_PageName("please Complete the Field");
		Thread.sleep(1000);
		k.Kiosk_Pagetype();
		Thread.sleep(1000);
		k.Kiosk_pagename_Addmore();
		Thread.sleep(1000);
		k.Kiosk_Pagename_FieldFirst();
		Thread.sleep(1000);
		k.Kiosk_Pagename_fieldSizeFirst();
		Thread.sleep(1000);
		k.Kiosk_Pagename_Title("First Name");
		k.Kiosk_AddMore();
		k.Kiosk_Pagename_FieldLastName();
		Thread.sleep(1000);
		k.Kiosk_Pagename_fieldSizeLN();
		Thread.sleep(1000);
		k.Kiosk_Pagename_Title("Last Name");
		Thread.sleep(1000);
		k.Kiosk_Add();
		Thread.sleep(20000);
		k.Kiosk_AddPage();
		Thread.sleep(10000);
		k.Kiosk_PagetVerification_title("please verify the below information is correct");
		Thread.sleep(1000);
	    k.Kiosk_PagetVerification();
	    Thread.sleep(1000);
		k.Kiosk_pagename_VerificationfirstName();
		Thread.sleep(1000);
		k.Kiosk_pagename_VerificationlastName();
		Thread.sleep(1000);
        k.Kiosk_Pagename_Add();
		Thread.sleep(1000);
		k.Kiosk_Savebutton();
		Thread.sleep(10000);
		driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(10000);
		k.Press_HereTo_Start();
		Thread.sleep(10000);
		k.FirstName("Awdesh");
		Thread.sleep(1000);
		k.LastName("Jain");
		Thread.sleep(1000);
		k.Kiosk_DOB();
		Thread.sleep(1000);
		k.Kiosk_1990();
		Thread.sleep(1000);
		k.Kiosk_1995();
		Thread.sleep(1000);
		k.Kiosk_Feb();
		Thread.sleep(1000);
		k.Kiosk_1();
		Thread.sleep(10000);
		k.Search();
		Thread.sleep(10000);
		WebElement Search_Again = driver.findElement(By.xpath("//button[contains(text(),'Search Again')]"));
		Assert.assertEquals(true, Search_Again.isDisplayed());
		System.out.println("Search Again button displayed");
		Thread.sleep(1000);
		WebElement New_Appointment = driver.findElement(By.xpath("//button[contains(text(),'New Appointment')]"));
		Assert.assertEquals(true, New_Appointment.isDisplayed());
		System.out.println("New Appointment button displayed");
		Thread.sleep(10000);
		k.Search_Again();
		Thread.sleep(10000);
		k.Search_Again_First("Awadesh");
		Thread.sleep(1000);
		k.Search_Again_Last("Jain");
		Thread.sleep(10000);
		k.Search_Again_DOB();
		Thread.sleep(1000);
		k.Search_Again_1990();
		Thread.sleep(1000);
		k.Search_Again_1992();
		Thread.sleep(1000);
		k.Search_Again_JAN();
		Thread.sleep(1000);
		k.Search_Again_JAN10();
		Thread.sleep(10000);
		k.Search_Again_Search2();
		Thread.sleep(10000);
		WebElement Search_Again2 = driver.findElement(By.xpath("//button[contains(text(),'Search Again')]"));
		Assert.assertEquals(true, Search_Again2.isDisplayed());
		System.out.println("Search Again button displayed");
		Thread.sleep(1000);
		WebElement New_Appointment2 = driver.findElement(By.xpath("//button[contains(text(),'New Appointment')]"));
		Assert.assertEquals(true, New_Appointment2.isDisplayed());
		System.out.println("New Appointment button displayed");
		Thread.sleep(10000);
		k.New_Appointment();
		Thread.sleep(1000);
		k.New_Appointment_CheckIN();
		Thread.sleep(10000);
		
		

}

}
