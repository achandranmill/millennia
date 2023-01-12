package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_PatList_tc_8 extends BaseClass

{

	//To verify that admin user able to click on Patient Lists link and Click on Work List tab and Check box Functions working properly 

	public void departments() throws InterruptedException 
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
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
		dept.WorkList();
		Thread.sleep(2000);
		dept.Work_Checkintime();
		Thread.sleep(2000);
		dept.Work_DOB();
		Thread.sleep(2000);
		dept.Work_Location();
		Thread.sleep(2000);
		dept.Work_MRN();
		Thread.sleep(2000);
		dept.Work_Name();
		Thread.sleep(2000);
		dept.Work_VisitCode();
		Thread.sleep(2000);
		dept.work_Save();
		Thread.sleep(2000);
		dept.work_Save_message();
		Thread.sleep(2000);
		dept.adminprofileclk();
		Thread.sleep(2000);
		dept.returntoaccess();
		Thread.sleep(2000);
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		w.Configure();
		Thread.sleep(3000);
		w.EditListColumns();
		Thread.sleep(5000);
		w.Columns_SettoDefaults();
		Thread.sleep(5000);


	}
}