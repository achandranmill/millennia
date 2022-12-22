package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_Mobile_tc_7 extends BaseClass

{
	public void departments() throws Exception 
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
	//	pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.MobilewaitingRoom();
		Thread.sleep(2000);
		dept.AddNewProgressSteps();
		Thread.sleep(2000);
		dept.AddnewProgress_name("3");
		Thread.sleep(2000);
		dept.AddnewProgress_choosedepartment();
		Thread.sleep(2000);
		dept.AddnewProgress_choosedepartment_next();
		Thread.sleep(10000);
		dept.AddnewProgress_chooseFilter();
		Thread.sleep(10000);
		dept.AddnewProgress_chooseFilter_Registration();
		Thread.sleep(2000);
	     dept.MobileWaitingSAVE();
	     Thread.sleep(4000);
	
	
}
}