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

public class Workl_tc_12 extends BaseClass

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
		//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		Thread.sleep(15000);
		List<WebElement>WorkList_print = driver.findElements(By.xpath("//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[2]/table"));
		for(WebElement ele:WorkList_print)
		{
			String value = ele.getText();
			System.out.println(value);
		}
		w.Configure();
		w.EditListColumns();
		Thread.sleep(3000);
		WebElement Forms_Completed = driver.findElement(By.xpath("//*[@id=\"patient-lists-component\"]/div/div/div[1]/div[2]/table/tbody/tr[27]/td[2]/input"));
		if(!Forms_Completed.isSelected())
		{
			Forms_Completed.click();
		}
		else
		{
			
		}
		Thread.sleep(3000);
		w.SaveChanges();
		Thread.sleep(15000);
		List<WebElement>Goto_patient = driver.findElements(By.xpath("//button[contains(text(),'Go to Patient Details')]"));
		System.out.println(Goto_patient.size());
		Goto_patient.get(1);
		Thread.sleep(5000);
		w.Forms();
		Thread.sleep(5000);
		try
		{
			r.RCB_Report();
		}
		catch(Exception e)
		{
			System.out.println("Rcb Form");
		}
		r.RCB_FirstName("Umesh");
		r.RCB_LastName("chandke");
		r.RCB_Dob("09081994");
		Thread.sleep(3000);
		r.RCB_Ssn("777777777");
		Thread.sleep(3000);
		r.RCB_PatientStreetAddress("india");
		r.RCB_ZipCode("451010");
		r.RCB_Signature();
		r.RCB_Signature2();
		Thread.sleep(3000);
		r.RCB_save();
		Thread.sleep(15000);
		List<WebElement>WorkList_print1 = driver.findElements(By.xpath("//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[2]/table"));
		for(WebElement ele:WorkList_print1)
		{
			String value = ele.getText();
			System.out.println(value);
		}
	}
}