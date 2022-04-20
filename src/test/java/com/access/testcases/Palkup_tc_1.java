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
		u.Clinic();
		u.Date();
		u.daterangepicker_start("20220401");
		u.daterangepicker_end("20220412");
		u.DateApply();

		u.Search();
		Thread.sleep(3000);
	}
}
