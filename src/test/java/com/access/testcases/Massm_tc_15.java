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
public class Massm_tc_15 extends BaseClass

{

	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//AdmUser ad=new AdmUser(driver);
		//ad.userlocation();
		//Thread.sleep(5000);
		//ad.okbutton();
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
		m.LastName("Bell");
		Thread.sleep(1000);
		m.FirstName("Hari");
		Thread.sleep(1000);
		m.Search1();
		Thread.sleep(10000);
		WebElement Bell_Hari = driver.findElement(By.xpath("//td[contains(text(),'Bell, Hari')]"));
		Assert.assertEquals(true, Bell_Hari.isDisplayed());
		System.out.println("BELL HARI PATIENT IS DISPLAYED - ASSERT PASSED");
		Thread.sleep(1000);
		WebElement Bell_Hari_Confirmed = driver.findElement(By.xpath("//span[contains(text(),'CONFIRMED')]"));
		Assert.assertEquals(true, Bell_Hari_Confirmed.isDisplayed());
		System.out.println("BELL HARI PATIENT STATUS CONFIRMED IS DISPLAYED--Asser PASSED");
		Thread.sleep(1000);
		m.LastName("patil");
		Thread.sleep(1000);
		m.FirstName("Rakesh");
		Thread.sleep(1000);
		m.Search1();
		Thread.sleep(10000);
		WebElement Rakesh = driver.findElement(By.xpath("//td[contains(text(),'Patil, Rakesh')]"));
		Assert.assertEquals(true, Rakesh.isDisplayed());
		System.out.println("Rakesh PATIENT IS DISPLAYED - ASSERT PASSED");
		Thread.sleep(1000);
		WebElement Rakesh_Cancel = driver.findElement(By.xpath("//span[contains(text(),'CANCELLED')]"));
		Assert.assertEquals(true, Rakesh_Cancel.isDisplayed());
		System.out.println("Rakesh PATIENT STATUS Cancelled IS DISPLAYED--Asser PASSED");
		Thread.sleep(1000);
		m.LastName("Kohli");
		Thread.sleep(1000);
		m.FirstName("Virat");
		Thread.sleep(1000);
		m.Search1();
		Thread.sleep(10000);
		WebElement Virat = driver.findElement(By.xpath("//td[contains(text(),'Kohli, Virat')]"));
		Assert.assertEquals(true, Virat.isDisplayed());
		System.out.println("Virat PATIENT STATUS Cancelled IS DISPLAYED--Asser PASSED");
		Thread.sleep(1000);
		WebElement Virat_CHECKEDIN = driver.findElement(By.xpath("//span[contains(text(),'CHECKED-IN')]"));
		Assert.assertEquals(true, Virat_CHECKEDIN.isDisplayed());
		System.out.println("Virat PATIENT STATUS _CHECKED-IN IS DISPLAYED--Asser PASSED");
		Thread.sleep(1000);
		
	
	
}
}