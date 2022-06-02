package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;

public class AdmUser_tc_5 extends BaseClass
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
		Thread.sleep(3000);
		ad.adduseremail("testdt@gmail.com");
		Thread.sleep(3000);
		ad.adduseremailchk();
		Thread.sleep(3000);
		ad.userphnumber("7689123411");
		Thread.sleep(3000);
		ad.usertextmsgchk();
		Thread.sleep(3000);
		ad.userfname("Jack");
		Thread.sleep(3000);
		ad.userlname("Gates");
		Thread.sleep(3000);
		ad.userpswd("Jackgates@123456789");
		Thread.sleep(3000);
		ad.userconfpswd("Jackgates@123456789");
		Thread.sleep(3000);
		ad.chngnextlognchk();
		Thread.sleep(3000);
		ad.thresholdalertchk();
		Thread.sleep(3000);
		ad.userroledrpdwn();
		Thread.sleep(3000);
		ad.userroledrpdwnselect();
		Thread.sleep(3000);
		ad.deptdrpdown();
		Thread.sleep(3000);
		ad.deptdrpdownselect();
		Thread.sleep(3000);
		ad.defdeptdrpdown();
		Thread.sleep(3000);
		ad.defdeptdrpdownsel();
		Thread.sleep(3000);
		ad.savebtn();
		Thread.sleep(3000);
		
	}

}


