package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Org_tc_13  extends BaseClass

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
		og.Security();
		Thread.sleep(2000);
		og.OneLowercaseLatter();
		Thread.sleep(3000);
		og.OneUppercaseLatter();
		Thread.sleep(2000);
		og.OneNumericCharactor();
		Thread.sleep(2000);
		og.OneSpecialCharactor();
		Thread.sleep(2000);
		og.EnableTrustedAuthentication();
		Thread.sleep(2000);
		og.CreateNewAccounts();
		Thread.sleep(2000);
		og.encryptionKey("Ravisolanki");
		Thread.sleep(2000);
	   og.encryptionType("solanki123@gmail.com");
		Thread.sleep(2000);
       og.SecuritysaveButton();
       Thread.sleep(2000);
        og.User();
        Thread.sleep(2000);
        og.EditUser();
        Thread.sleep(10000);
       
}
}
