package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Self_Schedule_tc_9 extends BaseClass

{
	
	public void Clipboard() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.Registration();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("rathord");
		//User Enter FirstName
		addp.fname("nirmal");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("nirmal@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
	//	Thread.sleep(10000);
	//	addp.Clip_Seeing();
	//	Thread.sleep(1000);
	//	addp.Clip_Thoms();
		Thread.sleep(3000);
		addp.Clip_Comment("Nill");
		//addp.Clip_Reason("only checkup");
		//addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		Thread.sleep(3000);
		addp.Clip_LinkConnectAccount();
		Thread.sleep(3000);
		addp.Clip_LinkSelfoption();
		Thread.sleep(3000);
		addp.Clip_LinkSelf();
		Thread.sleep(3000);
		addp.Clip_Addpatient();
		Thread.sleep(3000);
		addp.Clip_Checkin();
		Thread.sleep(5000);
		addp.Display_message();
	}
}
