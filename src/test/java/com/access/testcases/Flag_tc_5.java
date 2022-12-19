package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Departments;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Flag_tc_5 extends BaseClass

{

	 public void Organization() throws Exception
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
			r.clickRegistrationPage();
			Thread.sleep(3000);
			Provider pd = new Provider(driver);
		//	pd.LocationPopup("Florida");
			Thread.sleep(3000);
			pd.UserAdmin();
			Thread.sleep(3000);
			pd.Admin();
			Thread.sleep(3000);
			Organization og = new Organization(driver);
			og.Organization();
			Thread.sleep(3000);
			og.Flags();
			Thread.sleep(2000);
	        og.Choosefile();
	        Thread.sleep(5000);
	        og.Cropimage();
	        Thread.sleep(3000);
	        og.FlagLabel("dlj");
	        Thread.sleep(2000);
	        og.AddNewFlag();
	        Thread.sleep(2000);
	        Departments dept=new Departments(driver);
			dept.departmentlink();
			Thread.sleep(5000);
			dept.Dep_Flag();
			Thread.sleep(20000);
			dept.Dep_Flag_Assigned();
			Thread.sleep(2000);
			dept.Dep_Flag_Adminuser();
			Thread.sleep(10000);
			dept.Dep_Flag_ReturnAccess();
			Thread.sleep(3000);
			Clipboard addp=new Clipboard(driver);
			addp.LinkclickBoard();
			Thread.sleep(5000);
			//User Enter lastName
			addp.lname("dudhe");
			//User Enter FirstName
			addp.fname("Rajesh");
			//User Enter MiddleName
			addp.mname("kumar");
			//User Enter Birthdate
			addp.DOB("01031999");
			//User Enter PhoneNumber
			addp.pnumber("8888888888");
			Thread.sleep(2000);
			//User Enter Email
			addp.textemail("john@gmail.com");
			Thread.sleep(2000);
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
	//		addp.Clip_Reason("only checkup ");
	//		addp.Clip_Copay("10000");
			Thread.sleep(2000);
			addp.sendSmsMessages();
			addp.sendEmailMessages();
			//addp.printAccessPass();
			addp.Clip_Addpatient();
			Thread.sleep(10000);
			addp.Clip_Checkin();
			Thread.sleep(10000);
		    addp.Alert_ok();
			 Thread.sleep(2000);
			 Appointments Click =new Appointments(driver);
             Click.linkAppointment();
				Thread.sleep(10000);
				Click.SearchLastName("dudhe");
				Click.SearchButton();
				Thread.sleep(10000);
		}
	
	
}
