package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_11 extends BaseClass

{

	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
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
		Thread.sleep(10000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("sathe");
		//User Enter FirstName
		addp.fname("priya");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("sathe@mailinator.com");
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
		addp.Clip_LinkConnectAccount();
		addp.Clip_Linkpatient();
		Thread.sleep(2000);
		addp.Clip_LinkSelfoption();
		Thread.sleep(1000);
		addp.Clip_Addpatient();
		Thread.sleep(1000);
		Appointments ab = new Appointments(driver);
		ab.linkAppointment();
		Thread.sleep(5000);
        ab.Configurelist();
		Thread.sleep(10000);
		ab.EditStatusFilter();
		Thread.sleep(5000);
		WebElement SelectAll = driver.findElement(By.xpath("//input[@ng-model=\"$ctrl.checkAllStatusCheck\"]"));
		if(SelectAll.isSelected())
		{
			SelectAll.click();
		}
		else
		{
			System.out.println("SelctAll checkbox not selected");
		}
		Thread.sleep(2000);
		WebElement Confirm = driver.findElement(By.id("Confirmed"));
		if(!Confirm.isSelected())
		{
			Confirm.click();
		}
		else
		{
			System.out.println("Confirm checkbox not selected");
		}
		Thread.sleep(2000);
		WebElement Unconfirmed = driver.findElement(By.id("Unconfirmed"));
		if(!Unconfirmed.isSelected())
		{
			Unconfirmed.click();
		}
		else
		{
			System.out.println("Unconfirmed checkbox not selected");
		}
		Thread.sleep(5000);
		ab.StatusSave();
		Thread.sleep(10000);
		ab.ThreeDot();
		Thread.sleep(10000);
		ab.ThreDotSetConfirmed();
		WebElement confirm = driver.findElement(By.xpath("//span[contains(text(),'CONFIRMED')]"));
		Assert.assertEquals(true, confirm.isDisplayed());
		System.out.println("Confirm status displyaed");



	}
}