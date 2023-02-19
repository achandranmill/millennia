package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

public class Reg_tc_5 extends BaseClass

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
		Thread.sleep(5000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(1000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Robinn");
		//User Enter FirstName
		addp.fname("Johnn");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("john@gmail.com");
		addp.Gender("Male");
		addp.SSN("4444");
		addp.appointmentContactNumber("9876540998");
		addp.mrn("123456");
		addp.appointmentContactName("6778889990");
		//User Enter Appointment Time
		Thread.sleep(2000);
		addp.copay("60");
		Thread.sleep(2000);
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
		Thread.sleep(2000);
		//addp.Clip_AppointTime("0900");
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(1000);
		addp.Clip_Appointment_option();
		Thread.sleep(1000);
		addp.Clip_Seeing();
		Thread.sleep(1000);
		addp.Clip_Thoms();
		Thread.sleep(2000);
		addp.Flag1();
		Thread.sleep(2000);
		addp.FlagSelect();
		Thread.sleep(2000);
		addp.reason("Routine Checkup");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		addp.Clip_Checkin();
		addp.Alert_ok();
		Thread.sleep(1000);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		r.search("Robinn", "Johnn");
		Thread.sleep(5000);
		//WebElement patient = driver.findElement(By.linkText(""))
		driver.findElement(By.linkText("Robinn Johnn")).click();
	    Thread.sleep(5000);
		r.SendTo();
		Thread.sleep(3000);
		r.Dish();
		Thread.sleep(5000);
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(10000);
		w.DischargeViwe();
		Thread.sleep(10000);
		List<WebElement>AllDischarge=driver.findElements(By.xpath("//div[contains(@class,'col-sm-12 table-response')]"));
		boolean dataStatus = false;
		for(int i=0;i<AllDischarge.size();i++)
		{
			WebElement Element=AllDischarge.get(i);
			String value=Element.getText();
			if(value.contains("Johnn"))
			{
				dataStatus=true;
				break;
			}
		}
	}
}