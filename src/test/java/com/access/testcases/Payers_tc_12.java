package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Payer;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Payers_tc_12 extends BaseClass

{
	
	
	//To verify that User  able to click on Payers tab and Make Changes to Selected Function work properly 
	
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
			p.ATestPayer01();
			Thread.sleep(2000);
			p.TRASHALLTRANSACTIONSWILLBEDISCARDED();
			Thread.sleep(2000);
			p.MakeChangestoSelected();
			Thread.sleep(2000);
			p.MakeChangestoSelectedDAYSTORUN();
			Thread.sleep(2000);
			p.MakeChangestoSelectedEveryTime();
			Thread.sleep(2000);
		    p.MakeChangestoSelectedINNETWORK();
		    Thread.sleep(2000);
		    p.MakeChangestoSelectedINNETWORKYes();
		    Thread.sleep(2000);
		    p.MakeChangestoSelectedSAVE();
		    Thread.sleep(10000);
		    
		    
}
}