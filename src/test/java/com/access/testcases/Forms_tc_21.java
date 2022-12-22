package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_21 extends BaseClass

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
		clip.cliplastname("Gill");
		Thread.sleep(2000);
		clip.clipfirstname("Peter");
		Thread.sleep(2000);
		clip.clipmiddlename("Das");
		Thread.sleep(2000);
		clip.clipemail("peter@mailinator.com");
		clip.clipdateofbirth("12-12-1992");
		Thread.sleep(2000);
		clip.clipphone("9012345675");
		Thread.sleep(2000);
		clip.clipappointment("11:50");
		Thread.sleep(5000);
		clip.cliplocation();
		Thread.sleep(5000);
		clip.cliplocationoption();
		Thread.sleep(5000);
		clip.clipdepartmenttype();
		Thread.sleep(5000);
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
		clip.clipappointmenttype();
		Thread.sleep(2000);
		clip.Clipappointmenttypetest();
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
		Thread.sleep(2000);
		clip.appointmentforms();
		Thread.sleep(2000);
		clip.Appointform2clk();
		Thread.sleep(5000);


	}
}