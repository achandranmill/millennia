package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.SelfScheduling;
import com.access.pageobject.loginpage;

@Test
public class Self_sched_tc_7 extends BaseClass

{

	 public void Selfscheduling() throws Exception
		{
			loginpage lp=new loginpage(driver);
			lp.setUserName(email);
			lp.setPassword(password);
			lp.clickSubmit();
			Thread.sleep(3000);
			
			RegtPage r=new RegtPage(driver);
			r.clickRegistrationPage();
			Thread.sleep(3000);
			Provider pd = new Provider(driver);
		  //pd.LocationPopup("Florida");
			Thread.sleep(3000);
			pd.UserAdmin();
			Thread.sleep(3000);
			pd.Admin();
			Thread.sleep(3000);
			Organization og = new Organization(driver);
			og.Organization();
			Thread.sleep(3000);
			SelfScheduling ss = new SelfScheduling(driver);
			ss.SelfScheduling();
			Thread.sleep(2000);
			ss.SetToPending();
			Thread.sleep(2000);
	
		}
}
