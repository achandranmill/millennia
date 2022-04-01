package com.access.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.Random;
import com.access.pageobject.Clipboard;

import com.access.pageobject.loginpage;

@Test
public class Clip_tc_1 extends BaseClass
{
	public void Clipboard() throws InterruptedException, IOException
	{	
		//Clipboard addp = PageFactory.initElements(driver, Clipboard.class);
		
		driver.get(baseURL);
		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		

		Clipboard addp=new Clipboard(driver);
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Robin");
		//User Enter FirstName
		addp.fname("john");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		driver.findElement(By.xpath("//body/main[1]/div[1]/clipboard1[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/date-picker[1]/div[1]/input[1]")).sendKeys("10","15","1985");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(By.id("email")).sendKeys("john"+ randomInt +"@mailinator.com");
		//User Enter Appointment Time
		addp.ptime("0815");
		addp.searchdep("imenso");
		addp.seeingdropdown("seeingname");
		addp.flag();
		addp.comments("Please Call Before Visting");
		addp.reason("Routine Checkup");
		addp.Appointment();
		addp.copay("60");
		addp.custom1("Hello Test");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.printAccessPass();
		addp.connect();
		addp.relation();
		addp.addcheckin();
}}
