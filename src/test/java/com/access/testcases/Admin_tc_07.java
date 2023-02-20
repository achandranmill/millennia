package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.loginpage;

@Test
public class Admin_tc_07 extends BaseClass

{

	public void Admin() throws Exception
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
		ad.registration();
		Thread.sleep(5000);
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.clipboardlink();
		Thread.sleep(5000);
		//-------Clipboard Patient Field---------------------------------
		dept.Middle_Name_Remove();
		Thread.sleep(2000);
		dept.Dob_Remove();
		Thread.sleep(2000);
		dept.Phone_Remove();
		Thread.sleep(2000);
		dept.Email_Remove();
		Thread.sleep(2000);
		dept.Additional_Phone_Number_Remove();
		Thread.sleep(2000);
		//dept.Gender_Remove();
		Thread.sleep(2000);
		dept.SSN_Remove();
		Thread.sleep(2000);
		dept.MRN_Remove();
		Thread.sleep(2000);
		dept.Additional_Contact_Name_Remove();
		Thread.sleep(2000);
		dept.savebtnclk();
		Thread.sleep(5000);
		boolean Configuration_Message=driver.findElement(By.xpath("//span[contains(text(),'Clipboard configuration saved.')]")).isDisplayed();
		Assert.assertTrue(Configuration_Message);
		Thread.sleep(2000);
		dept.adminprofileclk();
		Thread.sleep(5000);
		dept.returntoaccess();
		Thread.sleep(5000);
		try
		{
		boolean Middle_name=driver.findElement(By.xpath("//*[@id=\"middleInit\"]")).isDisplayed();
		Assert.assertFalse(Middle_name);
		Thread.sleep(1000);
		boolean Dob = driver.findElement(By.xpath("//input[@name=\"dob\"]")).isDisplayed();
		Assert.assertFalse(Dob);
		Thread.sleep(1000);
		boolean Phone=driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).isDisplayed();
		Assert.assertFalse(Phone);
		Thread.sleep(1000);
		boolean Email =driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
		Assert.assertFalse(Email);
		Thread.sleep(1000);
		boolean Additional_phone=driver.findElement(By.xpath("//*[@id=\"appointmentContactNumber\"]")).isDisplayed();
		Assert.assertFalse(Additional_phone);
		Thread.sleep(1000);
		boolean Gender = driver.findElement(By.xpath("//*[@id=\"gender\"]")).isDisplayed();
		Assert.assertFalse(Gender);
		Thread.sleep(1000);
		boolean SSN=driver.findElement(By.xpath("//*[@id=\"ssn\"]")).isDisplayed();
		Assert.assertFalse(SSN);
		Thread.sleep(1000);
		boolean MRN= driver.findElement(By.xpath("//*[@id=\"mrn\"]")).isDisplayed();
		Assert.assertFalse(Additional_phone);
		Thread.sleep(1000);
		boolean Additional_contact=driver.findElement(By.xpath("//*[@id=\"appointmentContactName\"]")).isDisplayed();
		Assert.assertFalse(Additional_contact);
		}
		catch(Exception e)
		{
			
		}



	}

}
