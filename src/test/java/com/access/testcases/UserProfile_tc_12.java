package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;

public class UserProfile_tc_12 extends BaseClass
{
	
	@Test
	public void Profile() throws InterruptedException 
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		ad.admprofile();
		Thread.sleep(5000);
		com.access.pageobject.Profile pf=new com.access.pageobject.Profile(driver);
		
		
		Thread.sleep(5000);
		pf.logoutlink();
		Thread.sleep(5000);
		
		
	}

}


