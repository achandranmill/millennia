package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Payer;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Payers_tc_8 extends BaseClass
{
	
	
	//To verify that User  able to click on Payers tab and Click on Days to run Drop-Down and Select 1st of the month Field
	
	 public void Payers() throws Exception
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
		//	pd.LocationPopup("Florida");
			Thread.sleep(3000);
			pd.UserAdmin();
			Thread.sleep(3000);
			Payer p = new Payer(driver);
			p.payers();
			Thread.sleep(2000);
			p.DaysToRun();
			Thread.sleep(2000);
			p.DaysToRun1stofthemonth();
			Thread.sleep(10000);
	
}
}
