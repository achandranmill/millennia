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

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		m.LastName("rajput");
		m.FirstName("praveen");
		m.Initial("kumar");
		m.PhoneNumber("9989593479");
		m.Email("praveen@gmail.com");
		m.DOB("19920406");
		m.MRN("000024");
		m.Search1();
		Thread.sleep(3000);
	}
}