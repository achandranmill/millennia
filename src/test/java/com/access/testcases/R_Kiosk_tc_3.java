package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Kiosk;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_3 extends BaseClass

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
		if(!Search_skip.isSelected())
		{
			Search_skip.click();
		}
		else
		{

		}
		Thread.sleep(3000);
		k.Kiosk_Savebutton();
		Thread.sleep(5000);
		driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(3000);
		k.Press_HereTo_Start();
		Thread.sleep(3000);
		k.FirstName("Awdesh");
	    k.LastName("jain");
	    k.Search();
	    Thread.sleep(3000);
	    WebElement Patien_Found=driver.findElement(By.xpath("//h1[contains(text(),'jain, Awdesh')]"));
	    String Excepted="jain, Awdesh";
	    Assert.assertEquals(Patien_Found.getText(), Excepted);
	    k.CHECK_IN();
	    
	}
}
