package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Reg_tc_4 extends BaseClass

{

	public void RegistrationPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		try
		{
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		System.out.println("USER LOCATION IS PRESENT");
        }
        catch(Exception e) 
       {
	   System.out.println("USER LOCATION IS Not PRESENT");
	
       }
//-----------------REGISTRATION PAGE ------------------------------
		Thread.sleep(5000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		r.clickredit("rajput", "praveen", "kumar");
		Thread.sleep(3000);
		r.Editdate();
		r.txtdate("03122022");
		Thread.sleep(3000);
		r.txtEditAPPTTIME("09:45");
		r.AMPM();
		r.APPLIAM();
		r.gender("male");
		Thread.sleep(5000);
		r.Editseeing();
		Thread.sleep(3000);
		r.Number("7896509874");
		Thread.sleep(3000);
		r.Email("ravi@gmail.com");
		Thread.sleep(3000);
		r.contactname("praveen");
		Thread.sleep(3000);
		r.contactnumber("7777777777");
		Thread.sleep(3000);
		r.Editcopay();
		Reporter.log("Editcopay");
		Thread.sleep(3000);
		r.Copay("7000");
		Reporter.log("Copay");
		Thread.sleep(3000);
        r.comment("complete");
		Reporter.log("comment");
		Thread.sleep(3000);
		r.FLAGS();
		Reporter.log("FLAGS");
		Thread.sleep(3000);
	}
}
