package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_PatList_tc_11 extends BaseClass

{

	
	// To verify that admin user able to click on Work list tab and without select any check box ,save data is display the message
	
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
//	pd.LocationPopup("Florida");
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
	dept.work_Named();
	Thread.sleep(2000);
	dept.work_Save();
	Thread.sleep(20000);
	dept.work_Atleastonefieldmustbeselectetosave();
	Thread.sleep(5000);
}
}