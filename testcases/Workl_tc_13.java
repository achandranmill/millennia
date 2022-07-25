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

		Thread.sleep(3000);
		WorkListPage w = new WorkListPage(driver);

		w.worklist();
		Thread.sleep(3000);
		w.Configure();
		Thread.sleep(3000);
		w.EditListColumns();
		Thread.sleep(3000);
		w.Threshold();
		Thread.sleep(3000);
		w.ThresholdStarttime();
		Thread.sleep(3000);
		w.ThresholdStatus();
		Thread.sleep(3000);
		w.ThresholdWaittime();
		Thread.sleep(3000);
		w.ThredsholdSave();
		Thread.sleep(3000);
	}
}