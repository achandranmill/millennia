package com.access.testcases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Audit;
import com.access.pageobject.Dash;
import com.access.pageobject.Departments;
import com.access.pageobject.loginpage;

public class Department_Reg_tc_92 extends BaseClass {
	
	@Test
	public void departments() throws InterruptedException, AWTException 
	{
		
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		AdmUser ad=new AdmUser(driver);
		//ad.userlocation();
		//Thread.sleep(5000);
		//ad.okbutton();
		//Thread.sleep(5000);
		ad.registration();
		Thread.sleep(5000);
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.registration();
		Thread.sleep(5000);
		dept.newaccountregistered();
		Thread.sleep(5000);
		dept.regaddmore();
		dept.newaccountphnumber();
		Thread.sleep(5000);
		dept.regfieldsizephnumber();
		Thread.sleep(5000);
		dept.regtitlephnumber("Phone Number");
		Thread.sleep(5000);
		dept.regplaceholderphnumber("Phone number Test");
		Thread.sleep(5000);
		dept.regrequiredphnumber();
		Thread.sleep(5000);
		dept.guestregsavebtn();
		Thread.sleep(5000);
		dept.guestregsavebtnconf();
		Thread.sleep(5000);
		
		}

}
