package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_PatInt_tc_2 extends BaseClass

{
	
	//To verify that admin user able to click on Add Button and Enter data in Insurance Verification Functions 
	
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
		dept.Dep_PATIENINTAKE();
		Thread.sleep(20000);
		dept.InsuranceAdd();
		Thread.sleep(10000);
		dept.InsuranceName1("Hdfc Life");
		Thread.sleep(2000);
		dept.InsuranceValue1("200000");
		Thread.sleep(2000);
		dept.PatientIntakeSave();
		Thread.sleep(2000);
}
}