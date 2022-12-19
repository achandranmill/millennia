package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_provider_tc_2 extends BaseClass

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
		pd.Edit_MatchingAlgorithm();
		Thread.sleep(2000);
		pd.Edit_Matching_Firstname_in();
		Thread.sleep(2000);
		pd.Edit_Matching_Lastname_in();
		Thread.sleep(2000);
		pd.Edit_Matching_Newfield_in();
		Thread.sleep(2000);
		pd.Edit_Matching_save();
		Thread.sleep(10000);
	}
	
}
