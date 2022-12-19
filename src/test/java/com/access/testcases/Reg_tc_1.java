package com.access.testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;

@Test

public class Reg_tc_1  extends BaseClass
{
    //---------------------Start Patient----------------
	public void RegtPage() throws Exception
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
		Thread.sleep(5000);
		System.out.println("USER LOCATION IS PRESENT");
    	}
    	catch(Exception e) 
    	{
    		System.out.println("USER LOCATION IS Not PRESENT");
    		
    	}
    	//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		r.StartPatient();
		Thread.sleep(3000);
        r.Previous();
		Thread.sleep(3000);
		r.NEXT();
		Thread.sleep(10000);
		boolean Start_Button = driver.findElement(By.xpath("/html/body/main/div[1]/registration/section/aside/button[3]")).isEnabled();
		Assert.assertFalse(Start_Button,"Start button is Disabled");
		System.out.println("START BUTTON IS DISABLED---PASS");
	}
}
