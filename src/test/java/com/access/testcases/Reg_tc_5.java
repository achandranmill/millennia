package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

public class Reg_tc_5 extends BaseClass

{

	@Test
	public void RegtPage() throws Exception
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
		     r.search("praveen", "rajput");
		     Thread.sleep(3000);
		   r.SendTo();
		   Thread.sleep(3000);
		    r.Dish();
		  WorkListPage w = new WorkListPage(driver);
		  w.worklist();
		  Thread.sleep(3000);
		   w.DischargeViwe();
		   
	
		   
}
}