package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.loginpage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
public class Workl_tc_1 extends BaseClass

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
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(5000);

		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		w.Regi();
		w.BtnClose();
		Thread.sleep(10000);
		w.Configure();
		w.Provider();
		Thread.sleep(3000);
		Clipboard c =new Clipboard(driver);
		c.LinkclickBoard();
     	UserTestPage u =new UserTestPage(driver);
		u.linkUserTest();
		u.Logout();
	}
}