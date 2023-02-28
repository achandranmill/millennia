package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Kiosk;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_18 extends BaseClass

{

	public void Kiosk() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
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
		driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(10000);
		Kiosk k = new Kiosk(driver);
		k.Press_HereTo_Start();
		Thread.sleep(10000);
		k.FirstName("Leo");
		Thread.sleep(1000);
		k.LastName("Shaw");
		Thread.sleep(1000);
		WebElement DOB_FORMAT = driver.findElement(By.xpath("//span[contains(text(),'mm/dd/yyyy')]"));
		String Expected = "mm/dd/yyyy";
		Assert.assertEquals(DOB_FORMAT.getText(), Expected);
		System.out.println("MM/DD/YYYY Format displayed");
		Thread.sleep(1000);
		k.Kiosk_DOB();
		Thread.sleep(1000);
		k.Kiosk_2000();
		Thread.sleep(1000);
		k.Kiosk_2005();
		Thread.sleep(1000);
		k.Kiosk_Feb2();
		Thread.sleep(1000);
		k.Kiosk_10();
		Thread.sleep(1000);
		k.Search();
		Thread.sleep(10000);
		WebElement CHECK_IN = driver.findElement(By.xpath("//button[contains(text(),'CHECK IN')]"));
		String Expected_CHECK_IN = "CHECK IN";
		Assert.assertEquals(CHECK_IN.getText(), Expected_CHECK_IN);
		System.out.println(" CHECK IN displayed");
		Thread.sleep(1000);
		k.CHECK_IN();
		Thread.sleep(10000);
		WebElement CHECK_IN_Appointment = driver.findElement(By.xpath("//h1[contains(text(),'Shaw, Leo')]"));
		String Expected_Appointment = "Shaw, Leo";
		Assert.assertEquals(CHECK_IN_Appointment.getText(), Expected_Appointment);
		System.out.println("  Patient displayed");
		Thread.sleep(10000);
		Thread.sleep(10000);
		driver.get(baseURL);
		Thread.sleep(10000);
		//User Check Successful login on valid email and password
		k.Login_email("user_test@mailinator.com");
		Thread.sleep(10000);
		k.Login_password("Random@123456789");
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
		ap.SearchLastName("Shaw");
		ap.SearchButton();
		Thread.sleep(10000);
		WebElement CHECK_IN_Appointment1 = driver.findElement(By.xpath("//span[contains(text(),'Shaw, Leo')]"));
		String Expected_Appointment1 = "Shaw, Leo";
		Assert.assertEquals(CHECK_IN_Appointment1.getText(), Expected_Appointment1);
		System.out.println(" Patient displayed");
		Thread.sleep(10000);
		WebElement Appointment_DATE = driver.findElement(By.xpath("//span[contains(text(),'02/10/2005')]"));
		String Expected_Appointment_DATE = "02/10/2005";
		Assert.assertEquals(Appointment_DATE.getText(), Expected_Appointment_DATE);
		System.out.println(" 02/10/2005 Date displayed");
		driver.manage().deleteAllCookies();


	}


}
