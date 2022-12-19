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
public class Get_in_Line_tc_9 extends BaseClass

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
	of.Details();
	Thread.sleep(3000);
	of.Business_Hours_Monday("11:00");
	Thread.sleep(1000);
	of.Business_Hours_MondayAMPM();
	Thread.sleep(1000);
	of.Business_Hours_Monday2("08:00");
	Thread.sleep(1000);
	of.Business_Hours_Monday2AMPM();
	Thread.sleep(1000);
	of.Business_Hours_Tuesday("11:00");
	Thread.sleep(1000);
	of.Business_Hours_TuesdayAMPM();
	Thread.sleep(1000);
	of.Business_Hours_Tuesday2("08:00");
	Thread.sleep(1000);
	of.Business_Hours_TuesdayPMAM();
	Thread.sleep(1000);
	of.Department_Save();
	Thread.sleep(10000);
	of.Department_Link();
	Thread.sleep(10000);
	of.Get_in_line_link();
	Thread.sleep(1000);
	of.Getin_line_link2();
	Thread.sleep(10000);
	of.Getin_Next();
	Thread.sleep(10000);
	WebElement Business = driver.findElement(By.xpath("//h4[contains(text(),'Business Hours')]"));
	Assert.assertEquals(true, Business.isDisplayed());
	System.out.println("Business Hours is Displayed- Assert PASS");
	Thread.sleep(1000);
	WebElement Monday = driver.findElement(By.xpath("//li//strong[contains(text(),'Monday')]"));
	Assert.assertEquals(true, Monday.isDisplayed());
	System.out.println("Monday is Displayed- Assert PASS");
	Thread.sleep(1000);
	WebElement Monday_Time = driver.findElement(By.xpath("/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[1]/div/div[2]/div[2]/hours-schedule/div/div[2]/ul/li[2]/hour-range/span/span"));
	Assert.assertEquals(true, Monday_Time.isDisplayed());
	System.out.println("Monday_Time is Displayed - Assert PASS");
	Thread.sleep(1000);
	WebElement Tuesday = driver.findElement(By.xpath("//li//strong[contains(text(),'Tuesday')]"));
	Assert.assertEquals(true, Tuesday.isDisplayed());
	System.out.println("Tuesday is Displayes-Assert PASS");
	WebElement Tuesday_time = driver.findElement(By.xpath("/html/body/main/get-in-line/section/div[2]/div[2]/div/div/get-in-line-form/div[1]/div/div[2]/div[2]/hours-schedule/div/div[2]/ul/li[3]/hour-range/span/span"));
	Assert.assertEquals(true, Tuesday_time.isDisplayed());
	System.out.println("Tuesday is Displayed - Assert PASS");
	WebElement Wednesday = driver.findElement(By.xpath("//li//strong[contains(text(),'Wednesday')]"));
	Assert.assertEquals(false, Wednesday.isDisplayed());
	System.out.println("Wednesday is Not Displayed- Assert PASS");
	Thread.sleep(10000);
	
	
	
	
	
	
	
	
	
	
}
}