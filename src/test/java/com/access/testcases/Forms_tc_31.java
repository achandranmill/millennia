package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_31 extends BaseClass

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
		Clipboard clip=new Clipboard(driver);
		Thread.sleep(5000);
		clip.clkappointmentlink();
		Thread.sleep(5000);
		clip.clkappointmentlink();
		Thread.sleep(5000);
		clip.form1threedotclick();
		Thread.sleep(5000);
		clip.form1clkformlink();
		Thread.sleep(5000);
		clip.form1makechanges();
		Thread.sleep(5000);
		//clip.form1editfirstname1("Gopal");
		//Thread.sleep(5000);
		clip.form1editlastname1("Bell");
		Thread.sleep(5000);
		clip.form1editssn("7687812345");
		Thread.sleep(5000);
		clip.form1savebtnclick();
		Thread.sleep(5000);


	}
}