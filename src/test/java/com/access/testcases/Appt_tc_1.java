package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;

import com.access.pageobject.loginpage;


public class Appt_tc_1 extends BaseClass

{
	@Test
	public void Appointments() throws Exception
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

		Appointments ap=new Appointments(driver);

		ap.linkAppointment();
		ap.SearchLastName("Solanki");
		Thread.sleep(3000);
		ap.SearchButton();

	}

}
