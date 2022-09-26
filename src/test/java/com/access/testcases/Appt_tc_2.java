package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_2 extends BaseClass

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
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		Appointments Click =new Appointments(driver);

		Click.linkAppointment();
		Thread.sleep(10000);
		Click.AdvanceSearch();
		Thread.sleep(3000);
		Click.Advance_Lastname("solanki");
		Click.Advance_Firstname("ravi");
		Click.Advance_Initial("kumar");
		Thread.sleep(3000);
		Click.Advance_Phone("7834897698");
		Click.Advance_Email("ravi@gmail.com");
		Click.Advance_DOB("01091993");
		Thread.sleep(3000);
		Click.Advance_Mrn("4000");
		Click.Searchbtn();
}
	
}