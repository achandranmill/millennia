package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_14 extends BaseClass

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
		Appointments ab = new Appointments(driver);
		ab.linkAppointment();
		ab.AppointDATE();
		Thread.sleep(10000);
		ab.Appoint_SendMessage();
		Thread.sleep(10000);
		MassMessaging m = new MassMessaging(driver);
		m.Date();
		Thread.sleep(10000);
		m.Date1("2022-10-01");
		Thread.sleep(10000);
		m.Date2("2022-10-31");
		Thread.sleep(10000);
		m.Btn_Apply();
		Thread.sleep(10000);
		m.StatusFilter();
		Thread.sleep(10000);
		m.StatusFilterSelect();
		m.StatusFilterSave();
		Thread.sleep(10000);
		WebElement Patinet_116 = driver.findElement(By.xpath("//button [contains(text(),'Send message to 116 patients')]"));
		Assert.assertEquals(true, Patinet_116.isDisplayed());
		System.out.println("Total Patients 166 displayed");
		Thread.sleep(1000);
		m.Eligible_SelectAll();
		Thread.sleep(1000);
		WebElement Patinet_0 = driver.findElement(By.xpath("//button [contains(text(),'Send message to 0 patients')]"));
		Assert.assertEquals(true, Patinet_0.isDisplayed());
		System.out.println("Total 0 Patient displayed");
		Thread.sleep(1000);
		m.patient1_select();
		Thread.sleep(1000);
		// IF SELECT 1 PATIENT ---- SEND MESSAGE PATIENT 1---- IS DISPLAYED 1 
		WebElement Patinet_1 = driver.findElement(By.xpath("//button [contains(text(),'Send message to 1 patients')]"));
		Assert.assertEquals(true, Patinet_1.isDisplayed());
		System.out.println("Total 1 Patient displayed");
		Thread.sleep(1000);
		// IF SELECT 2 PATIENT ---- SEND MESSAGE PATIENT 2---- IS DISPLAYED 2
		m.patient2_select();
		Thread.sleep(1000);
		WebElement Patinet_2 = driver.findElement(By.xpath("//button [contains(text(),'Send message to 2 patients')]"));
		Assert.assertEquals(true, Patinet_2.isDisplayed());
		System.out.println("Total 2 Patient displayed");
		Thread.sleep(1000);
		// IF SELECT 2 PATIENT ---- SEND MESSAGE PATIENT 3---- IS DISPLAYED 3
		m.patient3_select();
		Thread.sleep(1000);
		WebElement Patinet_3 = driver.findElement(By.xpath("//button [contains(text(),'Send message to 3 patients')]"));
		Assert.assertEquals(true, Patinet_3.isDisplayed());
		System.out.println("Total 3 Patient displayed");
		Thread.sleep(1000);
		// IF SELECT 4 PATIENT ---- SEND MESSAGE PATIENT 4---- IS DISPLAYED 4
		m.patient4_select();
		WebElement Patinet_4 = driver.findElement(By.xpath("//button [contains(text(),'Send message to 4 patients')]"));
		Assert.assertEquals(true, Patinet_4.isDisplayed());
		System.out.println("Total 4 Patients displayed");
		Thread.sleep(1000);
		// IF SELECT 5 PATIENT ---- SEND MESSAGE PATIENT 5---- IS DISPLAYED 5 
		m.patient5_select();
		Thread.sleep(1000);
		WebElement Patinet_5 = driver.findElement(By.xpath("//button [contains(text(),'Send message to 5 patients')]"));
		Assert.assertEquals(true, Patinet_5.isDisplayed());
		System.out.println("Total 5 Patients  displayed");
		Thread.sleep(1000);

	}
}