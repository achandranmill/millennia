package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Provider_tc_7  extends BaseClass

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
		pd.ADDProvider();
		Thread.sleep(3000);
		pd.FirstName("denial ");
		Thread.sleep(3000);
		pd.MiddleName("john");
		Thread.sleep(3000);
		pd.LastName("Robert");
		Thread.sleep(3000);
		pd.Credentials("MD");
		Thread.sleep(3000);
		pd.EmailAddress("789as@mailinator.com");
		Thread.sleep(3000);
		pd.PhoneNumber("7689504321");
		Thread.sleep(3000);
		pd.Password("Random@12345678");
		Thread.sleep(3000);
		pd.PasswordConfirm("Random@12345678");
		Thread.sleep(3000);
		pd.Savebtn();
		Thread.sleep(3000);
	}
}