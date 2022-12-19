package com.access.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.*;


public class Workl_tc_2  extends BaseClass
{

	@Test
	public void WorkListPage() throws Exception
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
			Thread.sleep(5000);
			System.out.println("USER LOCATION IS PRESENT");
	    	}
	    	catch(Exception e) 
	    	{
	    		System.out.println("USER LOCATION IS Not PRESENT");
	    		
	    	}
	    	//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(10000);
		w.SortBy();
		Thread.sleep(10000);
		w.SortBy_Code();
		Thread.sleep(10000);
		
		
		//1
		//boolean SortBy_List_Default = driver.findElement(By.xpath("/html/body/main/div[1]/worklist/div/div[1]/div/div[2]/div/ul")).isDisplayed();
		//Assert.assertTrue(SortBy_List_Default, "SORT IS NOT DISPLAYED");
		//Thread.sleep(10000);
		
	//	Thread.sleep(1000);
		//2
		//WebElement SortBy_List_Code = driver.findElement(By.xpath("//a[contains(text(),'Code')]"));
		////String Code_Expected="Code";
		//Assert.assertEquals(SortBy_List_Code.isDisplayed(), Code_Expected);
		//System.out.println("Code is Displayed");
	   // Thread.sleep(1000);
	    //3
		//WebElement SortBy_List_Name = driver.findElement(By.xpath("//a[contains(text(),'Name')]"));
		//String Name_Expected="Name";
		//Assert.assertEquals(SortBy_List_Name.isDisplayed(), Name_Expected);
		//System.out.println("Name is Displayed");
		//Thread.sleep(1000);
		//4
		//boolean SortBy_List_DOB = driver.findElement(By.xpath("//a[contains(text(),'DOB')]")).isDisplayed();
		///Assert.assertTrue(SortBy_List_DOB, "DOB IS NOT DISPLAYED");
		//Thread.sleep(1000);
		//5
		//boolean SortBy_List_Appt_Time = driver.findElement(By.xpath("//a[contains(text(),'Appt Time')]")).isDisplayed();
		//Assert.assertTrue(SortBy_List_Appt_Time, "Appt Time IS NOT DISPLAYED");
		//Thread.sleep(1000);
		//6
		//boolean SortBy_List_CheckedIn = driver.findElement(By.xpath("//a[contains(text(),'Checked In')]")).isDisplayed();
		//Assert.assertTrue(SortBy_List_CheckedIn, "Checked In IS NOT DISPLAYED");
	   // Thread.sleep(1000);
	    //7
		//boolean SortBy_List_Location_Time = driver.findElement(By.xpath("//a[contains(text(),'Location Time')]")).isDisplayed();
		//Assert.assertTrue(SortBy_List_Location_Time, "Location Time IS NOT DISPLAYED");
		//Thread.sleep(1000);
		//8
		//boolean SortBy_List_Location = driver.findElement(By.xpath("//a[contains(text(),'Location')]")).isDisplayed();
		//Assert.assertTrue(SortBy_List_Location, "Location IS NOT DISPLAYED");
		//9
	   // boolean SortBy_List_ApptLocation = driver.findElement(By.xpath("//a[contains(text(),'Appt Location')]")).isDisplayed();
		//Assert.assertTrue(SortBy_List_ApptLocation, "Appt Location IS NOT DISPLAYED");
	   // Thread.sleep(1000);
	   //10
	   //boolean SortBy_List_Seeing = driver.findElement(By.xpath("//li//a[contains(text(),'Seeing')]]")).isDisplayed();
	  // Assert.assertTrue(SortBy_List_Seeing, "Seeing  IS NOT DISPLAYED");
	  // Thread.sleep(1000);
	   //11
	  // boolean SortBy_List_User = driver.findElement(By.xpath("//li//a[contains(text(),'User')]")).isDisplayed();
	  // Assert.assertTrue(SortBy_List_User, "User IS NOT DISPLAYED");
	  // Thread.sleep(1000);
	   w.OneName();
	   Thread.sleep(1000);
	   
	}
}