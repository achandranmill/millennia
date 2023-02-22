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
public class R_Kiosk_tc_11 extends BaseClass

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
		k.Kiosk();
		Thread.sleep(5000);
	    WebElement Search_Flow=driver.findElement(By.xpath("//input[@id=\"search-appointment\"]"));
		if(!Search_Flow.isSelected())
		{
			Search_Flow.click();
		}
		else
		{

		}
		Thread.sleep(3000);
		WebElement Search_skip=driver.findElement(By.xpath("//input[@id=\"skip-results\"]"));
		if(Search_skip.isSelected())
		{
			Search_skip.click();
		}
		else
		{

		}
		Thread.sleep(3000);
		k.Kiosk_Savebutton();
		Thread.sleep(10000);
		driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(10000);
		k.Press_HereTo_Start();
		Thread.sleep(10000);
		k.FirstName("Sam");
		Thread.sleep(1000);
		k.LastName("Burns");
		Thread.sleep(1000);
		k.Search();
		Thread.sleep(10000);
		WebElement Search_Again = driver.findElement(By.xpath("//button[contains(text(),'Search Again')]"));
		Assert.assertEquals(true, Search_Again.isDisplayed());
		System.out.println("Search Again button displayed ");
		Thread.sleep(1000);
		WebElement New_Appointment = driver.findElement(By.xpath("//button[contains(text(),'New Appointment')]"));
		Assert.assertEquals(true, New_Appointment.isDisplayed());
		System.out.println("New Appointment button displayed");
		Thread.sleep(10000);


	}
}