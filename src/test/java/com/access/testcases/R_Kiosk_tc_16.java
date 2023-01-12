package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Kiosk;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class R_Kiosk_tc_16 extends BaseClass

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
		k.FirstName("Awdesh");
		Thread.sleep(1000);
		k.LastName("Jain");
		Thread.sleep(1000);
		WebElement DOB_FORMAT = driver.findElement(By.xpath("//span[contains(text(),'mm/dd/yyyy')]"));
		String Expected = "mm/dd/yyyy";
		Assert.assertEquals(DOB_FORMAT.getText(), Expected);
		System.out.println("MM/DD/YYYY Format displayed");
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



	}

}
