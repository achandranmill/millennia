 package com.access.testcases;

import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;



@Test
public class Org_tc_1 extends BaseClass

{
	public void Organization() throws Exception
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
	//	pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(3000);
		og.Details();
		Thread.sleep(3000);
		og.DetailsName("software");
		Thread.sleep(3000);
		og.DetailsshortName("sof");
		Thread.sleep(2000);
		og.DetailsphoneNumber("9999999999");
		Thread.sleep(2000);
		og.DetailsstreetLine1("123,abc");
		Thread.sleep(2000);
		og.DetailsstreetLine2("23.cd");
	    Thread.sleep(2000);
	    og.Detailscity("Goa");
	    Thread.sleep(3000);
	    og.Detailsstate("Goa");
	    Thread.sleep(2000);
	    og.Detailszipcode("45372");
	    Thread.sleep(2000);
	    og.DetailssaveButton();
	
	
}
}