package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class R_provider_tc_19 extends BaseClass

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
		WebElement Unpublish=driver.findElement(By.xpath("//input[@type=\"checkbox\"  or  @ng-click=\"$ctrl.filterUnpublishedProviders()\"]"));
		if(!Unpublish.isSelected())
		{
			Unpublish.click();
		}
		else
		{

		}
		Thread.sleep(2000);
		pd.Find_Provider("Dr.Mackenzie");
		Thread.sleep(2000);
		pd.Search_Provider_btn();
		driver.findElement(By.xpath("//tr[@ng-repeat=\"provider in $ctrl.paginatedProviders\"]//td[contains(text(),'Dr.Mackenzie Mackenzie')]//following::td//button[@class=\"btn btn-link pull-right\"]")).click();
        Thread.sleep(10000);
        pd.Schedule();
        Thread.sleep(3000);
        pd.AddSchedule();
        Thread.sleep(5000);
        pd.EditScheduleTitle("New Schedule");
        Thread.sleep(2000);
        pd.Schedule_Department();
        Thread.sleep(3000);
        pd.Schedule_Location();
        Thread.sleep(3000);
        pd.Schedule_Appointment_Type();
        Thread.sleep(2000);
        pd.Add_All_Appointment();
        Thread.sleep(2000);
        pd.Monday();
        Thread.sleep(2000);
        pd.MondayFrom("09");
        Thread.sleep(2000);
        pd.MondayFrom2("30");
        Thread.sleep(2000);
        pd.MondayTo("09");
        Thread.sleep(2000);
        pd.MondayTo2("30");
        Thread.sleep(2000);
        pd.MondayCapacity("10");
        Thread.sleep(2000);
        pd.Schedule_save();
        Thread.sleep(5000);
        WebElement Schedule_save_Message=driver.findElement(By.xpath(""));
        
	}
	
}
