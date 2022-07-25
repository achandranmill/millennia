package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Audit;
import com.access.pageobject.Departments;
import com.access.pageobject.loginpage;

public class Department_tc_3 extends BaseClass {
	//Validate that admin user able to enter and save department details
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
		
		dept.selectdepartment();
		Thread.sleep(5000);
		dept.selectdepartmentnew();
		Thread.sleep(5000);
		dept.deptname("Nextnode 2");
		Thread.sleep(2000);
		dept.deptshortname("Nnode2");
		Thread.sleep(2000);
		dept.phonenumber("9712367123");
		Thread.sleep(2000);
		dept.streetaddress("New York street no. 2");
		Thread.sleep(2000);
		dept.streetaddresssec("New York street no. 10");
		Thread.sleep(2000);
		dept.city("New York");
		Thread.sleep(2000);
		dept.state("New York State");
		Thread.sleep(2000);
		dept.zipcode("567890");
		Thread.sleep(2000);
		dept.addhoursmonday();
		Thread.sleep(1000);
		dept.fromhourmonday("04:30");
		Thread.sleep(1000);
		dept.tohourmonday("05:30");
		Thread.sleep(1000);
		dept.addhourstuesday();
		Thread.sleep(1000);
		dept.fromhourtuesday("06:30");
		Thread.sleep(1000);
		dept.tohourtuesday("07:30");
		Thread.sleep(1000);
		dept.addhourswednesday();
		Thread.sleep(1000);
		dept.fromhourwednesday("06:30");
		Thread.sleep(1000);
		dept.tohourwednesday("07:30");
		Thread.sleep(1000);
		dept.addhoursthursday();
		Thread.sleep(1000);
		dept.fromhourthursday("06:30");
		Thread.sleep(1000);
		dept.tohourthursday("07:30");
		Thread.sleep(1000);
		dept.addhoursfriday();
		Thread.sleep(1000);
		dept.fromhourfriday("08:30");
		Thread.sleep(1000);
		dept.tohourfriday("09:30");
		Thread.sleep(1000);
		dept.addhourssaturday();
		Thread.sleep(1000);
		dept.fromhoursaturday("10:30");
		Thread.sleep(1000);
		dept.tohoursaturday("11:30");
		Thread.sleep(1000);
		dept.addhourssunday();
		Thread.sleep(1000);
		dept.fromhoursunday("12:30");
		Thread.sleep(1000);
		dept.tohoursunday("01:30");
		Thread.sleep(1000);
		dept.userlocation();
		Thread.sleep(3000);
		dept.locationinput();
		Thread.sleep(3000);
		dept.radiorestrictedtext();
		Thread.sleep(3000);
		
		dept.addnewlocation("New York");
		Thread.sleep(2000);
		dept.addlocation();
		Thread.sleep(2000);
		dept.deletelocation();
		Thread.sleep(2000);
		dept.siteadmin();
		Thread.sleep(2000);
		dept.checkall();
		Thread.sleep(5000);
		dept.appointmenttype();
		Thread.sleep(1000);
		dept.appointmenttypevisit();
		Thread.sleep(1000);
		dept.selfpayform();
		Thread.sleep(5000);
		dept.selfpayformtype();
		Thread.sleep(5000);
		dept.changefilter();
		Thread.sleep(2000);
		dept.changefilterselect();
		Thread.sleep(2000);
		dept.changefilterclose();
		Thread.sleep(2000);
		dept.departmentdirection("Test Direction");
		Thread.sleep(2000);
		dept.selectimage();
		Thread.sleep(3000);
		dept.savedepartment();
		Thread.sleep(3000);
	}

}
