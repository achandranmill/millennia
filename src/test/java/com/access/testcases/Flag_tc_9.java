package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Flag_tc_9 extends BaseClass

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
		og.FlagLabel("Diocese of Exeter");
		Thread.sleep(2000);
		boolean Persistent = driver.findElement(By.xpath("//input[@type=\"checkbox\" or @title=\"Flag will always show for every visit\"]")).isEnabled();
        Assert.assertTrue(Persistent);
		og.Persistent();
		Thread.sleep(2000);
		og.AddNewFlag();
		Thread.sleep(2000);
		boolean Flag_Add = driver.findElement(By.xpath("//div[@class=\"label-container ng-scope\"]//h3[contains(text(),'Diocese of Exeter')]")).isDisplayed();
		Assert.assertTrue(Flag_Add);
		Thread.sleep(2000);
		boolean Flag_Edit =driver.findElement(By.xpath("//form[@name=\"$ctrl.imageForm\"]//h3[contains(text(),'Diocese of Exeter')]//following::div[@class=\"add-flag-button-container ng-scope\"]//button[@class=\"btn btn-default btn-block\"]")).isEnabled();
		Assert.assertTrue(Flag_Edit);
		Thread.sleep(2000);
		WebElement Edit_button=driver.findElement(By.xpath("//form[@name=\"$ctrl.imageForm\"]//h3[contains(text(),'Diocese of Exeter')]//following::div[@class=\"add-flag-button-container ng-scope\"]//button[@class=\"btn btn-default btn-block\"]"));
		Edit_button.click();
		WebElement Edit_Name = driver.findElement(By.id("$ctrl.name"));
		Edit_Name.click();
		Edit_Name.clear();
		Edit_Name.sendKeys("Diocese of Derby");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@ng-model=\"$ctrl.flag.flag.persist\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(5000);
		WebElement Edit_flag_Name = driver.findElement(By.xpath("//h3[contains(text(),'Diocese of Derby')]"));
		String Expected ="Diocese of Derby";
		Assert.assertEquals(Edit_flag_Name.getText(), Expected);
		
		
		
		
	}
}
