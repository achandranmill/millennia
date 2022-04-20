package com.access.testcases;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import com.access.pageobject.Dash;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
@Test
public class Dash_tc_1 extends BaseClass
{

	public void Dash() throws InterruptedException, IOException
	{
		driver.get(baseURL);

		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Dash viewdetails  =new Dash(driver);
		viewdetails.DashClick();
		Thread.sleep(5000);
		viewdetails.checkin();
		Thread.sleep(1000);
		viewdetails.Registration();
		Thread.sleep(1000);
		viewdetails.Discharge();
		Thread.sleep(1000);
		viewdetails.ConnectCheckIn(); 
		Thread.sleep(1000);
		viewdetails.Holding(); 
		Thread.sleep(1000);
		viewdetails.Waiting();
		Thread.sleep(1000);
		viewdetails.New();
		Thread.sleep(1000);
	}
}

