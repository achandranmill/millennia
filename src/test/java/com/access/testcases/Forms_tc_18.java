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
public class Forms_tc_18 extends BaseClass

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
		//ad.registration();
		//Thread.sleep(5000);
		Clipboard clip=new Clipboard(driver);
		Thread.sleep(5000);
		clip.clkregistrationlink();
		Thread.sleep(10000);
		clip.clkclipboardlink();
		Thread.sleep(2000);
		clip.cliplastname("Desai");
		Thread.sleep(2000);
		clip.clipfirstname("Mohan");
		Thread.sleep(2000);
		clip.clipmiddlename("Das");
		Thread.sleep(2000);
		clip.clipemail("mohan@mailinator.com");
		clip.clipdateofbirth("12-12-1990");
		Thread.sleep(2000);
		clip.clipphone("9012345671");
		Thread.sleep(2000);
		//clip.clipemail("belley1@mailinator.com");
		clip.clipappointment("11:50");
		Thread.sleep(5000);
		clip.cliplocation();
		Thread.sleep(5000);
		clip.cliplocationoption();
		Thread.sleep(5000);
		//clip.clipdepartmenttype();
		Thread.sleep(5000);
		//clip.clipdepartmenttypeoption();
		//Thread.sleep(5000);
		clip.clipseeing();
		Thread.sleep(5000);
		clip.clipseeingoption();
		Thread.sleep(5000);
		clip.clipflagbtnclk();
		Thread.sleep(5000);
		clip.clipflagoption();
		Thread.sleep(5000);
		clip.clipcomment("test");
		Thread.sleep(5000);
		//clip.clipappointmenttype();
		Thread.sleep(2000);
		//clip.clipappointmenttypeoption();
		Thread.sleep(2000);
		//clip.clipvisittitle("Treatment");
		//Thread.sleep(5000);
		//clip.copaytitle("700");
		//Thread.sleep(5000);
		clip.cliplinkconnectaccount();
		Thread.sleep(5000);
		clip.clipaddpatient();
		Thread.sleep(5000);
		clip.clipcheckin();
		Thread.sleep(5000);
		clip.clipcheckinconf();
		Thread.sleep(5000);
		clip.clkappointmentlink();
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
		//clip.clkprintoption();
		//Thread.sleep(5000);
		clip.covid19symptomsradio();
		Thread.sleep(5000);
		//clip.leftcountry1();
		//Thread.sleep(5000);
		//clip.leftcountryselect1();
		//Thread.sleep(5000);
		clip.havecranberry();
		Thread.sleep(5000);
		clip.difficultybreathing();
		Thread.sleep(5000);
		//clip.havecranberry();
		//Thread.sleep(5000);
		//clip.dohavecovid();
		//Thread.sleep(5000);
		//clip.dohavecovidselect();
		//Thread.sleep(5000);
		clip.choosefile1();
		Thread.sleep(5000);
		clip.choosefile2();
		Thread.sleep(5000);
		clip.saveformclk1();
		Thread.sleep(5000);
		
		
	}
}