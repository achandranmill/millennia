package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Provider_tc_29 extends BaseClass

{
	public void Provider() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
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
		pd.SaturdayAddspan();
		Thread.sleep(2000);
		pd.SaturdayFrom("06");
		Thread.sleep(2000);
		pd.SaturdayFrom0("00");
		Thread.sleep(2000);
		pd.SaturdayTo("08");
		Thread.sleep(2000);
		pd.SaturdayTo0("00");
		Thread.sleep(2000);
		pd.SaturdayCapacity("3");
	
}
}
