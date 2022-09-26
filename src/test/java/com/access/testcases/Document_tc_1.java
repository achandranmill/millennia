package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Document_tc_1 extends BaseClass

{
	
	public void Document() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Rohan");
		//User Enter FirstName
		addp.fname("mahajan");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("rohan@gmail.com");
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
		Thread.sleep(10000);
		addp.Clip_Checkin();
		r.clickRegistrationPage();
		Thread.sleep(2000);
		r.search("Rohan", "mahajan");
		Thread.sleep(10000);
		r.Document();
		Thread.sleep(5000);
		WebElement complete = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[2]/a/div"));
		String ExpectedText = "COMPLETE";
		Assert.assertEquals(ExpectedText, complete.getText());
		System.out.println("COMPLETE text is a expected – Assert passed");
		Thread.sleep(5000);
		
		
	}
	

}
