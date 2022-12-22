package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import com.access.pageobject.*;

public class Workl_tc_9 extends BaseClass
{

	@Test
	public void WorkListPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		 try
		 {
		  ad.userlocation();
		  Thread.sleep(5000);
		  ad.okbutton();
		  Thread.sleep(5000);
		  System.out.println("USER LOCATION IS PRESENT");
		  }
		  catch(Exception e) 
		  {
		  System.out.println("USER LOCATION IS Not PRESENT");
		    		
		  }
       //-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		w.Discharge2();
		Thread.sleep(3000);
		w.DischargeViwe();
		Thread.sleep(3000);
		w.SendtoBack();
		Thread.sleep(10000);
		w.SendBackWaiting();
	}
}
