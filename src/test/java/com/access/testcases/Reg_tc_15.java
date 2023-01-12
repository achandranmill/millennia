package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Reg_tc_15 extends BaseClass

{

	//---------------Free Text ----------Enable  the free text

	public void RegtPage() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		List<WebElement>Free_text = driver.findElements(By.id("editButton"));
		System.out.println(Free_text.size());
		Free_text.get(50).click();
		Thread.sleep(5000);
		r.Attributes_Value("true");
		r.Attribute_Save();
		Thread.sleep(2000);
		pd.UserAdmin();
		Thread.sleep(1000);
		r.Returnto_Access();
		Thread.sleep(1000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		r.Registration();
		Thread.sleep(10000);
		WebElement SMS = driver.findElement(By.xpath("//input[@ng-click=\"$ctrl.ToggleSMS()\"]"));
		if(SMS.isSelected())
		{
			System.out.println("SMS checkbox is selected");
		}
		else
		{
			SMS.click();
			System.out.println("SMS checkbox not selected");
		}
		r.smsMessage();
		r.Select_Message();
		Thread.sleep(3000);
		r.Select_Message_option_print();
		WebElement Free_text_Enabled = driver.findElement(By.xpath("/html/body/div[1]/div/div/send-s-m-s-modal/div[2]/form/div[1]/div[2]/ul[2]/li[2]"));
		Thread.sleep(5000);
		Free_text_Enabled.click();
		boolean SMS_Message = driver.findElement(By.id("smsMessageInput")).isEnabled();
		Assert.assertTrue(SMS_Message);
		System.out.println("Free text Attribute is Enabled");
		Thread.sleep(3000);
		r.SMSMessageInput("Hi");

	}
}
