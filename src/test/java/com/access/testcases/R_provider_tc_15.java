package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_provider_tc_15 extends BaseClass

{
	public void Provider() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);  
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
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		pd.Provider();
		Thread.sleep(5000);
		pd.ADDProvider();
		Thread.sleep(5000);
		try
		{
		driver.findElement(By.xpath("//button[@ng-show=\"closeable\"  or @ng-click=\"close({$event: $event})\"]")).click();
		}
		catch(Exception e)
		{
			
		}
		pd.FirstName("Dr.Kennedy");
		pd.LastName("Ander");
		pd.MiddleName("John");
		pd.Credentials("MD");
		pd.EmailAddress("Kennedy@mailinator.com");
		pd.PhoneNumber("8456666666");
		pd.Gender();
		pd.Male();
		pd.GeneratePassword();
		Thread.sleep(3000);
		pd.ProviderId("1234567");
		pd.NationalProviderIdentifier_NPI("1234567890");
		pd.TaxpayerIdentificationNumber_TIN("12345");
		pd.FHIRProvider_ID("12345678");
		pd.Departments();
		pd.CheckAll();
		pd.DisplayName("Dr.Kennedy");
		pd.Provider_Save();
		Thread.sleep(10000);
		boolean Provider_Save_Mess=driver.findElement(By.xpath("//span[contains(text(),'Provider: kennedy@mailinator.com has been created.')]")).isDisplayed();
		Assert.assertTrue(Provider_Save_Mess);
	
		
	}
}