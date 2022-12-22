package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Reg_tc_6 extends BaseClass
{

	@Test
	public void RegtPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		r.clickredit("", "", "");
		r.gender("");
		Thread.sleep(5000);
		r.Editseeing();
		r.Number("");
		r.Email("");
		r.contactname("");
		r.contactnumber("");
		r.Editcopay();
		r.Copay("");
		Thread.sleep(3000);
		r.comment("");
		r.sms();
	}
}