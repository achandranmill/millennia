package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;


@Test
public class ChangeD_tc_3 extends BaseClass
{
	public void UserTestPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		UserTestPage u =new  UserTestPage(driver);

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		u.linkUserTest();
		Thread.sleep(3000);
<<<<<<< HEAD
		u.changedepartment1();
=======
		u.changedepartment();
>>>>>>> 62a12d711fedfe06f15fb562f27a24bcdd72039c
		Thread.sleep(3000);
		u.Clinic1();
		Thread.sleep(3000);
		u.DepartmentCancelbtn();
	
	
}
}