package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.AdmUser;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

public class Workl_tc_3  extends BaseClass
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
		Thread.sleep(20000);
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		WebElement Remove_Waiting = driver.findElement(By.xpath("//*[@id=\"worklist\"]/div[1]/div/div/location-filter/div[2]/div/div[1]/div[6]/label/input"));
		if(Remove_Waiting.isSelected())
		{
			Remove_Waiting.click();
		}
		else
		{

		}
		w.BtnClose();
		Thread.sleep(10000);
		try
		{
			boolean Waiting = driver.findElement(By.xpath("//span[contains(text(),'Waiting')]")).isDisplayed();

			System.out.println("Waiting patient displayed");

		}
		catch(Exception e)
		{
			System.out.println("Waiting patient not displayed");
		}
		Thread.sleep(10000);
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		Thread.sleep(3000);
		WebElement Add_Waiting = driver.findElement(By.xpath("//*[@id=\"worklist\"]/div[1]/div/div/location-filter/div[2]/div/div[1]/div[6]/label/input"));
		if(!Add_Waiting.isSelected())
		{
			Add_Waiting.click();
		}
		else
		{

		}
		Thread.sleep(10000);
		try
		{
			w.Waiting2_Close_Btn();
			System.out.println("Close button  clicked");
		}
		catch(Exception e)
		{
			System.out.println("Close button already clicked");
		}
		Thread.sleep(20000);
		boolean Waiting1 = driver.findElement(By.xpath("//span[contains(text(),'Waiting')]")).isDisplayed();
		Assert.assertTrue(Waiting1, "Waiting patient not displayed");
       





	}
}
