package com.access.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Flag_tc_10 extends BaseClass

{
	public void Organization() throws Exception
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
		//	pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(3000);
		og.Flags();
		Thread.sleep(2000);
		og.Choosefile();
		Thread.sleep(5000);
		og.Cropimage();
		Thread.sleep(3000);
		og.FlagLabel("Force Flag");
		Thread.sleep(2000);
		boolean Persistent = driver.findElement(By.xpath("//input[@type=\"checkbox\" or @title=\"Flag will always show for every visit\"]")).isEnabled();
        Assert.assertTrue(Persistent);
		og.Persistent();
		Thread.sleep(2000);
		og.AddNewFlag();
		Thread.sleep(2000);
		boolean Flag_Add = driver.findElement(By.xpath("//div[@class=\"label-container ng-scope\"]//h3[contains(text(),'Force Flag')]")).isDisplayed();
		Assert.assertTrue(Flag_Add);
		Thread.sleep(2000);
		boolean Flag_Delete =driver.findElement(By.xpath("//form[@name=\"$ctrl.imageForm\"]//h3[contains(text(),'Force Flag')]//following::div[@class=\"add-flag-button-container ng-scope\"]//button[contains(text(),'Delete')]")).isDisplayed();
		Assert.assertTrue(Flag_Delete);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"$ctrl.imageForm\"]//h3[contains(text(),'Force Flag')]//following::div[@class=\"add-flag-button-container ng-scope\"]//button[contains(text(),'Delete')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		try
		{
		boolean Delete_flag = driver.findElement(By.xpath("//h3[contains(text(),'Force Flag')]")).isDisplayed();
		Assert.assertFalse(Delete_flag);
		}
		catch(Exception e)
		{
			System.out.println("Flag is delete--Testcase Passed");
		}
		
		
	}
}
