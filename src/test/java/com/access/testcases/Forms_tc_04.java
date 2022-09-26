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
public class Forms_tc_04 extends BaseClass

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
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(5000);
		og.newappointmenttype();
		Thread.sleep(5000);
		og.editvisitbtn();
		Thread.sleep(5000);
		og.removeforms();
		Thread.sleep(5000);
		//og.removeforms1();
		//Thread.sleep(5000);
		//og.removeforms2();
		//Thread.sleep(5000);
		og.formsave();
		Thread.sleep(5000);
		og.orgadminprofile();
		Thread.sleep(5000);
		og.orgreturntoaccess();
		Thread.sleep(5000);
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(5000);
		ap.apptdaterange();
		Thread.sleep(5000);
		ap.apptdaterangestartdate("2022-07-13");
		Thread.sleep(5000);
		ap.apptdaterangeenddate("2022-07-13");
		Thread.sleep(5000);
		ap.applybtnclk();
		Thread.sleep(5000);
		
		ap.threedot();
		Thread.sleep(5000);
		ap.editappt();
		Thread.sleep(5000);
		ap.apptdatetime("10/01/2022");
		Thread.sleep(5000);
		ap.apptsavechanges();
		Thread.sleep(5000);
		ap.apptdaterange();
		Thread.sleep(5000);
		ap.apptdaterangestartdate("2022-09-01");
		Thread.sleep(5000);
		ap.apptdaterangeenddate("2022-10-30");
		Thread.sleep(5000);
		ap.applybtnclk();
		Thread.sleep(5000);
		ap.sjthreedots();
		Thread.sleep(5000);
		ap.sjforms();
		Thread.sleep(5000);
		

		
	}
}