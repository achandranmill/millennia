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
public class R_Kiosk_tc_8 extends BaseClass

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
		//		pd.LocationPopup("Florida");
		Thread.sleep(10000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Kiosk k = new Kiosk(driver);
		k.Department_Link();
		Thread.sleep(1000);
		k.Kiosk();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		WebElement Add_New_Appoint=driver.findElement(By.xpath("//input[@id='enable-add-new-patient']"));
		if(!Add_New_Appoint.isSelected())
		{
			Add_New_Appoint.click();
		}
		else
		{

		}
		Thread.sleep(3000);
		WebElement Search_checkbox=driver.findElement(By.xpath("//input[@id='search-appointment']"));
		if(!Search_checkbox.isSelected())
		{
			Search_checkbox.click();
		}
		else
		{

		}
		Thread.sleep(5000);
		WebElement Search_Skip=driver.findElement(By.xpath("//input[@id='skip-results']"));
		if(!Search_Skip.isSelected())
		{
			Search_Skip.click();
		}
		Thread.sleep(5000);
		k.Kiosk_configuration();
		Thread.sleep(3000);
		k.Kiosk_WelcomeScreenMessage("Welcome to Imenso");
		Thread.sleep(3000);
		k.Kiosk_SearchButtonText("Press Here To Start");
		Thread.sleep(3000);
		WebElement Allow_New_Appointment=driver.findElement(By.xpath("//input[@id='allow-appointment']"));
		if(Allow_New_Appointment.isSelected())
		{
			Allow_New_Appointment.click();
		}
		else
		{

		}
		Thread.sleep(3000);
		k.Kiosk_Donebutton();
		Thread.sleep(10000);
		k.Kiosk_Savebutton();
		driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(30000);
		boolean Press_Here_to_Start=driver.findElement(By.xpath("//button[contains(text(),'Press Here To Start')]")).isDisplayed();
		Assert.assertTrue(Press_Here_to_Start);
		Thread.sleep(2000);
		try
		{
		boolean New_Appointment=driver.findElement(By.xpath("//button[contains(text(),'New Appointment')]")).isDisplayed();
		Assert.assertFalse(New_Appointment);
		}
		catch(Exception e)
		{
			
		}

	}
}