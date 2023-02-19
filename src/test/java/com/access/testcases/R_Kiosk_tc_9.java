package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Kiosk;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_9 extends BaseClass

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
		Provider pd = new Provider(driver);
		Kiosk k = new Kiosk(driver);
		Thread.sleep(5000);
		driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(10000);
		k.Press_HereTo_Start();
		Thread.sleep(10000);
		k.FirstName("Awdesh");
		Thread.sleep(1000);
		k.LastName("Jain");
		Thread.sleep(1000);
		k.Search();
		Thread.sleep(1000);
		WebElement Expected = driver.findElement(By.xpath("//h1[contains(text(),'Jain, Awdesh')]"));
		String Actual       = "Jain, Awdesh";
		Assert.assertEquals(Actual, Expected.getText());
		Thread.sleep(1000);
		k.CHECK_IN();
		Thread.sleep(10000);




	}

}
