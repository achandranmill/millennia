package com.access.testcases;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

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
		//AdmUser ad=new AdmUser(driver);
		//ad.userlocation();
		//Thread.sleep(5000);
		//ad.okbutton();
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
		Thread.sleep(10000);
		k.Kiosk_SearchAppointmentFlow();
		Thread.sleep(1000);
		k.Kiosk_searchpageconfigurebutton();
		Thread.sleep(2000);
		k.Kiosk_welcomemessageinput("Please Search the Appointment");
		Thread.sleep(1000);
		//k.Kiosk_AddMore();
		Thread.sleep(1000);
		k.Kiosk_FieldTypeFirstName();
		Thread.sleep(1000);
		k.Kiosk_fieldSize();
		Thread.sleep(1000);
		k.Kiosk_FieldTitle("First_Name");
		Thread.sleep(1000);
		//k.Kiosk_AddMore();
		Thread.sleep(1000);
		k.Kiosk_FieldTypeLastName();
		Thread.sleep(1000);
		k.Kiosk_FieldTitle("Last_Name");
		k.Kiosk_fieldSize();
		Thread.sleep(1000);
		k.Kiosk_Done();
		Thread.sleep(10000);
		k.Kiosk_ExistingAppointment_Addpage();
		Thread.sleep(10000);
		k.Kiosk_ExistingAppointmen_Pagename("please Complete the Field");
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
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointment_Addpage();
		Thread.sleep(10000);
		k.Kiosk_ExistingAppointmen_verification_page("please verify the below information is correct");
		Thread.sleep(10000);
		k.Kiosk_ExistingAppointmen_PageVerification();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointmen_PageVerification_firstName();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointmen_PageVerification_lastName();
		Thread.sleep(1000);
		k.Kiosk_ExistingAppointmen_PageVerification_Add();
		Thread.sleep(10000);
		
		
		
		
		
		
		

}
}