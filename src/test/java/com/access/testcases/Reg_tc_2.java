package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test

public class Reg_tc_2  extends BaseClass
{
	public void RegistrationPage() throws Exception
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
		Thread.sleep(10000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Butler");
		//User Enter FirstName
		addp.fname("Harold");
		//User Enter MiddleName
		addp.mname("Lee");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("aidan@mailinator.com");
		addp.Clip_AppointTime("09:45");
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
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
		addp.Clip_LinkConnectAccount();
		addp.Clip_Linkpatient();
		Thread.sleep(2000);
		addp.Clip_LinkSelfoption();
		Thread.sleep(1000);
		addp.Clip_Addpatient();
		Thread.sleep(1000);
		addp.Clip_Checkin();
		Thread.sleep(1000);
		addp.Alert_ok();
		Thread.sleep(5000);
		r.Registration();
		Thread.sleep(10000);
		r.Previous();
		Thread.sleep(5000);
		r.StartPatient();
		Thread.sleep(5000);
		r.Headline_Message();
		Thread.sleep(2000);
		r.HOLD();
		Thread.sleep(5000);
		try
		{
			r.Hold_Patient_Message();
		}
		catch(Exception e)
		{
			System.out.println("Hold Message not displayed");
		}

		Thread.sleep(10000);
		r.Holdlist();
		Thread.sleep(5000);
		List<WebElement>Remove_Holdlist = driver.findElements(By.xpath("//table[@class=\"table table-striped table-hover ng-scope\"]//tbody"));
		System.out.println(Remove_Holdlist.size());
		for(int i=0;i<Remove_Holdlist.size();i++)
		{
			String Remove = Remove_Holdlist.get(i).getText();
			if(Remove.contains("Butler,Harold"))
			{
				Remove_Holdlist.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		try
		{
			r.Remove_Hodlist_Message();
		}
		catch(Exception e)
		{
			System.out.println("Remove hold list Message not displayed");
		}

	}
}
