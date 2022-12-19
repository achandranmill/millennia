package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_provider_tc_8 extends BaseClass

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
		pd.FirstName("Rosan");
		Thread.sleep(3000);
		pd.MiddleName("kumar");
		Thread.sleep(3000);
		pd.LastName("mahajan");
		Thread.sleep(3000);
		pd.Credentials("MD");
		Thread.sleep(3000);
		pd.EmailAddress("rosan@mailinator.com");
		Thread.sleep(3000);
		pd.PhoneNumber("7689504321");
		Thread.sleep(3000);
		pd.Password("Random@12345678");
		Thread.sleep(3000);
		pd.PasswordConfirm("Random@12345678");
		Thread.sleep(2000);
		pd.ProviderId("123f");
		Thread.sleep(2000);
		pd.ProviderSearch();
		Thread.sleep(5000);
		pd.Published();
		Thread.sleep(2000);
		pd.NationalProviderIdentifier_NPI("gg");
		Thread.sleep(2000);
		pd.TaxpayerIdentificationNumber_TIN("FGH");
		Thread.sleep(2000);
		pd.FHIRProvider_ID("fgg");
		Thread.sleep(2000);
		pd.Departments();
		Thread.sleep(2000);
		pd.CheckAll();
		Thread.sleep(2000);
		pd.DisplayName("Rosan");
		Thread.sleep(2000);
		pd.Provider_Save();
		pd.Schedule();
		Thread.sleep(2000);
		pd.AddSchedule();
		Thread.sleep(2000);
		pd.NewScheduleTitle("New test");
		Thread.sleep(2000);
		pd.StartDate("27072022");
		Thread.sleep(2000);
		pd.EndDate("04082022");
		Thread.sleep(2000);
		pd.Schedule_Department();
		Thread.sleep(2000);
		pd.Schedule_Location();
		Thread.sleep(2000);
		pd.Schedule_Appointment_Type();
		Thread.sleep(2000);
		pd.Schedule_Appointment_Type_Followup();
		Thread.sleep(2000);
		pd.Monday();
		Thread.sleep(2000);
		pd.MondayFrom("09");
		Thread.sleep(2000);
		pd.MondayFrom2("00");
		Thread.sleep(2000);
		pd.Mondaypmam();
		Thread.sleep(2000);
		pd.MondayTo("12");
		Thread.sleep(2000);
		pd.MondayTo2("40");
		Thread.sleep(2000);
		pd.MondayPMAM();
		Thread.sleep(2000);
		pd.MondayCapacity("5");
		Thread.sleep(2000);
		pd.Provider_MatchingAlgo();
		Thread.sleep(2000);
		pd.Provider_MatchingFirstname();
		Thread.sleep(2000);
		pd.Provider_MatchingLastin();
		Thread.sleep(2000);
		pd.Provider_MatchingNewFieldout();
		Thread.sleep(2000);
		pd.Provider_MatchingSave();
		Thread.sleep(10000);
		
		
		
	}

}
