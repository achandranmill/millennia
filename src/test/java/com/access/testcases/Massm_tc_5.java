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
public class Massm_tc_5  extends BaseClass

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
		addp.lname("Andy");
		//User Enter FirstName
		addp.fname("Leo");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("leo@mailinator.com");
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
		addp.Clip_Checkin();
		Thread.sleep(1000);
		addp.Alert_ok();
		Thread.sleep(10000);
        UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(10000);
	    m.SeeingFilter();
	    Thread.sleep(3000);
	    WebElement Seeing_SelectAll = driver.findElement(By.xpath("//*[@id=\"massMessaging\"]/div[1]/div/div/seeing-filter/div[2]/div[1]/label/input"));
	    if(Seeing_SelectAll.isSelected())
	    {
	    	Seeing_SelectAll.click();
	    }
	    else
	    {
	    
	    }
		WebElement Provider = driver.findElement(By.xpath("//*[@id=\"massMessaging\"]/div[1]/div/div/seeing-filter/div[2]/div[23]/label/input"));
		if(!Provider.isSelected())
		{
			Provider.click();
		}
		else
		{
			
		}
		Thread.sleep(3000);
		m.SeeingCancel();
		Thread.sleep(3000);
		m.LastName("Andy");
		m.FirstName("Leo");
		m.Search1();
		Thread.sleep(10000);
		WebElement Patient = driver.findElement(By.xpath("//td[contains(text(),'Andy, Leo')]"));
		String Excepted = "Andy, Leo";
		Assert.assertEquals(Patient.getText(), Excepted);
		System.out.println("Test case - Passed");
		m.Eligible_print();
	
	}
}