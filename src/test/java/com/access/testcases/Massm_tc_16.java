package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_16 extends BaseClass

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
		//-----------------CLIP BOARD PAGE---------------------------------
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Leee");
		//User Enter FirstName
		addp.fname("Bakerr");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("Leo@mailinator.com");
		//addp.Clip_AppointTime("09:45");
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
		addp.Clip_Checkin();
		Thread.sleep(1000);
		addp.Alert_ok();
		Thread.sleep(10000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(10000);
		m.LastName("Leee");
		m.FirstName("Bakerr");
		m.Search1();
		Thread.sleep(15000);
		WebElement Select =driver.findElement(By.xpath("//input[@id='cancel']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", Select);
		WebElement Cancel=driver.findElement(By.xpath("//input[@id='cancel']"));
		if(!Cancel.isSelected())
		{
			Cancel.click();
		}
		else
		{
			System.out.println("Cancel check-box is selected");
		}
		Thread.sleep(2000);
		m.Select_Message();
		m.Select_Message_option1();
		Thread.sleep(5000);
		m.Send_Message_Patient();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		Thread.sleep(5000);
		Appointments ab = new Appointments(driver);
		ab.linkAppointment();
		Thread.sleep(10000);
		ab.Configurelist();
		Thread.sleep(10000);
		ab.EditStatusFilter();
		Thread.sleep(10000);
		WebElement SelectAll = driver.findElement(By.xpath("//input[@ng-model='$ctrl.checkAllStatusCheck']"));
		if(!SelectAll.isSelected())
		{
			SelectAll.click();
		}
		else
		{

			
		}
		Thread.sleep(2000);
		ab.StatusSave();
		Thread.sleep(5000);
		ab.SearchLastName("Leee");
		ab.SearchButton();
		Thread.sleep(10000);
		WebElement Cancelled_Patient = driver.findElement(By.xpath("//span[contains(text(),'Leee, Bakerr')]"));
		Assert.assertTrue(Cancelled_Patient.isDisplayed(), "Patient not displayed");
		WebElement Cancelled_Status = driver.findElement(By.xpath("//span[contains(text(),'CANCELLED')]"));
		Assert.assertTrue(Cancelled_Status.isDisplayed(), "Cancelled status not displayed");
		List<WebElement>Lists =driver.findElements(By.xpath("//table[@st-table='$ctrl.displayedCollection']"));
		System.out.println(Lists.size());






	}
}