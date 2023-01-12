package com.access.testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;
@Test
public class Clip_tc_3 extends BaseClass
{
	public void Clipboard() throws InterruptedException, IOException
	{
		
		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
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

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Patel");
		//User Enter FirstName
		addp.fname("Ashok");
		//User Enter MiddleName
		addp.mname("Kumar");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("user_test@mailinator.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		Thread.sleep(1000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Comment("Routine checkup");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_LinkConnectAccount();
		addp.Clip_Linkpatient();
		Thread.sleep(2000);
		addp.Clip_LinkSelfoption();
		Thread.sleep(1000);
		addp.Clip_Addpatient();
		Thread.sleep(1000);
		addp.Clip_Checkin();
		Thread.sleep(1000);
		addp.Alert_ok();
		Thread.sleep(5000);
		r.Registration();
		Thread.sleep(10000);
		r.search("Patel", "Ashok");
		Thread.sleep(5000);
		List<WebElement>Search = driver.findElements(By.xpath("//table[@class=\"table table-striped\"]//tbody"));
		System.out.println(Search.size());
		Search.get(0);
		Thread.sleep(5000);
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(10000);
		w.Searchl("Patel");
		w.Searchf("Ashok");
		Thread.sleep(5000);
		List<WebElement>W_Search = driver.findElements(By.xpath("//table[@class=\\\"table table-striped\\\"]//tbody"));
		System.out.println(W_Search.size());
		W_Search.get(0);
		

	}	
}

