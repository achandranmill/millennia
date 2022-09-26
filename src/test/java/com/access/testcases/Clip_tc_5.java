package com.access.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Clip_tc_5  extends BaseClass

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
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("john@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Comment("Nill");
		addp.Clip_Reason("only checkup");
		addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_LinkConnectAccount();
		addp.Clip_Linkpatient();
		Thread.sleep(2000);
		addp.Clip_LinkSelfoption();
	}
}
