package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Kiosk;
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
		Thread.sleep(5000);
        WorkListPage w = new WorkListPage(driver);
		w.worklist();
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		Thread.sleep(10000);
		w.Testing1();
		Thread.sleep(1000);
		w.BtnClose();
		Thread.sleep(3000);
		w.Configure();
		Thread.sleep(5000);
		w.EditSeeing();
		Thread.sleep(10000);
		w.Provider_checkBox_1();
		Thread.sleep(10000);
		w.BtnClose2();
		Thread.sleep(10000);
		Clipboard c =new Clipboard(driver);
		c.LinkclickBoard();
        UserTestPage u =new UserTestPage(driver);
		u.linkUserTest();
		u.Logout();
		Thread.sleep(10000);
		Kiosk k = new Kiosk(driver);
		driver.get(baseURL);
		Thread.sleep(10000);
		//User Check Successful login on valid email and password
        k.Login_email("user_test@mailinator.com");
		Thread.sleep(10000);
		k.Login_password("Imenso@test123");
		Thread.sleep(10000);
		k.Login_submit();
		Thread.sleep(20000);
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
	    r.clickRegistrationPage();
	    Thread.sleep(10000);
	    w.Worklisttab2();
	    Thread.sleep(10000);
		w.Configure();
		Thread.sleep(10000);
		w.Department();
		Thread.sleep(10000);
	   boolean Testing1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/location-filter/div[2]/div/div[2]/div[3]/label/input")).isSelected();
	   Assert.assertTrue(Testing1, "Testing Department is Not Selected(After login is Not Save)");
	   Thread.sleep(5000);
	   w.BtnClose();
	   Thread.sleep(10000);
	   w.Configure();
	   Thread.sleep(10000);
	   w.EditSeeing();
	   Thread.sleep(5000);
	   boolean  Provider_checkBox_1  =  driver.findElement(By.xpath("/html/body/div[1]/div/div/seeing-filter/div[2]/div[2]/label/input")).isSelected();
	   Assert.assertTrue(Provider_checkBox_1, "Provider_checkBox_1 is Not Selected(After login is Not Save)");
	   Thread.sleep(3000);
	   
		
		
		
	}
}