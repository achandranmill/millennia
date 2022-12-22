package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.Get_In_Line;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Get_in_Line_tc_5 extends BaseClass

{

	public void Get_In_Line() throws Exception
	{
		
	loginpage lp=new loginpage(driver);
	lp.setUserName(email);
	lp.setPassword(password);
	lp.clickSubmit();
	Thread.sleep(3000);
	//AdmUser ad=new AdmUser(driver);
	//ad.userlocation();
	//Thread.sleep(5000);
	//ad.okbutton();
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
	//of.Getin_Next();
	Thread.sleep(20000);
	of.Email("");
	WebElement guest = driver.findElement(By.id("register-guest"));
	Assert.assertEquals(true, guest.isDisplayed());
	System.out.println("GUEST Radio button is Displayed-Assert PASS");
	WebElement guest_text = driver.findElement(By.xpath(" //label[@for=\"register-guest\"]"));
	String Expected = "Continue as a guest";
	Assert.assertEquals(guest_text.getText(), Expected);
	of.Guest();
	
}
}