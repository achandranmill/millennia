package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;



@Test
public class Palkup_tc_3 extends BaseClass

{
	public void UserTestPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		UserTestPage u =new  UserTestPage(driver);

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		u.linkUserTest();
		Thread.sleep(3000);
		u.patientLookup();
		u.Location();
		Thread.sleep(3000);
		u.UncheckAll();
		u.Date();
		Thread.sleep(3000);
		u.daterangepicker_start("2022-03-01");
		Thread.sleep(2000);
		u.daterangepicker_end("2022-04-01");
		Thread.sleep(2000);
		u.DateApply();
		u.Search();
		Thread.sleep(3000);
	}
}