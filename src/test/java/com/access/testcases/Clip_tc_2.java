package com.access.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.Date;

import java.util.Random;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Clip_tc_2 extends BaseClass {
	public void Clipboard() throws InterruptedException, IOException
	{		
		driver.get(baseURL);
		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Robin");
		//User Enter FirstName
		addp.fname("john");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber(".");
		Thread.sleep(2000);
		//User Enter Email
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(By.id("email")).sendKeys("john"+ randomInt +"@mailinator.com");
		//User Enter Appointment Time
		addp.Time("0830");
		addp.searchdep("imenso");
		addp.Fillterprovider();

		Thread.sleep(3000);
		addp.provider();
		Thread.sleep(3000);
		addp.Flag1();
		Thread.sleep(2000);
		addp.FlagSelect();
		Thread.sleep(2000);
		addp.comments("Please Call Before Visting");
		addp.reason("Routine Checkup");
		addp.Appointment();
		Thread.sleep(3000);

		addp.copay("60");
		addp.custom1("Hello Test");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.printAccessPass();
		addp.addcheckin();	
		
	}}



