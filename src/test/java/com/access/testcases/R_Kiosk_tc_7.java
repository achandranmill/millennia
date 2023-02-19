package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Kiosk;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_7 extends BaseClass

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
		Thread.sleep(1000);
		WebElement Add_New_Appoint=driver.findElement(By.xpath("//input[@id=\"enable-add-new-patient\"]"));
		if(!Add_New_Appoint.isSelected())
		{
			Add_New_Appoint.click();
		}
		else
		{

		}
		//WebElement Add_page=driver.findElement(By.xpath("//a[@id='add-new-patient-add-page']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();", Add_page);
		Thread.sleep(15000);
		k.Kiosk_AddPage();
		Thread.sleep(10000);
		k.Kiosk_PageName("please Complete the Field");
		Thread.sleep(1000);
		k.Kiosk_Pagetype();
		Thread.sleep(1000);
		k.Kiosk_pagename_Addmore();
		Thread.sleep(1000);
		k.Kiosk_Pagename_FieldFirst();
		Thread.sleep(3000);
		k.Kiosk_Pagename_fieldSizeFirst();
		Thread.sleep(3000);
		k.Kiosk_Pagename_First_Title("First Name");
		Thread.sleep(3000);
		k.Kiosk_AddMore();
		Thread.sleep(3000);
		k.Kiosk_Pagename_FieldLastName();
		Thread.sleep(3000);
		k.Kiosk_Pagename_fieldSizeLN();
		Thread.sleep(3000);
		k.Kiosk_Pagename_Last_Title("Last Name");
		Thread.sleep(3000);
		k.Kiosk_AddMore();
		Thread.sleep(3000);
		k.DOB_Wizard();
		Thread.sleep(3000);
		k.Dob_fieldSizeA();
		Thread.sleep(3000);
		k.Dob_Wizard("Dob Wizard");
		Thread.sleep(3000);
		k.Kiosk_Add();
		Thread.sleep(20000);
		k.Kiosk_AddPage();
		Thread.sleep(10000);
		k.Kiosk_PagetVerification_title("please verify the below information is correct");
		Thread.sleep(1000);
		k.Kiosk_PagetVerification();
		Thread.sleep(1000);
		k.Kiosk_pagename_VerificationfirstName();
		Thread.sleep(1000);
		k.Kiosk_pagename_VerificationlastName();
		Thread.sleep(1000);
		k.Kiosk_Pagename_Add();
		Thread.sleep(10000);
		WebElement Search_checkbox=driver.findElement(By.xpath("//input[@id=\"search-appointment\"]"));
		if(!Search_checkbox.isSelected())
		{
			Search_checkbox.click();
		}
		else
		{
			
		}
		Thread.sleep(1000);
		WebElement Search_Skip=driver.findElement(By.xpath("//input[@id='skip-results']"));
		if(!Search_Skip.isSelected())
		{
			Search_Skip.click();
		}
		Thread.sleep(1000);
		k.Kiosk_Savebutton();
		Thread.sleep(10000);
        driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id=\"kiosk-new-button-right\"]")).click();
		Thread.sleep(5000);
		k.FirstName("Awdesh");
		Thread.sleep(1000);
		k.LastName("Jain");
		Thread.sleep(1000);
		List<WebElement>print=driver.findElements(By.xpath("//*[@id=\"kiosk.flow.page\"]/main"));
		for(WebElement ele:print)
		{
			String Value=ele.getText();
			System.out.println(Value);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'NEXT')]")).click();
		Thread.sleep(3000);
		List<WebElement>print2=driver.findElements(By.xpath("//*[@id=\"kiosk.flow.page\"]/main"));
		for(WebElement ele:print2)
		{
			String Value=ele.getText();
			System.out.println(Value);
		}
		
		
		
	  
		
		
		
			
		
	
}
}
