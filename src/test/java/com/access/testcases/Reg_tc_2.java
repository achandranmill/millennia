package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;




import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test

public class Reg_tc_2  extends BaseClass
{
	public void RegistrationPage() throws Exception
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
		   
		   r.HOLD();
		   Thread.sleep(3000);
		
		   r.Holdlist();
		   Thread.sleep(3000);
		   
		   
}
}
