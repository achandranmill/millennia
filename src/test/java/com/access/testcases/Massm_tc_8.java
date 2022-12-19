package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;
@Test
public class Massm_tc_8   extends BaseClass

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
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
		Thread.sleep(1000);
		m.DepartmentFilter();
		Thread.sleep(1000);
		m.SelectAll();
		Thread.sleep(3000);
		m.DepartmentSave();
		Thread.sleep(1000);
		m.SeeingFilter();
		Thread.sleep(2000);
		m.SeeingSelectAll();
		Thread.sleep(3000);
		m.SeeingCancel();
		Thread.sleep(3000);
		m.StatusFilter();
		Thread.sleep(3000);
		m.StatusFilterConfirmed();
		Thread.sleep(3000);
		m.StatusFilterSave();
		Thread.sleep(3000);
		WebElement Ineligible = driver.findElement(By.xpath("//a[contains(text(),'Ineligible for message')]"));
		Assert.assertEquals(true, Ineligible.isDisplayed());
		System.out.println("Ineligible is Dispalyed - ASSERT PASSED");
		m.ineligible();
		Thread.sleep(3000);
	}
}
