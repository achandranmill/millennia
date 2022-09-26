package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_PatList_tc_9 extends BaseClass

{

	//To verify that admin user able to click on Patient Lists link and Click on Appointments tab and Check box Functions working properly 
	
	public void departments() throws InterruptedException 
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Provider pd = new Provider(driver);
//		pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.PatientLists();
		Thread.sleep(2000);
		dept.Appointments();
		Thread.sleep(2000);
		dept.Appoint_ApptTime();
		Thread.sleep(2000);
		dept.Appoint_DOB();
		Thread.sleep(2000);
		dept.Appoint_Flags();
		Thread.sleep(2000);
		dept.Appoint_Gender();
		Thread.sleep(2000);
		dept.Appoint_MRN();
		Thread.sleep(2000);
		dept.Appoint_NAME();
		Thread.sleep(2000);
		dept.Appoint_VisitCode();
		Thread.sleep(2000);
		dept.Appoint_SAVE();
		Thread.sleep(2000);
		dept.Appoint_SaveMessage();
		Thread.sleep(3000);
		dept.adminprofileclk();
		Thread.sleep(2000);
		dept.returntoaccess();
		Thread.sleep(2000);
		Appointments ap=new Appointments(driver);
        ap.linkAppointment();
        Thread.sleep(5000);
        ap.Configurelist();
        Thread.sleep(2000);
        ap.EditListColumns();
        Thread.sleep(2000);
        ap.Columns_Defaultsset();
        Thread.sleep(5000);
        ap.AppointDATE();
        Thread.sleep(2000);
        ap.AppointDATE1("20220301");
        Thread.sleep(2000);
        ap.AppointDATE2("20220430");
        Thread.sleep(2000);
        ap.AppointDATEAPPLY();
        Thread.sleep(10000);
        
        
		
}
}