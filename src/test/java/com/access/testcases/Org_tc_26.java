package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_26 extends BaseClass

{
	
	//To verify that admin able to click on Documents tab and Form on Demand Filter Page works properly
	
	 public void Organization() throws Exception
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
			Thread.sleep(3000);
			Organization og = new Organization(driver);
			og.Organization();
			Thread.sleep(3000);
			og.Documents();
			Thread.sleep(2000);
			og.DocumentFormDemand();
			Thread.sleep(2000);
			og.DocumentSelectAll();
			Thread.sleep(2000);
			og.DocumentClose();
			Thread.sleep(2000);
			
}
}
