package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_17 extends BaseClass

{
	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(10000);
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
			og.MessageEdit();
			Thread.sleep(10000);
			og.MessageEdit_Title("New Message");
			Thread.sleep(10000);
			og.MessageEdit_Category();
			Thread.sleep(10000);
			og.MessageEdit_Trriger();
			Thread.sleep(10000);
			og.MessageEdit_Limits();
			Thread.sleep(10000);
			og.MessageEdit_CheckAll();
			Thread.sleep(10000);
			og.MessageEdit_Save();
			Thread.sleep(10000);
			

}
}