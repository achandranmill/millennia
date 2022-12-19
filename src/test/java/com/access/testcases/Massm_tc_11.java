package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_11 extends BaseClass

{
	
	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		Appointments ab = new Appointments(driver);
		ab.linkAppointment();
		ab.AppointDATE();
		Thread.sleep(10000);
		ab.AppointDATE1("2022-10-01");
		Thread.sleep(10000);
		ab.AppointDATE2("2022-10-31");
		Thread.sleep(1000);
		ab.AppointDATEAPPLY();
		Thread.sleep(10000);
		ab.Configurelist();
		Thread.sleep(10000);
		ab.EditStatusFilter();
		Thread.sleep(10000);
		ab.Status_SelectAll();
		ab.StatusUnconfirmed();
		Thread.sleep(5000);
		ab.StatusSave();
		Thread.sleep(10000);
		ab.ThreeDot();
		Thread.sleep(10000);
		ab.ThreDotSetConfirmed();
		WebElement confirm = driver.findElement(By.xpath("//span[contains(text(),'CONFIRMED')]"));
		Assert.assertEquals(true, confirm.isDisplayed());
		System.out.println("Confirm status is Displyaed - Assert  Passed");
		
		

}
}