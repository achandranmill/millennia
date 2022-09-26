package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.*;


@Test
public class Palkup_tc_1 extends BaseClass

{

	public void UserTestPage() throws Exception
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
		Thread.sleep(5000);
		UserTestPage u =new  UserTestPage(driver);
		
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		u.linkUserTest();
		Thread.sleep(3000);
		u.patientLookup();
		u.patientLookuplastName("rajput");
		u.patientLookupfirstName("praveen");
		u.patientLookupvisitCode("03");
		u.Location();
		Thread.sleep(3000);
		u.Nextnode();
		u.Date();
		u.daterangepicker_start("2022-09-01");
		u.daterangepicker_end("2022-09-15");
		Thread.sleep(5000);
		u.DateApply();

		u.Search();
		Thread.sleep(3000);
	}
}
