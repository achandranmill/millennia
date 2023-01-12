package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;

public class AdmUser_tc_17 extends BaseClass
{

	//Validate  that user able to filter record by applying Lastname, firstname, email address and role filter
	@Test
	public void AdmUser() throws InterruptedException 
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
		ad.registration();
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		ad.clkfilterbtn();
		Thread.sleep(5000);
		ad.filterlname("deo");
		Thread.sleep(5000);
		ad.filterbyfname("deo");
		Thread.sleep(5000);
		ad.filterbyemail("123er@mailinator.com");
		Thread.sleep(5000);
		ad.selectrole();
		Thread.sleep(5000);
		ad.filterbtnclk();
		Thread.sleep(5000);

	}

}


