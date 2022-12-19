package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.Audit;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;

public class Audit_tc_10 extends BaseClass
{
	//Validate that user able to search patient audit details by entering  Date range, Last name, First name , MRN and DOB in combination
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
		Audit au=new Audit(driver);
		au.auditlink();
		Thread.sleep(5000);
		au.daterange("04/28/2022 - 09/05/2022");
		//Thread.sleep(5000);
		au.searchbylname("singh");
		Thread.sleep(5000);
		au.searchbyfname("deepak");
		Thread.sleep(5000);
		au.searchbyMRN("MRN12345");
		Thread.sleep(5000);
		
		au.searchbydob("1990-10-12");
		//au.searchbyMRN("");
		Thread.sleep(10000);
		au.clksearchbtn();
		Thread.sleep(8000);

}
}

