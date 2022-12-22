package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_Messaging_tc_1 extends BaseClass

{
	public void Organization() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		//AdmUser ad=new AdmUser(driver);
		//ad.userlocation();
		//Thread.sleep(5000);
		//ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Patil");
		//User Enter FirstName
		addp.fname("Rajesh");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031999");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("john@gmail.com");
		Thread.sleep(10000);
		addp.Clip_AppointTime("0930");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Location_option();
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Flag();
		Thread.sleep(2000);
		addp.Clip_Flag_Option();
		Thread.sleep(2000);
	//	addp.Clip_Seeing();
	//	Thread.sleep(2000);
	//	addp.Clip_Thoms();
		addp.Clip_Comment("only checkup");
	//	addp.Clip_Reason("only checkup ");
	//	addp.Clip_Copay("10000");
		Thread.sleep(2000);
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		//addp.printAccessPass();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		Thread.sleep(10000);
		addp.Alert_ok();
		Thread.sleep(10000);
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		ap.SearchLastName("Patil");
		Thread.sleep(10000);
	WebElement patil = driver.findElement(By.xpath("//span[contains(text(),'Patil, Rajesh')]"));
	Assert.assertEquals(true, patil.isDisplayed());
	System.out.println("RAJESH PATIL IS Displayed- Assert Passed");
	WebElement Checked = driver.findElement(By.xpath("//span[contains(text(),'CHECKED-IN')]"));
	Assert.assertEquals(true, Checked.isDisplayed());
	System.out.println("Checked in Is Displayed-Assert Passed");
	
	
}
}