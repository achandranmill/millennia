package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Audit;
import com.access.pageobject.Departments;
import com.access.pageobject.loginpage;

public class Department_tc_6 extends BaseClass {
	//Validate that admin user able to create appointment
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
		dept.appointmentlink();
		Thread.sleep(5000);
		dept.Addappointment();
		Thread.sleep(10000);
		//dept.checkAddappointment();
		//Thread.sleep(5000);
		//dept.Selectappointment();
		//Thread.sleep(5000);
		dept.Selectappointmenttype("Visit");
		//dept.SelectAppointment();
		Thread.sleep(5000);
		dept.createappointment();
		Thread.sleep(5000);
		dept.addappointmentalertmsg();
		Thread.sleep(5000);
		
	}

}
