package com.access.testcases;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.loginpage;

@Test
public class Appt_tc_7 extends BaseClass
{
	
	//------------------------Page loads in 3 seconds or less----------------------------
	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		AdmUser ad=new AdmUser(driver);
		try
		{
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		System.out.println("USER LOCATION IS PRESENT");
		}
		catch(Exception e) 
		{
			System.out.println("USER LOCATION IS PRESENT");
			
		}
		//----------------------------APPOINTMENT PAGE-----------------
		Appointments ap=new Appointments(driver);
		Thread.sleep(5000);
        ap.linkAppointment();
	}
}