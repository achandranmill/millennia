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

public class Department_pop_tc_66 extends BaseClass {

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
		dept.population();
		Thread.sleep(5000);
		dept.populationchk();
		Thread.sleep(5000);
		dept.addpopulation();
		Thread.sleep(5000);
		dept.populationname("Major population");
		Thread.sleep(5000);
		dept.shortname("Majpopulation");
		Thread.sleep(5000);
		dept.addevent();
		Thread.sleep(5000);
		dept.selectevent();
		Thread.sleep(5000);
		dept.savepopulation();
		Thread.sleep(5000);



	}

}
