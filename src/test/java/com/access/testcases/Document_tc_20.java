package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Get_In_Line;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Document_tc_20 extends BaseClass

{

	public void Document() throws Exception
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
		//	pd.LocationPopup("Florida");
		Thread.sleep(10000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Get_In_Line of = new Get_In_Line(driver);
		of.Department_Link();
		Thread.sleep(3000);
		of.Get_in_line_link();
		Thread.sleep(3000);
		of.Getin_line_link2();
		Thread.sleep(10000);
		of.Sing_in();
		Thread.sleep(1000);
		of.Sign_Email("rosan@gmail.com");
		Thread.sleep(1000);
		of.Sign_Password("R@osan123");
		Thread.sleep(1000);
		of.Sign_Submit();
		Thread.sleep(10000);
		of.My_Documents();
		Thread.sleep(10000);
		WebElement RCB = driver.findElement(By.xpath(" // strong[contains(text(),'RCB Report')]   "));
		Assert.assertEquals(true, RCB.isDisplayed());
		System.out.println("Test case Passed");


	}
}