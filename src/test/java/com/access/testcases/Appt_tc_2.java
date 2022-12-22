package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Appt_tc_2 extends BaseClass

{
	
	//-------------------------------------Advanced Search------------------------------------------------

	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		try {
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		System.out.println("USER LOCATION IS PRESENT");
		}
		catch(Exception e) 
		{
			System.out.println("USER LOCATION IS PRESENT");
			
		}
		//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
        //------------------APPOINTMENT PAGE---------------------------------
		Appointments Click =new Appointments(driver);
        Click.linkAppointment();
		Thread.sleep(3000);
		//--------------------DATE RANGE ----------------------------------
		Click.AppointDATE();
		Thread.sleep(1000);
		Click.AppointDATE1("20221201");
		Thread.sleep(1000);
		Click.AppointDATE2("20221231");
		Thread.sleep(1000);
		Click.AppointDATEAPPLY();
		Thread.sleep(10000);
		//--------------------------ADVANCE SEARCH BUTTON------------------------------
		Click.AdvanceSearch();
		Thread.sleep(10000);
		Click.Advance_Lastname("mahajan");
		Click.Advance_Firstname("praveen");
		Click.Advance_Initial("kumar");
		Thread.sleep(3000);
		Click.Advance_Phone("7834897698");
		Click.Advance_Email("praveen@gmail.com");
		Click.Advance_DOB("01101992");
		Thread.sleep(3000);
		Click.Advance_Mrn("4000");
		//------------------------------------SEARCH BUTTON------------------------------
		Click.Searchbtn();
		Thread.sleep(15000);
		//------------------------------ACCORDING TO SELECTED DATE IS IN DISPLAY PATIENT---------------------
		WebElement Patinet_Display = driver.findElement(By.xpath("//span[contains(text(),'mahajan, praveen')]"));
		String Expexted = "mahajan, praveen";
		Assert.assertEquals(Patinet_Display.getText(), Expexted);
		System.out.println("Advance Search Patien is Displayed- PASSED");
		Thread.sleep(10000);
		
		
}
	
}