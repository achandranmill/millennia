package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Payer;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Payers_tc_18 extends BaseClass

{
	
	//
	
	 public void Payers() throws Exception
		{
			loginpage lp=new loginpage(driver);
			lp.setUserName(email);
			lp.setPassword(password);
			lp.clickSubmit();
			Thread.sleep(5000);
			
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
			p.AddNewPayer();
			Thread.sleep(2000);
			p.AddNewPayername("LIC HEALTH LIFE");
			Thread.sleep(2000);
			p.AddNewPayerID("50001");
			Thread.sleep(2000);
			p.AddPayerbtn();
			Thread.sleep(5000);
			r.Regit_payers();
			Thread.sleep(3000);
			r.search("Kechle","Aarvi");
			Thread.sleep(5000);
			r.GotopatientDetails();
			Thread.sleep(3000);
			r.coverage();
			Thread.sleep(3000);
			r.coverage_makechanges();
			Thread.sleep(5000);
			r.coverage_payername("LIC HEALTH LIFE");
			Thread.sleep(10000);
			
	
}
}
