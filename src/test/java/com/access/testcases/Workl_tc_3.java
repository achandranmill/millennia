package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



import com.access.pageobject.WorkListPage;
import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Workl_tc_3  extends BaseClass
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
        WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(20000);
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		w.Waiting();
		w.BtnClose();
		Thread.sleep(10000);
		if( driver.findElement(By.xpath("//span[contains(text(),'Waiting')]")).isDisplayed())
		{
			System.out.println("WATING PATIENT IS DISPLAYED");
		}
		else
		{
			System.out.println("WATING PATIENT IS Not DISPLAYED");
		}
		Thread.sleep(10000);
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		Thread.sleep(3000);
		w.Waiting2();
		Thread.sleep(10000);
		try
		{
		w.Waiting2_Close_Btn();
		System.out.println("Close Button is Click");
		}
		catch(Exception e)
		{
			System.out.println("Close Button is Already Click");
		}
		Thread.sleep(20000);
		if(!driver.findElement(By.xpath("//span[contains(text(),'Waiting')]")).isDisplayed())
		{
			System.out.println("WATING PATIENT IS Not DISPLAYED");
		}
		else
		{
			System.out.println("WATING PATIENT IS  DISPLAYED");
		}
		
	}
}
