package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.*;

@Test
public class Massm_tc_1  extends BaseClass

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
		Thread.sleep(3000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		m.LastName("rajput");
		Thread.sleep(2000);
		m.FirstName("praveen");
		Thread.sleep(2000);
		m.Initial("kumar");
		Thread.sleep(2000);
		m.PhoneNumber("9989593479");
		Thread.sleep(2000);
		m.Email("praveen@gmail.com");
		Thread.sleep(2000);
		m.DOB("19920406");
		Thread.sleep(2000);
		m.MRN("000024");
		Thread.sleep(2000);
		m.Search1();
		Thread.sleep(3000);
	}
}