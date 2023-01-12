package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Kiosk;
import com.access.pageobject.loginpage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
public class Workl_tc_1 extends BaseClass

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
		Thread.sleep(5000);
		WorkListPage w = new WorkListPage(driver);
		w.worklist();
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		Thread.sleep(10000);
		w.Testing1();
		Thread.sleep(1000);
		w.BtnClose();
		Thread.sleep(3000);
		w.Configure();
		Thread.sleep(5000);
		w.EditSeeing();
		Thread.sleep(10000);
		w.Provider_checkBox_1();
		Thread.sleep(10000);
		w.BtnClose2();
		Thread.sleep(10000);
		Clipboard c =new Clipboard(driver);
		c.LinkclickBoard();
		UserTestPage u =new UserTestPage(driver);
		u.linkUserTest();
		u.Logout();
		Thread.sleep(10000);
		Kiosk k = new Kiosk(driver);
		driver.get(baseURL);
		Thread.sleep(10000);
		//User Check Successful login on valid email and password
		k.Login_email("user_test@mailinator.com");
		Thread.sleep(10000);
		k.Login_password("Random@123456789");
		Thread.sleep(10000);
		k.Login_submit();
		Thread.sleep(20000);
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
		try
		{
			r.clickRegistrationPage();
			Thread.sleep(50000); 
			System.out.println("Registration page  clicked");
		}
		catch(Exception e)
		{
			System.out.println("Registration page not clicked");
		}

		w.Worklisttab2();
		Thread.sleep(10000);
		w.ConfigureList2();
		Thread.sleep(10000);
		w.Edit_Department2();
		Thread.sleep(10000);
		boolean Testing1 = driver.findElement(By.cssSelector("#worklist > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > location-filter > div.modal-body > div > div:nth-child(2) > div:nth-child(4) > label > input[type=checkbox]")).isSelected();
		Assert.assertTrue(Testing1, "  After login selected department not saved");
		Thread.sleep(5000);
		w.Edit_Department_btn();
		Thread.sleep(10000);
		w.ConfigureList2();
		Thread.sleep(10000);
		w.Edit_Seeing2();
		Thread.sleep(5000);
		boolean  Provider_checkBox_1  =  driver.findElement(By.cssSelector("#worklist > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > seeing-filter > div.modal-body > div:nth-child(4) > label > input[type=checkbox]")).isSelected();
		Assert.assertTrue(Provider_checkBox_1, " After login selected checkbox not saved)");
		Thread.sleep(3000);




	}
}