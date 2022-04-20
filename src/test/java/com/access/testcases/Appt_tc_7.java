package com.access.testcases;
import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.loginpage;

@Test
public class Appt_tc_7 extends BaseClass
{
	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Appointments ap=new Appointments(driver);
        ap.linkAppointment();
	}
}