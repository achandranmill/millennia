package com.access.testcases;

import java.util.List;
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
public class Document_tc_24 extends BaseClass

{
	
	public void Forms() throws Exception
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
		System.out.println("USER LOCATION IS PRESENT");
		}
		catch(Exception e) 
		{
			System.out.println("USER LOCATION IS PRESENT");
			
		}
		//-----------------------REGISTRATION PAGE-----------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		//----------------------CLIP BOARD PAGE-------------------------------
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("chandke");
		//User Enter FirstName
		addp.fname("Umesh");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("Umesh@mailinator.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(10000);
		addp.Clip_Appointment_option();
		Thread.sleep(10000);
        addp.Clip_Comment("Nill");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
        //--------------------------APPOINTMENT PAGE-------------------------
        Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		ap.SearchLastName("chandke");
		ap.SearchButton();
		Thread.sleep(10000);
		ap.ThreeDot();
		Thread.sleep(10000);
		ap.ThreeDotForms();
		Thread.sleep(10000);
		r.RCB_FirstName("Umesh");
		r.RCB_LastName("chandke");
		r.RCB_Dob("09081994");
		Thread.sleep(3000);
		r.RCB_Ssn("777777777");
		Thread.sleep(3000);
		r.RCB_PatientStreetAddress("india");
		r.RCB_ZipCode("451010");
		r.RCB_Signature();
		r.RCB_Signature2();
		Thread.sleep(3000);
		r.RCB_save();
		Thread.sleep(20000);
		WebElement complete = driver.findElement(By.xpath("//span[contains(text(),'COMPLETE')]"));
		String ExpectedText = "COMPLETE";
		Assert.assertEquals(ExpectedText, complete.getText());
		System.out.println("COMPLETE text is a expected – Assert passed");
		Thread.sleep(5000);
		r.makechanges();
		r.RCB_FirstName("vivek");
		r.RCB_LastName("roy");
		r.RCB_save();
		Thread.sleep(10000);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		r.search("roy", "vivek");
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath(""));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			
			if(listitem.contains("roy vivek"))
			{
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(10000);
		r.Document();
		Thread.sleep(10000);
		WebElement R_RCB_complete = driver.findElement(By.xpath("//span[contains(text(),'COMPLETE')]"));
		String R_RCB_ExpectedText = "COMPLETE";
		Assert.assertEquals(R_RCB_ExpectedText, R_RCB_complete.getText());
		System.out.println("COMPLETE text is a expected – Assert passed");
		Thread.sleep(5000);
		

}
}