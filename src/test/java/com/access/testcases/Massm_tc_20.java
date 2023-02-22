package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;

public class Massm_tc_20 extends BaseClass

{
	
	@Test
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
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(3000);
		r.Attributes();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[contains(text(),'ORGANIZATION_UNIT_ENABLE_SMS_FREE_TEXT')]/following-sibling::td//button")).click();
		Thread.sleep(5000);
		r.Attributes_Value("true");
		r.Attribute_Save();
		Thread.sleep(2000);
		pd.UserAdmin();
		Thread.sleep(1000);
		r.Returnto_Access();
		Thread.sleep(1000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(10000);
		WebElement Select =driver.findElement(By.xpath("//button[@id='messages']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", Select);
		m.Select_Message();
		m.Free_Text();
		m.Variable_FirstName();
		m.Edit_Freetext_Message(" Good afternoon, Mr. Sathe How are you?");
		m.Send_Message_Patient();
		Thread.sleep(10000);
		m.Message_History_print();
		
	}
}
