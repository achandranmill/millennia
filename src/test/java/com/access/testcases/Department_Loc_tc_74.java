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

public class Department_Loc_tc_74 extends BaseClass {
	
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
		dept.locations();
		Thread.sleep(3000);
		dept.locationschk();
		Thread.sleep(3000);
		dept.addlocationsclk();
		Thread.sleep(3000);
		dept.locationname("California");
		Thread.sleep(3000);
		dept.serviceidentifier("#Service");
		Thread.sleep(3000);
		dept.locphonenum("7812346789");
		Thread.sleep(3000);
		dept.street1("California street 1, near Clinton bank");
		Thread.sleep(3000);
		dept.street2("California street 12, near Texos bank");
		Thread.sleep(3000);
		dept.cityaddress("California");
		Thread.sleep(3000);
		dept.stateaddress("US State");
		Thread.sleep(3000);
		dept.zipcodenew("678912");
		Thread.sleep(3000);
		dept.addlocinfo("Street no. 112, Near Texos Bank, Opposite WTC");
		Thread.sleep(3000);
		dept.locsavebtn();
		Thread.sleep(3000);
		
		
		
		
		
		
		}

}
