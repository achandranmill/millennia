package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_provider_tc_14 extends BaseClass

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
		boolean Add_Provider =driver.findElement(By.xpath("//button[contains(text(),'Add Provider')]")).isDisplayed();
		Assert.assertTrue(Add_Provider);
		pd.ADDProvider();
		Thread.sleep(5000);
		boolean Add_Provider_Page=driver.findElement(By.xpath("//div[@style=\"margin-top: 15px;\"]")).isDisplayed();
		Assert.assertTrue(Add_Provider_Page);
		Thread.sleep(2000);
		List<WebElement>Add_Provider_page_print =driver.findElements(By.xpath("//div[@style=\"margin-top: 15px;\"]"));
		Thread.sleep(5000);
		for(WebElement ele:Add_Provider_page_print)
		{
			String Value=ele.getText();
			System.out.println(Value);
		}
}
}