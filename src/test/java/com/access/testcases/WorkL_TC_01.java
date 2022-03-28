package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Access.Pages.Clipboard;
import com.Access.Pages.LoginPage;
import com.Access.Pages.RegistrationPage;
import com.Access.Pages.UserTestPage;
import com.Access.Pages.WorkListPage;

public class WorkL_TC_01 extends BaseClass

{
	@Test
	public void WorkListPage() throws Exception
	{
		   LoginPage lp=new LoginPage(driver);
		   lp.setEmail(Email);
		   lp.setpasswoed(password);
		   lp.clicksubmit();
		   
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  RegistrationPage r=new RegistrationPage(driver);
		   
		   
		   r.clickRegistrationPage();
		   Thread.sleep(3000);
		   
	   WorkListPage w = new WorkListPage(driver);
		   
		   w.worklist();
           w.Configure();
           Thread.sleep(3000);
           w.Department();
           w.Regi();
           w.BtnClose();
           Thread.sleep(3000);
           w.Configure();
           w.Provider();
           Thread.sleep(3000);
           Clipboard c =new Clipboard(driver);
           c.Clip();
           
           Thread.sleep(3000);
           
           UserTestPage u =new UserTestPage(driver);
        	u.linkUserTest();
        	u.Logout();
           
}
}