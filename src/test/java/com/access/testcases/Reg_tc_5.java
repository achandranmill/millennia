package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

public class Reg_tc_5 extends BaseClass

{
	@Test
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
		System.out.println("USER LOCATION IS PRESENT");
	    }
	    catch(Exception e) 
	    {
		 System.out.println("USER LOCATION IS Not PRESENT");
		
	    }
	//-----------------REGISTRATION PAGE ------------------------------
		Thread.sleep(5000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		r.search("praveen", "rajput");
		Thread.sleep(5000);
		r.SendTo();
		Thread.sleep(3000);
		r.Dish();
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(3000);
		w.DischargeViwe();
		Thread.sleep(10000);
		List<WebElement>AllDischarge=driver.findElements(By.xpath("//div[contains(@class,'col-sm-12 table-response')]"));
		boolean dataStatus = false;
		for(int i=0;i<AllDischarge.size();i++)
		{
			WebElement Element=AllDischarge.get(i);
			String value=Element.getText();
	    if(value.contains("praveen"))
	    {
	    	dataStatus=true;
	    	break;
	    }
		}
	}
}