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

public class Department_Algo_tc_99 extends BaseClass {
	
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
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		ad.registration();
		Thread.sleep(5000);
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.algorithum();
		Thread.sleep(5000);
		dept.algorithumconf();
		Thread.sleep(5000);
		dept.capacity(12);
		Thread.sleep(5000);
		dept.appointmentlen(50);
		Thread.sleep(5000);
		dept.beginquethersold(4);
		Thread.sleep(5000);
		dept.beginquethersoldmsg("Beginning Threshold ");
		Thread.sleep(5000);
		dept.endquethersold(5);
		Thread.sleep(5000);
		dept.endquethersoldmsg("Ending Threshold ");
		Thread.sleep(5000);
		dept.includeinalgochkbox();
		Thread.sleep(5000);
		dept.includeincapchkbox();
		Thread.sleep(5000);
		dept.algosave();
		Thread.sleep(5000);
		dept.configchangemsg();
		Thread.sleep(5000);
		}

}
