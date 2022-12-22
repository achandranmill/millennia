package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Audit;
import com.access.pageobject.Dash;
import com.access.pageobject.Departments;
import com.access.pageobject.loginpage;

public class Department_tc_61 extends BaseClass {
	//Validate that if user click on undo button and save the setting then it's reflection display in dash from user access
	@Test
	public void departments() throws InterruptedException 
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
		dept.clkdashlink();
		Thread.sleep(5000);
		dept.validatedashtitle();
		Thread.sleep(2000);
		dept.patientaddscreening();
		Thread.sleep(2000);
		dept.patientaddscreeningord("9");
		Thread.sleep(2000);
		dept.chkundobutton();
		Thread.sleep(5000);
		dept.dashsavebtn();
		Thread.sleep(2000);
		dept.adminprofileclk();
		Thread.sleep(2000);
		dept.returntoaccess();
		Thread.sleep(2000);
		Dash viewdetails = new Dash(driver);
		viewdetails.DashClick();
		Thread.sleep(5000);
		
		
			
	}

}
