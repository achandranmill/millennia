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
public class Forms_tc_14 extends BaseClass

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
		clip.clkregistrationlink();
		Thread.sleep(10000);
		clip.clkclipboardlink();
		Thread.sleep(5000);
		clip.cliplastname("Verma");
		Thread.sleep(5000);
		clip.clipfirstname("Ram");
		Thread.sleep(5000);
		clip.clipmiddlename("rr");
		Thread.sleep(5000);
		clip.clipdateofbirth("10-12-1990");
		Thread.sleep(5000);
		clip.clipphone("9012345670");
		Thread.sleep(5000);
		clip.clipemail("ram1@mailinator.com");
		clip.clipappointment("11:50");
		Thread.sleep(5000);
		clip.nextnodedropdown();
		Thread.sleep(5000);
		clip.nextnodedropdownoption();
		Thread.sleep(5000);
		clip.seeingoption1();
		Thread.sleep(5000);
		clip.seeingoptionselect1();
		//clip.copaytitle("700");
		//Thread.sleep(5000);
		clip.cliplinkconnectaccount();
		Thread.sleep(5000);
		clip.clipaddpatient();
		Thread.sleep(5000);
		clip.clkappointmentlink();
		Thread.sleep(5000);
		clip.appointmentthreedots();
		Thread.sleep(5000);
		//clip.appointmentforms();
		//Thread.sleep(5000);
		clip.appointmentformslinkclk();
		Thread.sleep(5000);
		clip.patientdemographicform();
		Thread.sleep(5000);
		clip.firstnamepatient("Raju");
		Thread.sleep(5000);
		clip.lastnamepatient("Thakur");
		Thread.sleep(5000);
		clip.middlenamepatient("Das");
		Thread.sleep(5000);
		clip.dateselectpatient("31-08-2022");
		Thread.sleep(5000);
		clip.formsavedemographic();
		Thread.sleep(5000);
		clip.printbutton1();
		Thread.sleep(5000);
		
		
	}
}