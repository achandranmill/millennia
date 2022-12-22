package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_18 extends BaseClass

{


	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		Appointments ab = new Appointments(driver);
		ab.linkAppointment();
		ab.AppointDATE();
		Thread.sleep(10000);
		ab.Configurelist();
		Thread.sleep(1000);
		ab.EditStatusFilter();
		Thread.sleep(10000);
		ab.StatusCancelled();
		Thread.sleep(10000);
		ab.StatusSave();
		Thread.sleep(10000);
		ab.AppointDATE();
		Thread.sleep(10000);
		ab.AppointDATE1("2022-10-01");
		Thread.sleep(10000);
		ab.AppointDATE2("2022-10-31");
		Thread.sleep(1000);
		ab.AppointDATEAPPLY();
		Thread.sleep(10000);
		ab.ThreeDot();
		Thread.sleep(10000);
		ab.ThreeDotCancel();
		Thread.sleep(10000);
		ab.AdvanceSearch();
		Thread.sleep(10000);
		ab.Advance_Firstname("rakesh");
		Thread.sleep(10000);
		ab.Searchbtn();
	
}
}