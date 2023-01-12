package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Kiosk;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_2 extends BaseClass

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
		r.Registration();
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
		k.Kiosk_Skip();
		Thread.sleep(1000);
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
		k.CHECK_IN();
		Thread.sleep(10000);
		//driver.get("https://access-staging-a.jellyfishhealth.com");
		driver.get(baseURL);
		Thread.sleep(10000);
		//User Check Successful login on valid email and password
        k.Login_email("user_test@mailinator.com");
		Thread.sleep(10000);
		k.Login_password("Imenso@test123");
		Thread.sleep(10000);
		k.Login_submit();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // r.clickRegistrationPage();
	   //Thread.sleep(5000);
        WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(10000);
		w.Searchworklist();
		w.Searchl("jain");
		w.Searchf("Awdesh");
		//List<WebElement>list= driver.findElement(By.xpath("/html/body/div[1]/div/div/search-modal/div[2]/div[2]/table/tbody"));
		//System.out.println(list.size());
		
		//for(int i=0;i<list.size();i++)
		//{
		//	String listitem=list.get(i).getText();
		//if(listitem.matches("jain , Awdesh"));
		//{
		//	list.get(i).click();
		//	break;
		//}
		//}
		Thread.sleep(10000);
		
		


	}

}
