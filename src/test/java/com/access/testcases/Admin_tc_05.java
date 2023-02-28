package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;
import com.access.pageobject.Admin;

public class Admin_tc_05 extends BaseClass
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
		try
		{
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		//-----------------REGISTRATION PAGE ------------------------------
		ad.registration();
		Thread.sleep(5000);
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		ad.adduser();
		Thread.sleep(3000);
		ad.adduseremail("benjamin123450@mailinator.com");
		Thread.sleep(3000);
		ad.adduseremailchk();
		Thread.sleep(3000);
		ad.userphnumber("7689123411");
		Thread.sleep(3000);
		ad.usertextmsgchk();
		Thread.sleep(3000);
		ad.userfname("Benjamina");
		Thread.sleep(3000);
		ad.userlname("Franklinx");
		Thread.sleep(3000);
		ad.userpswd("Benjamin@123456789");
		Thread.sleep(3000);
		ad.userconfpswd("Benjamin@123456789");
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
		Admin adm=new Admin(driver);
		Thread.sleep(5000);
		adm.filteruserbtn();
		Thread.sleep(5000);
		adm.filterbylname("Franklinax");
		Thread.sleep(3000);
		adm.clkfilterbtn();
		Thread.sleep(5000);
		//adm.edituser();
		//Thread.sleep(5000);


	}

}


