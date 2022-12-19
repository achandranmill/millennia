package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_provider_tc_11 extends BaseClass

{

	public void Provider() throws Exception
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
		//pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		pd.Provider();
		Thread.sleep(3000);
		pd.EditProvider();
		Thread.sleep(2000);
		pd.EditSchedule();
		Thread.sleep(2000);
		pd.EditADDSchedule();
		Thread.sleep(2000);
		pd.EditScheduleTitle("new check up");
		Thread.sleep(2000);
		pd.EditStartDate("22072022");
		Thread.sleep(2000);
		pd.EditEndDate("27072022");
		Thread.sleep(2000);
		pd.EditDepartmentnull();
		Thread.sleep(2000);
		pd.EditLocation();
		Thread.sleep(2000);
		pd.EditAppointmentType();
		Thread.sleep(2000);
		pd.EditMonaday();
		Thread.sleep(2000);
		pd.EditMondayFrom("09");
		Thread.sleep(2000);
		pd.EditMondayFrom0("10");
		Thread.sleep(2000);
		pd.EditMondayFromAMPM();
		Thread.sleep(2000);
		pd.EditMondayTo("03");
		Thread.sleep(2000);
		pd.EditMondayTo0("25");
		Thread.sleep(2000);
		pd.EditMondayToAMPM();
		Thread.sleep(2000);
		pd.EditMondayCapacity("5");
		Thread.sleep(2000);
		pd.EditSave2();
	}
}
