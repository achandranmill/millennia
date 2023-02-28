package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		Thread.sleep(1000);
		w.EditListColumns();
		Thread.sleep(10000);
		WebElement Status =driver.findElement(By.cssSelector("#patient-lists-component > div > div > div.tab-pane.ng-scope.active > div:nth-child(2) > table > tbody > tr:nth-child(17) > td:nth-child(2) > input"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", Status);
		Thread.sleep(2000);
	    if(!Status.isSelected())
		{
			Status.click();
		}
		else
		{
			
		}
		Thread.sleep(2000);
		w.SaveChanges();
		Thread.sleep(5000);
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		WebElement Remove_Waiting = driver.findElement(By.xpath("//*[@id='worklist']/div[1]/div/div/location-filter/div[2]/div/div[1]/div[6]/label/input"));
		if(Remove_Waiting.isSelected())
		{
			Remove_Waiting.click();
		}
		else
		{

		}
		w.BtnClose();
		
		//driver.navigate().refresh();
		Thread.sleep(50000);
		boolean Waiting = driver.findElement(By.xpath("//span[contains(text(),'Waiting')]")).isDisplayed();
		Assert.assertFalse(Waiting, "Waiting patient displayed -TestCase Failed");
	/*	try
		{
			boolean Waiting = driver.findElement(By.xpath("//span[contains(text(),'Waiting')]")).isDisplayed();
			Assert.assertFalse(Waiting, "Waiting patient displayed -TestCase Failed");
        }
		catch(Exception e)
		{
			System.out.println("Waiting patient not displayed");
		}*/
		Thread.sleep(10000);
		w.Configure();
		Thread.sleep(3000);
		w.Department();
		Thread.sleep(3000);
		WebElement Add_Waiting = driver.findElement(By.xpath("//*[@id='worklist']/div[1]/div/div/location-filter/div[2]/div/div[1]/div[6]/label/input"));
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
		Thread.sleep(100000);
		WebElement Actual = driver.findElement(By.xpath("//span[contains(text(),'Waiting')]"));
		String Expected = "WAITING";
		Thread.sleep(3000);
		Assert.assertEquals(Actual.getText(), Expected);
       





	}
}
