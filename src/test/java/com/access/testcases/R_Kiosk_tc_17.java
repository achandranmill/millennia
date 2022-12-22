package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.Appointments;
import com.access.pageobject.Kiosk;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_17 extends BaseClass

{
	public void Kiosk() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		//AdmUser ad=new AdmUser(driver);
		//ad.userlocation();
		//Thread.sleep(5000);
		//ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(10000);
		Kiosk k = new Kiosk(driver);
		k.Press_HereTo_Start();
		Thread.sleep(10000);
		k.FirstName("Awdesh");
		Thread.sleep(1000);
		k.LastName("Jain");
		Thread.sleep(1000);
		WebElement DOB_FORMAT = driver.findElement(By.xpath("//span[contains(text(),'mm/dd/yyyy')]"));
		String Expected = "mm/dd/yyyy";
		Assert.assertEquals(DOB_FORMAT.getText(), Expected);
		System.out.println("MM/DD/YYYY Format is Display - PASSED");
		Thread.sleep(1000);
		k.Kiosk_DOB();
		Thread.sleep(1000);
		k.Kiosk_1990();
		Thread.sleep(1000);
		k.Kiosk_1995();
		Thread.sleep(1000);
		k.Kiosk_Feb();
		Thread.sleep(1000);
		k.Kiosk_1();
		Thread.sleep(1000);
		k.Search();
		Thread.sleep(10000);
		WebElement CHECK_IN = driver.findElement(By.xpath("//button[contains(text(),'CHECK IN')]"));
		String Expected_CHECK_IN = "CHECK IN";
		Assert.assertEquals(CHECK_IN.getText(), Expected_CHECK_IN);
		System.out.println(" CHECK_IN is Display - PASSED");
		Thread.sleep(1000);
		k.CHECK_IN();
		Thread.sleep(10000);
		WebElement CHECK_IN_Appointment = driver.findElement(By.xpath("//h1[contains(text(),'Jain, Awdesh')]"));
		String Expected_Appointment = "Jain, Awdesh";
		Assert.assertEquals(CHECK_IN.getText(), Expected_CHECK_IN);
		System.out.println(" Jain, Awdesh patient is Display - PASSED");
		 Thread.sleep(10000);
			driver.get(baseURL);
			Thread.sleep(10000);
			//User Check Successful login on valid email and password
			k.Login_email("user_test@mailinator.com");
			Thread.sleep(10000);
			k.Login_password("Imenso@test123");
			Thread.sleep(10000);
			k.Login_submit();
			Thread.sleep(10000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Thread.sleep(10000);
			//r.clickRegistrationPage();
			Thread.sleep(10000);
			Appointments ap=new Appointments(driver);
			ap.linkAppointment();
			Thread.sleep(10000);
			WebElement CHECK_IN_Appointment1 = driver.findElement(By.xpath("//span[contains(text(),'Jain, Awdesh')]"));
			String Expected_Appointment1 = "Jain, Awdesh";
			Assert.assertEquals(CHECK_IN_Appointment1.getText(), Expected_Appointment1);
			System.out.println(" Jain, Awdesh patient is Display - PASSED");
			Thread.sleep(10000);
			WebElement Appointment_DATE = driver.findElement(By.xpath("//span[contains(text(),'02/01/1995')]"));
			String Expected_Appointment_DATE = "02/01/1995";
			Assert.assertEquals(Appointment_DATE.getText(), Expected_Appointment_DATE);
			System.out.println(" 02/01/1995  Patient Date is Display - PASSED");
			driver.manage().deleteAllCookies();


		}



	}


