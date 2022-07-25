package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Departments;
import com.access.pageobject.Organization;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_09 extends BaseClass

{
	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//RegtPage r=new RegtPage(driver);
		//r.clickRegistrationPage();
		//Thread.sleep(3000);
		
		AdmUser ad=new AdmUser(driver);
		
		ad.registration();
		Thread.sleep(5000);
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(5000);
		ap.threedotclick();
		Thread.sleep(5000);
		ap.formsclick1();
		Thread.sleep(5000);
		ap.covidscreeningforms();
		Thread.sleep(5000);
		ap.printbutton();
		Thread.sleep(5000);
		
	}
}