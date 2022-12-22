package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Provider_tc_26 extends BaseClass

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
		pd.ADDProvider();
		Thread.sleep(3000);
		pd.Schedule();
		Thread.sleep(3000);
		pd.AddSchedule();
		Thread.sleep(3000);
		pd.NewScheduleTitle("Appointment");
		Thread.sleep(3000);
		pd.StartDate("04032022");
		Thread.sleep(3000);
		pd.EndDate("05062022");
		Thread.sleep(3000);
		pd.WednesdayAddspan();
		Thread.sleep(3000);
		pd.WednesdayFrom("11");
		Thread.sleep(2000);
		pd.Wednesdayf00("00");
		Thread.sleep(2000);
		pd.WednesdayTo("01");
		Thread.sleep(2000);
		pd.WednesdayTo0("00");
		Thread.sleep(2000);
		pd.WednesdayCapacity("6");
	
}
}
