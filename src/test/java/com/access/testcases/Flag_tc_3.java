package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Departments;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

@Test
public class Flag_tc_3 extends BaseClass

{

	 private static final TimeUnit SECONDS = null;

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
	        og.FlagLabel("covisit12");
	        Thread.sleep(2000);
	        og.Persistent();
	        Thread.sleep(3000);
	        og.AddNewFlag();
	        Thread.sleep(2000);
	        Departments dept=new Departments(driver);
			dept.departmentlink();
			Thread.sleep(5000);
			dept.Dep_Flag();
			Thread.sleep(30000);
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
			addp.lname("gayke");
			//User Enter FirstName
			addp.fname("Rakesh");
			//User Enter MiddleName
			addp.mname("Thomson");
			//User Enter Birthdate
			addp.DOB("01031999");
			//User Enter PhoneNumber
			addp.pnumber("9878900912");
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
			Thread.sleep(5000);
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
			 Thread.sleep(5000);
              addp.Alert_ok();
              Thread.sleep(10000);
				WorkListPage w = new WorkListPage(driver);
				w.worklist();
			   Thread.sleep(20000);
		         w.work_Send_to();
				Thread.sleep(5000);
				w.work_Discharg();
				Thread.sleep(10000);
				w.work_ViewDischargedPatients();
				Thread.sleep(3000);
				w.work_sendbacktobutton();
				Thread.sleep(3000);
				w.work_PatientoComeInside();
				Thread.sleep(2000);
				w.work_ReturntoActivePatients();
				Thread.sleep(5000);
				
			}
	
	
	
	
}
