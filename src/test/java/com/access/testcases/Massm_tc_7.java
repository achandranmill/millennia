package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;
@Test
public class Massm_tc_7  extends BaseClass

{

	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		addp.lname("Tracy");
		//User Enter FirstName
		addp.fname("Sam");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("tracy@mailinator.com");
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
		//---------Send SMS Message ------------------
		addp.sendSmsMessages();
		addp.Clip_LinkConnectAccount();
		addp.Clip_Linkpatient();
		Thread.sleep(2000);
		addp.Clip_LinkSelfoption();
		Thread.sleep(1000);
		addp.Clip_Addpatient();
		//Thread.sleep(1000);
		//addp.Clip_Checkin();
		//Thread.sleep(1000);
		//addp.Alert_ok();
		Thread.sleep(10000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(3000);
		m.StatusFilter();
		Thread.sleep(3000);
		WebElement Select = driver.findElement(By.xpath("//*[@id=\"massMessaging\"]/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input"));
		if(Select.isSelected())
		{
			System.out.println("SelectAll checkbox selected");
		}
		else
		{
			Select.click();
		}
		Thread.sleep(3000);
		m.StatusFilterSave();
		Thread.sleep(10000);
		m.FirstName("Sam");
		m.LastName("Tracy");
		m.Search1();
		Thread.sleep(20000);
	    m.Eligible_print();
	    Thread.sleep(10000);
		WebElement e = driver.findElement(By.cssSelector("#directory > table > tbody > tr:nth-child(1) > td.text-right > div:nth-child(1) > span"));
		Thread.sleep(5000);
		String back_color = e.getCssValue("background-color");
		Thread.sleep(5000);
		System.out.println(back_color);
		Thread.sleep(5000);
		String hex_back_color = Color.fromString(back_color).asHex();
		Thread.sleep(5000);
		System.out.println(hex_back_color);
		Thread.sleep(5000);
		if(hex_back_color.equals("#3c763d"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		Thread.sleep(10000);
		WebElement e1 = driver.findElement(By.cssSelector("#directory > table > tbody > tr:nth-child(1) > td.text-right > div:nth-child(2) > span"));
		Thread.sleep(5000);
		String back_color1 = e.getCssValue("background-color");
		Thread.sleep(5000);
		System.out.println(back_color1);
		Thread.sleep(5000);
		String hex_back_color1 = Color.fromString(back_color1).asHex();
		Thread.sleep(5000);
		System.out.println(hex_back_color1);
		Thread.sleep(5000);
		if(hex_back_color1.equals("#E74C3C"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}
}
