package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_9  extends BaseClass

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
		 System.out.println("User location is present");
	    }
	    catch(Exception e) 
	    {
	    System.out.println("User location is not present");
	    		
	    }
	   //-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(3000);
		ap.Send_Message_tab();
		Thread.sleep(10000);
		MassMessaging m = new MassMessaging(driver);
		WebElement MessageDis = driver.findElement(By.xpath("//button[contains(text(),'Message History')]"));
		Assert.assertEquals(true, MessageDis.isDisplayed());
		System.out.println("Message History button displayed");
		m.MessageHistory();
		Thread.sleep(10000);
		m.Message_History_print();
	
}
}