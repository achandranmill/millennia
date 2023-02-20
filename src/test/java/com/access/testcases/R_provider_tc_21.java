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
public class R_provider_tc_21 extends BaseClass

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
		try
		{
		driver.findElement(By.xpath("//button[@ng-show=\"closeable\"  or @ng-click=\"close({$event: $event})\"]")).click();
		}
		catch(Exception e)
		{
			
		}
		Thread.sleep(2000);
		WebElement Unpublish=driver.findElement(By.xpath("//input[@type=\"checkbox\"  or  @ng-click=\"$ctrl.filterUnpublishedProviders()\"]"));
		if(!Unpublish.isSelected())
		{
			Unpublish.click();
		}
		else
		{

		}
		Thread.sleep(2000);
		pd.Find_Provider("Dr.Ricardo");
		Thread.sleep(2000);
		pd.Search_Provider_btn();
		driver.findElement(By.xpath("//tr[@ng-repeat=\"provider in $ctrl.paginatedProviders\"]//td[contains(text(),'Dr.Ricardo Aaron')]//following::td//button[@class=\"btn btn-link pull-right\"]")).click();
        Thread.sleep(10000);
        pd.ProviderSearch();
        Thread.sleep(2000);
        pd.Published();
        Thread.sleep(2000);
        pd.Provider_Save();
        Thread.sleep(10000);
        boolean Provider_Update=driver.findElement(By.xpath("//span[contains(text(),'Provider: aaron@mailinator.com has been updated.')]")).isDisplayed();
        Assert.assertTrue(Provider_Update);
        Thread.sleep(3000);
        List<WebElement>Details_tab=driver.findElements(By.xpath("//div[@class=\"row\"  or @style=\"margin-top: 15px;\"]"));
        for(WebElement ele:Details_tab)
        {
        	String Value=ele.getText();
        	System.out.println(Value);
        }
        
	}
}