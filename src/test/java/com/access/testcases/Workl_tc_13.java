package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

public class Workl_tc_13 extends BaseClass

{

	@Test
	public void WorkListPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		   lp.setUserName(email);
		   lp.setPassword(password);
		   lp.clickSubmit();
		
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   RegtPage r=new RegtPage(driver);
		   r.clickRegistrationPage();
		   
		   
	   WorkListPage w = new WorkListPage(driver);
		   
		   w.worklist();
		   w.Configure();
		   w.EditListColumns();
		   w.Threshold();
		   w.ThresholdStarttime();
		   w.ThresholdStatus();
		   w.ThresholdWaittime();
		   w.ThredsholdSave();
		   
		   
}
}