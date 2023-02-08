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
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@	Test
public class Appt_tc_3 extends BaseClass
{

	//----------------------EDIT PATEINT-------------------

	public void Appointments() throws Exception
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
		addp.lname("Ward");
		//User Enter FirstName
		addp.fname("Kathie");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("ward@mailinator.com");
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
		//addp.sendEmailMessages();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		//---------------APPOINTMENT PAGE----------------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(30000);
		//--------------------------ADVANCE SEARCH BUTTON------------------------------
		WebElement AdvanceSearch = driver.findElement(By.xpath("//button[contains(text(),'Advanced Search')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", AdvanceSearch);
		Thread.sleep(1000);
		ap.Advance_Lastname("Ward");
		ap.Advance_Firstname("Kathie");
		ap.Advance_Initial("Thomson");
		Thread.sleep(3000);
		ap.Advance_Phone("9878900912");
		ap.Advance_Email("ward@mailinator.com");
		ap.Advance_DOB("01031993");
		Thread.sleep(3000);
		ap.Advance_Mrn("");
		//------------------------------------SEARCH BUTTON------------------------------
		ap.Searchbtn();
		Thread.sleep(30000);
		ap.Patient_Displayed();
		//----------------THREE DOT---------------------------------------
		ap.ThreeDot();
		Thread.sleep(10000);
		ap.ThreDotSetConfirmed();
		WebElement SetConfirmed = driver.findElement(By.xpath("//span[@ng-if=\"$ctrl.patient.apptStatus == 'CONFIRMED'\"]"));
		String CONFIRMED_Excepted = "CONFIRMED";
		Assert.assertEquals(SetConfirmed.getText(), CONFIRMED_Excepted);
		System.out.println("Confirmed Status displayed - Passed");
		Thread.sleep(10000);
		ap.Patient_Appointment_Displayed();
		//----------------THREE DOT---------------------------------------
		ap.ThreeDot();
		Thread.sleep(3000);
		ap.EditAppointment();
		Thread.sleep(3000);
		ap.EditEmail(" eli@gmail.com ");
		ap.EditDob("06111999");
		Thread.sleep(3000);
		ap.EditFlag();
		Thread.sleep(2000);
		ap.EditFlag1();
		Thread.sleep(3000);
		ap.EditSave();
		Thread.sleep(10000);
		ap.Patient_Appointment_Displayed();
		//-------------------Navigate to the Patient on Reg Card------------------------
		r.clickRegistrationPage();
		Thread.sleep(30000);
		r.search("Ward", "Kathie");
		Thread.sleep(20000);
		List<WebElement> list = driver.findElements(By.xpath("//tbody//tr[@class='ng-scope']//td/descendant::a[@class='ng-binding']"));
		Thread.sleep(10000);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			String listitem = list.get(i).getText();
			if(listitem.matches("Ward ,Kathie" ))
			{
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(10000);




	}
}