package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_19 extends BaseClass

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
			og.MessageAddnew();
			Thread.sleep(2000);
			og.CreateCustomMessage();
			Thread.sleep(2000);
			og.MessageContinue();
			Thread.sleep(5000);
			og.MessageTitle("INSTRUCTOR_CHANGE");
			Thread.sleep(2000);
			og.MessageCategory_SCHEDULE();
			Thread.sleep(2000);
			og.MessageTrigger_INSTRUCTOR_CHANGE();
			Thread.sleep(2000);
			og.MessageLimits();
			Thread.sleep(1000);
			og.CheckAll();
			Thread.sleep(1000);
			og.MessageTitle("");
			Thread.sleep(10000);
			og.TextMessage();
			Thread.sleep(10000);
			og.SendFrom();
			Thread.sleep(10000);
			og.Message_Recipients();
			Thread.sleep(10000);
			og.Message_Recipients_Appointment();
			Thread.sleep(10000);
			og.TextMessageContent("Appointment is Canceled");
			Thread.sleep(1000);
			og.MessageSaveChange();
		
	
}

}
