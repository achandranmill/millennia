package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Document_tc_7 extends BaseClass

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
		Thread.sleep(10000);
		//User Enter lastName
		addp.lname("meena");
		//User Enter FirstName
	     addp.fname("dewarker");
		//User Enter MiddleName
		addp.mname("kumari");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("roshni@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(10000);
		addp.Clip_Seeing();
		Thread.sleep(1000);
		addp.Clip_Thoms();
		Thread.sleep(3000);
		addp.Clip_Comment("Nill");
		addp.Clip_Reason("only checkup");
		addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		Thread.sleep(20000);
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		 Thread.sleep(10000);
		 addp.Alert_ok();
		 Thread.sleep(2000);
		 addp.lname("s");
		 Thread.sleep(10000);
		r.clickRegistrationPage();
		Thread.sleep(5000);
		r.search("Dewarker", "Meena");
		Thread.sleep(30000);
		r.search_click();
		Thread.sleep(10000);
		r.Document();
		Thread.sleep(2000);
		r.Document_firstname("Meena");
		Thread.sleep(3000);
		r.Document_lastname("Dewarker");
		Thread.sleep(2000);
		r.Document_middlename("kumari");
		Thread.sleep(2000);
		r.Document_Dob("09081999");
		Thread.sleep(2000);
		r.Document_Saveform();
		Thread.sleep(2000);
		r.Doc_Print();
		Thread.sleep(10000);
		r.PDF_threedot();
		Thread.sleep(5000);
		r.PDF_document();
		Thread.sleep(10000);
		
		
	}	
	


}
