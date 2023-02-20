package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Reg_tc_4 extends BaseClass

{

	public void RegistrationPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		Thread.sleep(5000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		r.clickredit("Carol", "Perry", "Ell");
		Thread.sleep(3000);
		r.Editdate();
		r.txtdate("03-12-2022");
		Thread.sleep(3000);
		r.txtEditAPPTTIME("09:45");
		r.AMPM();
		r.APPLIAM();
		r.gender("Male");
		Thread.sleep(5000);
		r.Editseeing();
		Thread.sleep(3000);
		r.Number("7896509874");
		Thread.sleep(3000);
		r.Email("ken@gmail.com");
		Thread.sleep(3000);
		r.contactname("Carol");
		Thread.sleep(3000);
		r.contactnumber("7777777777");
		Thread.sleep(3000);
		r.Editcopay();
		Thread.sleep(3000);
		r.Copay("7000");
		Thread.sleep(3000);
		r.comment("Routine checkup");
		Thread.sleep(3000);
		r.FLAGS();
		Thread.sleep(3000);
		r.Previous();
		Thread.sleep(1000);
		r.NEXT();
		Thread.sleep(5000);
		WebElement Patient_Name = driver.findElement(By.xpath("//span[contains(text(),'Carol, Perry')]"));
		Assert.assertTrue(Patient_Name.isDisplayed(), "Patient not displayed");
		
	}
}
