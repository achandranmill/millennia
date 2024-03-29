package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.*;


public class Workl_tc_2  extends BaseClass
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
		Thread.sleep(3000);
		w.SortBy();
		Thread.sleep(3000);
	}
}