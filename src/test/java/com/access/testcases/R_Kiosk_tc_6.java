package com.access.testcases;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.*;

@Test
public class R_Kiosk_tc_6 extends BaseClass

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
		WebElement Add_New_Appoint=driver.findElement(By.xpath("//input[@id=\"enable-add-new-patient\"]"));
		if(!Add_New_Appoint.isSelected())
		{
			Add_New_Appoint.click();
		}
		else
		{

		}
		//WebElement Add_page=driver.findElement(By.xpath("//a[@id='add-new-patient-add-page']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();", Add_page);
		Thread.sleep(15000);
		k.Kiosk_AddPage();
		Thread.sleep(10000);
		k.Kiosk_PageName("please Complete the Field");
		Thread.sleep(1000);
		k.Kiosk_Pagetype();
		Thread.sleep(1000);
		k.Kiosk_pagename_Addmore();
		Thread.sleep(1000);
		k.Kiosk_Pagename_FieldFirst();
		Thread.sleep(3000);
		k.Kiosk_Pagename_fieldSizeFirst();
		Thread.sleep(3000);
		k.Kiosk_Pagename_First_Title("First Name");
		Thread.sleep(3000);
		k.Kiosk_AddMore();
		Thread.sleep(3000);
		k.Kiosk_Pagename_FieldLastName();
		Thread.sleep(3000);
		k.Kiosk_Pagename_fieldSizeLN();
		Thread.sleep(3000);
		k.Kiosk_Pagename_Last_Title("Last Name");
		Thread.sleep(3000);
		k.Kiosk_AddMore();
		Thread.sleep(3000);
		k.DOB_Wizard();
		Thread.sleep(3000);
		k.Dob_fieldSizeA();
		Thread.sleep(3000);
		k.Dob_Wizard("Dob Wizard");
		Thread.sleep(3000);
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
		Thread.sleep(10000);
		WebElement Search_checkbox=driver.findElement(By.xpath("//input[@id=\"search-appointment\"]"));
		if(!Search_checkbox.isSelected())
		{
			Search_checkbox.click();
		}
		else
		{

		}
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointment_Addpage();
		Thread.sleep(10000);
		k.Kiosk_ExistingAppointmen_Pagename("Please Complete the Field");
		Thread.sleep(10000);
		k.Kiosk_ExistingAppointmen_PageType();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_Addmore();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_FirstName();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_FieldSize();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_FieldTitle("First Name");
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_Addmore();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_LastName();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_FieldSize();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_FieldTitle("Last Name");
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointme_ADD();
		Thread.sleep(5000);
		k.Kiosk_ExistingAppointment_Addpage();
		Thread.sleep(10000);
		k.Kiosk_ExistingAppointmen_verification_page("Please verify the below information is correct");
		Thread.sleep(10000);
		k.Kiosk_ExistingAppointmen_PageVerification();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointmen_PageVerification_firstName();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointmen_PageVerification_lastName();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointmen_PageVerification_Add();
		Thread.sleep(10000);
		WebElement Save_button=driver.findElement(By.xpath("//*[@id=\"kiosk-config-save-button\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Save_button);
		Thread.sleep(10000);
		k.Kiosk_Savebutton();








	}
}