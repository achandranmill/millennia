package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;



@Test
public class Org_tc_17  extends BaseClass

{
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
			og.Messages();
			Thread.sleep(2000);
			og.MessageAddnew();
			Thread.sleep(2000);
			og.CreateCustomMessage();
			Thread.sleep(2000);
			og.MessageContinue();
			Thread.sleep(2000);
			og.MessageTitle("hi");
			Thread.sleep(2000);
			og.MessageCategory();
			Thread.sleep(2000);
			og.MessageLimits();
			Thread.sleep(2000);
			og.CheckAll();
			Thread.sleep(2000);
			og.MessageTrigger();
			Thread.sleep(5000);
			og.MessageSaveChange();
	
}
}