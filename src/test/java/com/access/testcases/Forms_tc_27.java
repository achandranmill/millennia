package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_27 extends BaseClass

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
		try
		{
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		//-----------------REGISTRATION PAGE ------------------------------
		//ad.registration();
		//Thread.sleep(5000);
		Clipboard clip=new Clipboard(driver);
		Thread.sleep(5000);
		clip.clkregistrationlink();
		Thread.sleep(10000);
		clip.clkclipboardlink();
		Thread.sleep(2000);
		clip.cliplastname("Nehra");
		Thread.sleep(2000);
		clip.clipfirstname("Ashish");
		Thread.sleep(2000);
		clip.clipmiddlename("Das");
		Thread.sleep(2000);
		clip.clipemail("ashish@mailinator.com");
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
		clip.Appttype3();
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
		clip.form3firstname("Ashish");
		Thread.sleep(2000);
		clip.form3lastname("Nehra");
		Thread.sleep(2000);
		clip.form3gender();
		Thread.sleep(2000);
		clip.form3address("New South Hampton");
		Thread.sleep(2000);
		clip.form3ssn("6789012345");
		Thread.sleep(2000);
		clip.form3email("ashish@mailinator.com");
		Thread.sleep(2000);
		clip.form3homephone("9801234567");
		Thread.sleep(2000);
		clip.form3cellphone("6789012345");
		Thread.sleep(2000);
		clip.form3primaryinsurance("Appolo");
		Thread.sleep(2000);
		clip.form3policyholdername("Raj Singh");
		Thread.sleep(2000);
		clip.form3policyholderdob("12-10-1990");
		Thread.sleep(2000);
		clip.form3pharmacyname("Appolo Pharmacy");
		Thread.sleep(2000);
		clip.form3pharmacyaddress("New wales, street 1");
		Thread.sleep(2000);
		clip.form3pharmacyphone("5678912345");
		Thread.sleep(2000);
		clip.form3save();
		Thread.sleep(5000);










	}
}