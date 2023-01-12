package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Audit;
import com.access.pageobject.Departments;
import com.access.pageobject.loginpage;

public class Department_tc_31 extends BaseClass {
	//Validate that user able to configure MRN Field and as per configuration field display in clipboard
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
		try
		{
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		//-----------------REGISTRATION PAGE ------------------------------
		ad.registration();
		Thread.sleep(5000);
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.clipboardlink();
		Thread.sleep(5000);
		dept.clkaddmorebtn();
		Thread.sleep(5000);
		dept.mrn();
		Thread.sleep(2000);
		dept.mrnfieldsize();
		Thread.sleep(2000);
		dept.mrnfieldtitle("MRN");
		Thread.sleep(2000);
		dept.mrnplacholder("MRN");
		Thread.sleep(2000);
		dept.mrnrequired();
		Thread.sleep(2000);
		dept.savebtnclk();
		Thread.sleep(5000);
		dept.adminprofileclk();
		Thread.sleep(5000);
		dept.returntoaccess();
		Thread.sleep(5000);


	}

}
