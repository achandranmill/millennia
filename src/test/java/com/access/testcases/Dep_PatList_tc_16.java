package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_PatList_tc_16 extends BaseClass

{

	// To verify that admin user able to click on cancel button and cancel work properly
	
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
		dept.Discharge_Cancel();
		Thread.sleep(10000);

}
}