package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_Mobile_tc_6 extends BaseClass

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
	    dept.OrgnizationAddress();
	    Thread.sleep(3000);
	    dept.Showplaceinline();
	    Thread.sleep(2000);
	    dept.showWaitTime();
	    Thread.sleep(2000);
	    dept.progressText("continue");
	    Thread.sleep(2000);
	    dept.Progresssteps_Name("2");
	    Thread.sleep(5000);
	    dept.ChooseDepartment();
	    Thread.sleep(2000);
	    dept.ChooseAFilter();
	    Thread.sleep(2000);
	    dept.CallBack("call back");
	    Thread.sleep(3000);
	    dept.MobileWaitingSAVE();
	    Thread.sleep(3000);
	  
	    
	
	
	}	
}
