package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Departments;
import com.access.pageobject.Organization;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_06 extends BaseClass

{
	public void Appointments() throws Exception
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
		Thread.sleep(5000);
		Clipboard clip=new Clipboard(driver);
		Thread.sleep(5000);
		clip.clkclipboardlink();
		Thread.sleep(5000);
		clip.clkappointmentlink();
		Thread.sleep(5000);
		clip.appointmentthreedots();
		Thread.sleep(5000);
		//clip.appointmentforms();
		//Thread.sleep(5000);
		clip.appointmentformslinkclk();
		Thread.sleep(5000);
		clip.covidscreeningformsclk();
		Thread.sleep(5000);
		clip.clkprintoption();
		Thread.sleep(5000);
		
	}
}