package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_31 extends BaseClass

{
	 public void Organization() throws Exception
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
			pd.Admin();
			Thread.sleep(3000);
			Organization og = new Organization(driver);
			og.Organization();
			Thread.sleep(3000);
			og.PatientIntaketab();
			Thread.sleep(2000);
			og.PatientIntaketabInsurancename("bike");
			Thread.sleep(2000);
			og.PatientIntaketabInsurancevalue("100000");
			Thread.sleep(2000);
			og.AddPatientIntaketab();
			Thread.sleep(10000);
			og.RemovePatientIntaketab();
			Thread.sleep(5000);
}
}
