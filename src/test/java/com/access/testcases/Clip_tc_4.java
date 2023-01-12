package com.access.testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;
@Test
public class Clip_tc_4 extends BaseClass
{
	public void Clipboard() throws InterruptedException, IOException
	{	
		//Clipboard addp = PageFactory.initElements(driver, Clipboard.class);

		driver.get(baseURL);
		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
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
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		addp.lname("Robin");
		addp.fname("John");
		Thread.sleep(5000);
		addp.Undocheckinnew();
		Thread.sleep(5000);
		addp.UCheckIn();
		Thread.sleep(10000);
		r.Registration();
		Thread.sleep(20000);
		r.search("Robin", "John");
		Thread.sleep(5000);
		List<WebElement>Search = driver.findElements(By.xpath("//table[@class=\"table table-striped\"]//tbody"));
		System.out.println(Search.size());
		Search.get(0);
		Thread.sleep(5000);
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(10000);
		w.Searchl("Robin");
		w.Searchf("John");
		Thread.sleep(5000);
		List<WebElement>W_Search = driver.findElements(By.xpath("//table[@class=\\\"table table-striped\\\"]//tbody"));
		System.out.println(W_Search.size());
		W_Search.get(0);
		


	}
}