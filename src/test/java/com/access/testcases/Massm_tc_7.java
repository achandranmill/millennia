package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.MassMessaging;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;


@Test
public class Massm_tc_7  extends BaseClass

{

	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 RegtPage r=new RegtPage(driver);
		 r.clickRegistrationPage();
		 Thread.sleep(3000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(1000);
		m.DepartmentFilter();
		Thread.sleep(1000);
		m.Clinic();
		Thread.sleep(3000);
		m.DepartmentSave();
			Thread.sleep(1000);
		m.SeeingFilter();
		Thread.sleep(2000);
		m.SeeingSelectAll();
		Thread.sleep(3000);
		m.SeeingCancel();
		Thread.sleep(3000);
		m.StatusFilter();
		Thread.sleep(3000);
		m.StatusFilterConfirmed();
		Thread.sleep(3000);
		m.StatusFilterSave();
		Thread.sleep(3000);
		m.Eligible();
		Thread.sleep(3000);
	}
	
	
}
