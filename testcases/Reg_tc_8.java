package com.access.testcases;



import org.testng.annotations.Test;

import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Reg_tc_8 extends BaseClass

{

	@Test
	public void RegtPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
	}
}