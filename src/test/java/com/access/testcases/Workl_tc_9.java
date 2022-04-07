package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import com.access.pageobject.*;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

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
	       Thread.sleep(3000);
	       w.SendBackWaiting();
	      
	       
}
}
