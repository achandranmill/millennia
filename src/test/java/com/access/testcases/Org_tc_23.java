package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_23 extends BaseClass

{
	
	//To verify that admin able to click on Appointment Types tab and Edit Appointments Types Page works properly
	
	
	 public void Organization() throws Exception
		{
			loginpage lp=new loginpage(driver);
			lp.setUserName(email);
			lp.setPassword(password);
			lp.clickSubmit();
			Thread.sleep(3000);
			AdmUser ad=new AdmUser(driver);
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
			RegtPage r=new RegtPage(driver);
			r.clickRegistrationPage();
			Thread.sleep(3000);
			Provider pd = new Provider(driver);
		//	pd.LocationPopup("Florida");
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
			og.EditAppointment();
			Thread.sleep(2000);
			og.EditTitle("yy");
			Thread.sleep(2000);
			og.EditapptDuration("gg");
			Thread.sleep(2000);
			og.EditexternalServiceId("jjj");
			Thread.sleep(2000);
			og.EditDescription("hg");
			Thread.sleep(2000);
			og.EditformRequired();
			Thread.sleep(2000);
			og.EditApptSave();
			Thread.sleep(2000);
}
}
