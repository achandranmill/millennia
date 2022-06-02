package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;

public class AdmUser_tc_6 extends BaseClass
{
	
	@Test
	public void AdmUser() throws InterruptedException 
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
		ad.admlink();
		Thread.sleep(5000);
		ad.adduser();
		Thread.sleep(5000);
		ad.cancelbtn();
		Thread.sleep(5000);
		
	}

}


