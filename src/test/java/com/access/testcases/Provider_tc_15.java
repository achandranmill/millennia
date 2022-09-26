package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Provider_tc_15 extends BaseClass

{

	
	//To Verify that Provider Search DorpDown of Details page works properly
	
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
		pd.ProviderSearch();
		Thread.sleep(3000);
		pd.Published();
		Thread.sleep(3000);
	
}
}