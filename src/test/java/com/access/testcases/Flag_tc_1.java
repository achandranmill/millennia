package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Departments;

import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Flag_tc_1 extends BaseClass

{

	public void Organization() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
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
		og.FlagLabel("Flag of England");
		Thread.sleep(2000);
		og.Persistent();
		Thread.sleep(3000);
		og.AddNewFlag();
		Thread.sleep(2000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.Dep_Flag();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"disabled-container\"]//h3[contains(text(),'Flag of England')]")).click();
		Thread.sleep(2000);
		dept.Dep_Flag_Adminuser();
		Thread.sleep(10000);
		dept.Dep_Flag_ReturnAccess();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Long");
		//User Enter FirstName
		addp.fname("Cindy");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1999");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("john@gmail.com");
		Thread.sleep(2000);
		addp.Clip_AppointTime("09:30");
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		Thread.sleep(5000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Flag();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@ng-click=\"$ctrl.addFlag(flag)\"]//span[contains(text(),'Flag of England')]")).click();
		Thread.sleep(2000);
		addp.Clip_Comment("Routine checkup");
		//	addp.Clip_Reason("only checkup ");
		//	addp.Clip_Copay("10000");
		Thread.sleep(2000);
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		//addp.printAccessPass();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		//addp.Clip_Checkin();
		//Thread.sleep(10000);
		RegtPage r1=new RegtPage(driver);
		r1.Registration();
		Thread.sleep(3000);
		r1.search("Long", "Cindy");
		Thread.sleep(20000);
		driver.findElement(By.linkText("Long Cindy")).click();
		Thread.sleep(15000);
		boolean man_flag = driver.findElement(By.xpath("//img[@title=\"Flag of England\"]")).isDisplayed();
		Assert.assertTrue(man_flag);





	}
}
