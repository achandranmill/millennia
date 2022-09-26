package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_00 extends BaseClass

{

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
		Thread.sleep(3000);
		ap.AppointDATE();
		Thread.sleep(3000);
		ap.AppointDATE1("2022-03-30");
		Thread.sleep(3000);
		ap.AppointDATE2("2022-04-06");
		Thread.sleep(15000);
		ap.AppointDATEAPPLY();
		Thread.sleep(15000);
		ap.Configurelist();
		Thread.sleep(15000);
		ap.EditStatusFilter();
		Thread.sleep(15000);
		ap.StatusUnconfirmed();
		Thread.sleep(15000);
		ap.StatusSave();
		Thread.sleep(15000);
		ap.ThreeDot();
		Thread.sleep(15000);
		ap.ThreDotSetConfirmed();
		Thread.sleep(15000);
		ap.ThreeDot();
		Thread.sleep(20000);
		ap.ThreDotSetUnconfirmed();
		Thread.sleep(15000);

	}
}