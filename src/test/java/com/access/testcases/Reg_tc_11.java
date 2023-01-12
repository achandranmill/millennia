package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Get_In_Line;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Reg_tc_11 extends BaseClass

{
	@Test
	public void RegtPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		addp.lname("Robin");
		//User Enter FirstName
		addp.fname("John");
		//User Enter MiddleName
		addp.mname("Thomson");
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
	    Thread.sleep(1000);
		addp.Clip_Addpatient();
		Thread.sleep(1000);
		addp.Clip_Checkin();
		Thread.sleep(1000);
		addp.Alert_ok();
		Thread.sleep(10000);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		r.search("Robin", "John");
		List<WebElement> list = driver.findElements(By.xpath("//tr[@ng-repeat=\"patient in $ctrl.patientList | filter: { displayString: displayStringFilter, lastName: lastNameFilter, firstName: firstNameFilter} | limitTo: 6\"]"));
		System.out.println(list.size());

		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			if(listitem.contains("Robin John"))
			{
				list.get(i).click();
				break;

			}
		}
		r.FormsOnDemand();
		Thread.sleep(10000);
		r.Appointment_Type();
		r.Appointment_Type_CheckAll();
		Thread.sleep(1000);
		r.FormsOnDemand_Select();
		r.FormsOnDemand_Select_checkAll();
		Thread.sleep(5000);
		r.Forms_on_Demand_send();
		Thread.sleep(20000);
		r.Document_forms_No();
		Thread.sleep(1000);
		//Verify new appointment appears on "My Events" when logging into Connect portal 
		driver.get("https://connect-stage-a.jellyfishhealth.com:443/inline?d=Imenso.sandbox-staging");
		//----------------GET-IN-LINE (CONNECT PORTAL)--------------------------------
		Get_In_Line of = new Get_In_Line(driver);
		of.Sing_in();
		Thread.sleep(1000);
		of.Sign_Email("user_test@mailinator.com");
		Thread.sleep(1000);
		of.Sign_Password("Random@123456789");
		Thread.sleep(1000);
		of.Sign_Submit();
		Thread.sleep(15000);
		of.My_Documents();
		



	}
}