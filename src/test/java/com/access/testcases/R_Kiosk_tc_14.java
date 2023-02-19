package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Kiosk;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_14 extends BaseClass

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
		Thread.sleep(10000);
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);  WebElement Search_Flow=driver.findElement(By.xpath("//input[@id=\"search-appointment\"]"));
		if(!Search_Flow.isSelected())
		{
			Search_Flow.click();
		}
		else
		{

		}
		Thread.sleep(3000);
		WebElement Search_skip=driver.findElement(By.xpath("//input[@id=\"skip-results\"]"));
		if(Search_skip.isSelected())
		{
			Search_skip.click();
		}
		else
		{

		}
		Thread.sleep(3000);
		WebElement Add_new_Appointment=driver.findElement(By.xpath("//input[@id=\"enable-add-new-patient\"]"));
		if(!Add_new_Appointment.isSelected())
		{
			Add_new_Appointment.click();
		}
		else
		{
			
		}
		k.Kiosk_Savebutton();
		Thread.sleep(10000);
		driver.get("https://access-stage-a.jellyfishhealth.com/#/kiosk");
		Thread.sleep(10000);
		k.Press_HereTo_Start();
		Thread.sleep(10000);
		k.FirstName("Awdesh");
		Thread.sleep(1000);
		k.LastName("Jain");
		Thread.sleep(1000);
		k.Search();
		Thread.sleep(10000);
		WebElement Search_Again = driver.findElement(By.xpath("//button[contains(text(),'Search Again')]"));
		Assert.assertEquals(true, Search_Again.isDisplayed());
		System.out.println("Search Again button Displayed");
		Thread.sleep(1000);
		WebElement New_Appointment = driver.findElement(By.xpath("//button[contains(text(),'New Appointment')]"));
		Assert.assertEquals(true, New_Appointment.isDisplayed());
		System.out.println("New Appointment button Displayed");
		Thread.sleep(10000);
		k.Search_Again();
		Thread.sleep(10000);
		k.Search_Again_First("Awadesh");
		Thread.sleep(1000);
		k.Search_Again_Last("Jain");
		Thread.sleep(5000);
		k.Search_Again_Search2();
		Thread.sleep(10000);
		WebElement Search_Again2 = driver.findElement(By.xpath("//button[contains(text(),'Search Again')]"));
		Assert.assertEquals(true, Search_Again2.isDisplayed());
		System.out.println("Search Again button displayed");
		Thread.sleep(1000);
		WebElement New_Appointment2 = driver.findElement(By.xpath("//button[contains(text(),'New Appointment')]"));
		Assert.assertEquals(true, New_Appointment2.isDisplayed());
		System.out.println("New Appointment button displayed");
		Thread.sleep(10000);
		k.New_Appointment();
		Thread.sleep(1000);
		k.New_Appointment_CheckIN();
		Thread.sleep(10000);
		driver.get(baseURL);
		Thread.sleep(10000);
		//User Check Successful login on valid email and password
		k.Login_email("user_test@mailinator.com");
		Thread.sleep(10000);
		k.Login_password("Random@123456789");
		Thread.sleep(10000);
		k.Login_submit();
		Thread.sleep(15000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(20000);
		w.Searchworklist();
		w.Searchl("jain");
		w.Searchf("Awdesh");
		driver.findElement(By.linkText("jain Awdesh")).click();
		Thread.sleep(15000);





	}


}
