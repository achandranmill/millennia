package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.*;


@Test
public class Id_Admin_tc_2 extends BaseClass

{

	public void Idsearch() throws InterruptedException 
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
		Thread.sleep(5000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Provider pd = new Provider(driver);
	//	pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(5000);
		Idsearch i = new Idsearch(driver);
		i.ID_Deo_Deo();
		Thread.sleep(2000);
		i.ID_Search();
		Thread.sleep(2000);
		i.ID_Department();
		Thread.sleep(2000);
		i.ID_SearchFilter("emergency");
		Thread.sleep(5000);
		
	
	
	}
}
