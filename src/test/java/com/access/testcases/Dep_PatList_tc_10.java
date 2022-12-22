package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_PatList_tc_10 extends BaseClass

{
	
	//To verify that admin user able to click on Patient Lists link and Click on Discharge tab and Check box Functions working properly 
	
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
		Thread.sleep(5000);
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
		dept.Discharge();
		Thread.sleep(2000);
		dept.Discharge_ApptLocation();
		Thread.sleep(2000);
		dept.Discharge_ApptTime();
		Thread.sleep(2000);
		dept.Discharge_DOB();
		Thread.sleep(2000);
		dept.Discharge_Gender();
		Thread.sleep(2000);
		dept.Discharge_MRN();
		Thread.sleep(2000);
		dept.Discharge_Name();
		Thread.sleep(2000);
		dept.Discharge_Seeing();
		Thread.sleep(2000);
		dept.Discharge_Status();
		Thread.sleep(2000);
		dept.Discharge_VisitCode();
		Thread.sleep(2000);
		dept.Discharge_Save();
		Thread.sleep(2000);
		dept.Discharge_SaveMessage();
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
		w.EditColumns_Discharge();
		Thread.sleep(2000);
		w.Discharge_Setdefault();
		Thread.sleep(5000);
		w.DischargeViwe();
		Thread.sleep(10000);

}
}