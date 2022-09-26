package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_Kiosk_tc_31 extends BaseClass

{
	
	public void departments() throws InterruptedException 
	{
		

		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Provider pd = new Provider(driver);
	//	pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.Dep_Kiosk();
		Thread.sleep(2000);
		dept.Kiosk_AddNewAppointmentFlow();
		Thread.sleep(2000);
		dept.Kiosk_AddPage();
		Thread.sleep(2000);
		dept.Kiosk_PageName("NewApp");
		Thread.sleep(2000);
		dept.Kiosk_Pagetype();
		Thread.sleep(2000);
		dept.Kiosk_AddMore();
		Thread.sleep(2000);
		dept.Kiosk_Pagename_FieldSeeing();
		Thread.sleep(2000);
		dept.Kiosk_Pagename_fieldSize();
		Thread.sleep(2000);
		dept.Kiosk_Pagename_Title("Seeing title");
		Thread.sleep(2000);
		dept.Kiosk_Pagename_Placeholder("title");
		Thread.sleep(3000);
		dept.Kiosk_Pagename_RequiredCheck();
		Thread.sleep(2000);
		dept.Kiosk_Pagename_Add();
		Thread.sleep(2000);
		
		
		
		
		
	}

}
