package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.access.pageobject.WorkListPage;
import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Workl_tc_8 extends BaseClass
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
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(2000);
		w.WorklistSendto();
		Thread.sleep(10000);
		w.Discharge2();
		Thread.sleep(3000);
		w.DischargeViwe();
		Thread.sleep(3000);
		List<WebElement>Discharge_patient = driver.findElements(By.xpath("//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[4]/table"));
		for(WebElement ele:Discharge_patient )
		{
			String value = ele.getText();
			System.out.println(value);
		}
		w.SendtoBack();
		w.SendBackNew();
		Thread.sleep(3000);
		w.ReturnActivePatient();
		Thread.sleep(20000);
		List<WebElement>WorkList_print = driver.findElements(By.xpath("//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[2]/table"));
		for(WebElement ele:WorkList_print)
		{
			String value = ele.getText();
			System.out.println(value);
		}
	}
}