package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Departments;
import com.access.pageobject.Organization;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;


@Test
public class Froms_tc_07 extends BaseClass

{
	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//RegtPage r=new RegtPage(driver);
		//r.clickRegistrationPage();
		//Thread.sleep(3000);
		
		AdmUser ad=new AdmUser(driver);
		
		ad.registration();
		Thread.sleep(5000);
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(5000);
		og.orgdocument();
		Thread.sleep(5000);
		og.editorgdocument();
		Thread.sleep(5000);
		og.cleartitle();
		Thread.sleep(5000);
		og.orgsave();
		Thread.sleep(5000);
		
	}
}