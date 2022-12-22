package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_23 extends BaseClass

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
		clip.cliplastname("Modi");
		Thread.sleep(2000);
		clip.clipfirstname("Lalita");
		Thread.sleep(2000);
		clip.clipmiddlename("Das");
		Thread.sleep(2000);
		clip.clipemail("lalita@mailinator.com");
		clip.clipdateofbirth("03-11-2000");
		Thread.sleep(2000);
		clip.clipphone("9012345675");
		Thread.sleep(2000);
		//clip.clipemail("belley1@mailinator.com");
		clip.clipappointment("11:50");
		Thread.sleep(5000);
		clip.cliplocation();
		Thread.sleep(5000);
		clip.cliplocationoption();
		Thread.sleep(5000);
		clip.clipdepartmenttype();
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
		clip.Clipappointmenttype();
		Thread.sleep(2000);
		clip.Appttype1();
		Thread.sleep(2000);
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
		clip.appointmentforms();
		Thread.sleep(5000);
		clip.from1firstname("Lalita");
		Thread.sleep(2000);
		clip.from1lastname("Modi");
		Thread.sleep(2000);
		clip.from1gender();
		Thread.sleep(2000);
		clip.from1DOB("03-11-2000");
		Thread.sleep(2000);
		clip.from1address("Florida Hills, street no.5");
		Thread.sleep(2000);
		clip.from1SSN("1234567890");
		Thread.sleep(2000);
		clip.from1email("lalita@mailinator.com");
		Thread.sleep(2000);
		clip.from1homephone("9876543212");
		Thread.sleep(2000);
		clip.from1cellphone("9876543212");
		Thread.sleep(2000);
		clip.from1priinsurancename("Lalit");
		Thread.sleep(2000);
		clip.from1policyholder("Ajay Singh");
		Thread.sleep(2000);
		clip.from1policyholderdob("12-10-2000");
		Thread.sleep(2000);
		clip.from1clicksavebtn();
		Thread.sleep(5000);
		//clip.clkclipboardlink();
		//Thread.sleep(2000);
		//clip.clkappointmentlink();
		//Thread.sleep(5000);
		//clip.appointmentthreedots();
		//Thread.sleep(2000);
		//clip.appointmentforms();
		//Thread.sleep(5000);


	}
}