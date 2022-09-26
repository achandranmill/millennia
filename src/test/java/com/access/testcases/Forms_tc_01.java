package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_01 extends BaseClass

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
		Thread.sleep(5000);
		ap.apptdaterange();
		Thread.sleep(5000);
		ap.apptdaterangestartdate("2022-01-01");
		Thread.sleep(5000);
		ap.apptdaterangeenddate("2022-06-30");
		Thread.sleep(5000);
		ap.applybtnclk();
		Thread.sleep(5000);
		ap.threedotclk();
		Thread.sleep(5000);
		ap.editappointmentclk();
		Thread.sleep(5000);
		ap.appointmentfuturedate();
		Thread.sleep(5000);
		ap.selectfuturedate("10/01/2022");
		Thread.sleep(5000);
		ap.changeappointmenttype();
		Thread.sleep(5000);
		ap.chooseappointmenttype();
		Thread.sleep(5000);
		ap.savefutureappointment();
		Thread.sleep(5000);
	}
}