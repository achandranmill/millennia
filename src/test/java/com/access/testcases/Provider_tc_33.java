package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Provider_tc_33 extends BaseClass

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
		Thread.sleep(20000);
		pd.Provider_Choosefile();
		Thread.sleep(5000);
		pd.Provider_cropimage();
		Thread.sleep(5000);
	
	}
	
	
}
