package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.AdmUser;
import com.access.pageobject.Admin;

public class Admin_tc_06 extends BaseClass
{

	@Test
	public void Profile() throws InterruptedException 
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
		ad.adduser();
		Thread.sleep(3000);
		ad.adduseremail("steve123451551@mailinator.com");
		Thread.sleep(3000);
		ad.adduseremailchk();
		Thread.sleep(3000);
		ad.userphnumber("7689123411");
		Thread.sleep(3000);
		ad.usertextmsgchk();
		Thread.sleep(3000);
		ad.userfname("Steve");
		Thread.sleep(3000);
		ad.userlname("Smith");
		Thread.sleep(3000);
		ad.userpswd("Steve@123456789");
		Thread.sleep(3000);
		ad.userconfpswd("Steve@123456789");
		Thread.sleep(3000);

		//ad.thresholdalertchk();
		//Thread.sleep(3000);
		ad.userroledrpdwn();
		Thread.sleep(3000);
		ad.userroledrpdwnselect();
		Thread.sleep(3000);
		ad.deptdrpdown();
		Thread.sleep(3000);
		ad.deptdrpdownselect();
		Thread.sleep(3000);
		ad.defdeptdrpdown();
		Thread.sleep(3000);
		ad.defdeptdrpdownsel();
		Thread.sleep(3000);
		ad.savebtn();
		Thread.sleep(3000);
		Admin adm=new Admin(driver);
		Thread.sleep(5000);
		adm.filteruserbtn();
		Thread.sleep(5000);
		adm.enteremailaddess("steve123451551@mailinator.com");
		Thread.sleep(3000);
		adm.clkfilterbtn();
		Thread.sleep(3000);
		adm.edituser();
		Thread.sleep(5000);
		AdmUser ad1=new AdmUser(driver);
		ad1.chngnextlognchk();
		Thread.sleep(3000);
		AdmUser ada=new AdmUser(driver);
		ada.savebtn();
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//span[@class='ng-binding ng-scope']"));
		String expected="User: steve123451551@mailinator.com has been updated";
		Assert.assertEquals(ele.getText(),expected );
		Thread.sleep(5000);
		Admin adm1=new Admin(driver);
		Thread.sleep(5000);
		//adm1.clkthreedotbtn();
		//Thread.sleep(5000);
		//adm1.resendverifyemail();
		//Thread.sleep(5000);
		adm1.clkprofiledropdown();
		Thread.sleep(5000);
		adm1.clklogoutlink();
		Thread.sleep(5000);
		//driver.get("https://access-stage-a.jellyfishhealth.com");
		//Thread.sleep(5000);
		adm1.enterusername("steve123451551@mailinator.com");
        Thread.sleep(5000);
        adm1.enterpassword("Steve@123456789");
        Thread.sleep(5000);
        adm1.login();
        Thread.sleep(5000);
        adm1.entercurrentpasw("Steve@123456789");
        Thread.sleep(5000);
        adm1.enternewpswd("Steve@1234567891");
        Thread.sleep(5000);
        adm1.enterconfpaswd("Steve@1234567891");
        Thread.sleep(5000);
        adm1.clkchangepassword();
        Thread.sleep(20000);
        WebElement elem= driver.findElement(By.xpath("//a[@class='ng-scope selected']"));
		String expected1="CLIPBOARD";
		Assert.assertEquals(elem.getText(),expected1 );
		System.out.println(elem.getText());
		WebElement elem2= driver.findElement(By.xpath("//a[@ui-sref='registration']"));
		String expected2="REGISTRATION";
		Assert.assertEquals(elem2.getText(),expected2 );
		System.out.println(elem2.getText());
		WebElement elem3= driver.findElement(By.xpath("//a[@ui-sref='dash']"));
		String expected3="DASH";
		Assert.assertEquals(elem3.getText(),expected3 );
		System.out.println(elem3.getText());
		WebElement elem4= driver.findElement(By.xpath("//a[normalize-space()='Appointments']"));
		String expected4="APPOINTMENTS";
		Assert.assertEquals(elem4.getText(),expected4 );
		System.out.println(elem4.getText());
		WebElement elem5= driver.findElement(By.xpath("//a[normalize-space()='Reports']"));
		String expected5="REPORTS";
		Assert.assertEquals(elem5.getText(),expected5 );
		System.out.println(elem5.getText());
		System.out.println("Test case Passed");
        
	}

}


