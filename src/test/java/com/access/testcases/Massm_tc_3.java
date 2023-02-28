package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
public class Massm_tc_3   extends BaseClass

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
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Loriee");
		//User Enter FirstName
		addp.fname("Cory");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01-03-1993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("lori@mailinator.com");
	    Thread.sleep(5000);
	    addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		addp.clipdepartmenttype();
		addp.clipdeptmilleniaoption1();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		addp.Clip_Comment("Routine checkup");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		addp.Clip_Checkin();
		Thread.sleep(5000);
		addp.Alert_ok();
		Thread.sleep(15000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(3000);
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
        m.LastName("Loriee");
		Thread.sleep(2000);
		m.FirstName("Cory");
		Thread.sleep(2000);
		m.Initial("Thomson");
		m.Search1();
		Thread.sleep(15000);
		WebElement Select1 =driver.findElement(By.xpath("//button[@id='messages']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", Select1);
		m.Select_Message();
		m.Select_Message_option1();
		Thread.sleep(5000);
		m.Send_Message_Patient();
		Thread.sleep(5000);
		m.Message_History_print();
		Thread.sleep(10000);
		WebElement Patient = driver.findElement(By.xpath("//td[contains(text(),'Cory Loriee')]"));
		js.executeScript("arguments[0].scrollIntoView();", Patient);
		String Excepted = "Cory Loriee";
		Assert.assertEquals(Patient.getText(), Excepted);
		System.out.println("Test case - Passed");
		
	}
}
