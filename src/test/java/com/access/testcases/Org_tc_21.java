package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_21 extends BaseClass

{
	public void Organization() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
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
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Provider pd = new Provider(driver);
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(3000);
		og.AppointmentTypes();
		Thread.sleep(2000);
		og.AddAppointment();
		Thread.sleep(2000);
		og.Appointtitle("Medical treatment");
		Thread.sleep(2000);
		og.apptDuration("2");
		Thread.sleep(2000);
		og.externalServiceId("123456");
		Thread.sleep(2000);
		og.Description("Suffering from fever");
		Thread.sleep(2000);
		og.AppointAddForm();
		Thread.sleep(2000);
		og.templateId();
		Thread.sleep(2000);
		og.ApptCreate();
		Thread.sleep(2000);
		og.AppointSave();
		Thread.sleep(5000);


	}
}