package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Provider_tc_32 extends BaseClass

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
	  //  pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		pd.Provider();
		Thread.sleep(3000);
		pd.EditProvider();
		Thread.sleep(3000);
		pd.EditSchedule();
		Thread.sleep(2000);
		try
		{
		pd.EditADDSchedule();
		System.out.println("ADD Schedule is present");
		}
		catch(Exception e)
		{
			System.out.println("ADD Schedule is not present");
		}
		
		pd.EditScheduleTitle("old");
		Thread.sleep(2000);
		pd.EditStartDate("09042022");
		Thread.sleep(2000);
		pd.EditEndDate("06052022");
         Thread.sleep(2000);
         pd.EditDepartmentnull();
         Thread.sleep(2000);
         pd.EditLocation();
         Thread.sleep(2000);
         pd.EditAppointmentType();
         Thread.sleep(2000);
         pd.EditMonaday();
         Thread.sleep(2000);
         pd.EditMondayFrom("08");
         Thread.sleep(2000);
         pd.EditMondayFrom0("00");
         Thread.sleep(2000);
         pd.EditMondayFromAMPM();
         pd.EditMondayTo("09");
         Thread.sleep(2000);
         pd.EditMondayTo0("00");
         Thread.sleep(2000);
         pd.EditMondayToAMPM();
         pd.EditMondayCapacity("5");
         Thread.sleep(3000);
         pd.EditException();
         Thread.sleep(2000);
         pd.EditExceptionAllday();
         Thread.sleep(2000);
        pd.EditShowFullschedule();
        Thread.sleep(2000);
        pd.EditSave2();
         
         
         
         
         
         
}
}