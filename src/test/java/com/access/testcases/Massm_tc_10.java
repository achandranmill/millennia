package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_10 extends BaseClass

{

	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		try
		{
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
			
		}
		catch(Exception e) 
		{
		     ad.userlocation1();

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
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(3000);
		r.Attributes();
		Thread.sleep(15000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'ORGANIZATION_UNIT_CANNED_MESSAGE_')]/following-sibling::td//button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Save Attribute')]")).click();
		Thread.sleep(3000);
		Thread.sleep(1000);
		pd.UserAdmin();
		Thread.sleep(1000);
		r.Returnto_Access();
		Thread.sleep(1000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(5000);
		WebElement Select =driver.findElement(By.xpath("//button[@id='messages']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", Select);
		m.Select_Message();
		Thread.sleep(5000);
		boolean Canned_Message=driver.findElement(By.xpath("//a[contains(text(),'Hello it is canned message')]")).isDisplayed();
		Assert.assertTrue(Canned_Message);
		Thread.sleep(3000);
		boolean Canned_Message1=driver.findElement(By.xpath("//a[contains(text(),'Hello it is canned message')]")).isEnabled();
		Assert.assertTrue(Canned_Message1);
		Thread.sleep(3000);
		m.Select_Message_option1();
		Thread.sleep(3000);
		boolean Message_Previwe=driver.findElement(By.xpath("//div[@class='col-sm-12'] //h4[contains(text(),'Message Preview')]")).isDisplayed();
		Assert.assertTrue(Message_Previwe);
		Thread.sleep(3000);
		boolean Canned_Message_displayed=driver.findElement(By.xpath("//div//div[contains(text(),'Hello it is canned message ')]")).isDisplayed();
		Assert.assertTrue(Canned_Message_displayed);
		
		

	}
}