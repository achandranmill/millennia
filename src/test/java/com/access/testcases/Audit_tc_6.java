package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.Audit;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;

public class Audit_tc_6 extends BaseClass
{
	//Validate that user able to search patient audit details by entering MRN
	@Test
	public void audit() throws InterruptedException 
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
		Audit au=new Audit(driver);
		au.auditlink();
		Thread.sleep(5000);
		au.daterange("04/28/2022 - 05/05/2022");
		Thread.sleep(5000);
		//au.setstartdate("27-04-2022");
		//Thread.sleep(5000);
		//au.setenddate("04-05-2022");
		//Thread.sleep(5000);
		//au.clkapplydate();
		//Thread.sleep(5000);
		//au.searchbylname("Robin");
		//Thread.sleep(5000);
		au.searchbyMRN("MRN12345");
		Thread.sleep(5000);
		au.clksearchbtn();
		Thread.sleep(8000);

	}
}

