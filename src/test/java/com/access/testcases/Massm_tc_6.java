package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;
@Test
public class Massm_tc_6  extends BaseClass

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
		addp.lname("Leoo");
		//User Enter FirstName
		addp.fname("Andyo");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("anyd@mailinator.com");
		addp.Clip_AppointTime("09:45");
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
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
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		m.StatusFilter();
		Thread.sleep(3000);
		WebElement SelectAll = driver.findElement(By.xpath("//input[@ng-model='$ctrl.checkAllStatusCheck']"));
		if(SelectAll.isSelected())
		{
			SelectAll.click();
			System.out.println("Status selectall checkbox not selected");
		}
		else
		{
			
			System.out.println("Status selectall checkbox selected");
		}
		Thread.sleep(3000);
		WebElement Unconfirmed = driver.findElement(By.xpath("//*[@id='Unconfirmed']"));
		if(!Unconfirmed.isSelected())
		{
			Unconfirmed.click();
			System.out.println("Unconfirmed checkbox selected");
		}
		else
		{
			
			System.out.println("Unconfirmed checkbox not selected");
		}
		Thread.sleep(3000);
		WebElement Confirmed = driver.findElement(By.xpath("//*[@id='Confirmed']"));
		if(!Confirmed.isSelected())
		{
			Confirmed.click();
			System.out.println("Confirmed checkbox selected");
		}
		else
		{
			
			System.out.println("Confirmed checkbox not selected");
		}
		Thread.sleep(3000);
	    m.StatusFilterSave();
		Thread.sleep(3000);
		m.LastName("Leoo");
		m.FirstName("Andyo");
		m.Search1();
		Thread.sleep(15000);
		WebElement Patient = driver.findElement(By.xpath("//td[contains(text(),'Leoo, Andyo')]"));
		String Excepted = "Leoo, Andyo";
		Assert.assertEquals(Patient.getText(), Excepted);
		System.out.println("Test case - Passed");
		WebElement UNCONFIRMED_Status = driver.findElement(By.xpath("//span[contains(text(),'UNCONFIRMED')]"));
		Assert.assertTrue(UNCONFIRMED_Status.isDisplayed(), "UNCONFIRMED status not displayed");
		m.Eligible_print();
		
	}
}