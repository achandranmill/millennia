package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.*;

@Test
public class Massm_tc_1  extends BaseClass

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
		//-----------------CLIP BOARD PAGE---------------------------------
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Green");
		//User Enter FirstName
		addp.fname("Isabel");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		WebElement MRN=driver.findElement(By.id("mrn"));
		MRN.sendKeys("000024");
		//User Enter Email
		addp.textemail("Green@mailinator.com");
		//addp.Clip_AppointTime("09:45");
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
		Thread.sleep(10000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(10000);
		m.StatusFilter();
		Thread.sleep(3000);
		WebElement Select = driver.findElement(By.xpath("//input[@ng-model='$ctrl.checkAllStatusCheck']"));
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
		m.LastName("Green");
		Thread.sleep(2000);
		m.FirstName("Isabel");
		Thread.sleep(2000);
		m.Initial("Thomson");
		Thread.sleep(2000);
		m.PhoneNumber("9878900912");
		Thread.sleep(2000);
		m.Email("Green@mailinator.com");
		Thread.sleep(2000);
		m.DOB("01031993");
		Thread.sleep(2000);
		m.MRN("000024");
		Thread.sleep(2000);
		m.Search1();
		Thread.sleep(40000);
		WebElement Patient = driver.findElement(By.xpath("//td[contains(text(),'Green, Isabel')]"));
		String Excepted = "Green, Isabel";
		Assert.assertEquals(Patient.getText(), Excepted);
		System.out.println("Test case - Passed");
	}
}