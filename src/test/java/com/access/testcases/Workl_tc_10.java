package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Kiosk;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

public class Workl_tc_10 extends BaseClass

{
	@Test
	public void WorkListPage() throws Exception
	{
		/*loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(5000);*/
		Kiosk k = new Kiosk(driver);
		driver.get(baseURL);
		Thread.sleep(10000);
		//User Check Successful login on valid email and password
		k.Login_email("imesnojay@imenso.com");
		Thread.sleep(10000);
		k.Login_password("Millennia1!");
		Thread.sleep(10000);
		k.Login_submit();
		Thread.sleep(20000);
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
		Thread.sleep(15000);
		List<WebElement>Sendto = driver.findElements(By.xpath("//button[@id=\"send-to-button\"]"));
		System.out.println(Sendto.size());
		Thread.sleep(5000);
		Sendto.get(0).click();
		Thread.sleep(10000);
		List<WebElement>Discharge =driver.findElements(By.xpath("//a[contains(text(),'Discharge')]"));
		System.out.println(Discharge.size());
		Thread.sleep(5000);
		Discharge.get(0).click();
		Thread.sleep(10000);
		w.DischargeViwe();
		Thread.sleep(10000);
		List<WebElement>Discharge_patient = driver.findElements(By.xpath("//table[@class=\"table table-striped table-shadow ng-scope\"]"));
		System.out.println(Discharge_patient.size());
		Thread.sleep(5000);
		for(WebElement ele:Discharge_patient )
		{
			String value = ele.getText();
			System.out.println(value);
		}
	}
}