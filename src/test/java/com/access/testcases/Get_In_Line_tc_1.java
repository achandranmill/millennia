package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;
import com.access.pageobject.Get_In_Line;
@Test
public class Get_In_Line_tc_1 extends BaseClass

{
	public void Get_In_Line() throws Exception
	{
		
	loginpage lp=new loginpage(driver);
	lp.setUserName(email);
	lp.setPassword(password);
	lp.clickSubmit();
	Thread.sleep(3000);
	AdmUser ad=new AdmUser(driver);
	try
	{
	ad.userlocation();
	Thread.sleep(5000);
	ad.okbutton();
	}
	catch(Exception e)
	{
		System.out.println("User Location is not Display");
	}
	RegtPage r=new RegtPage(driver);
	r.clickRegistrationPage();
	Thread.sleep(3000);
	Provider pd = new Provider(driver);
//	pd.LocationPopup("Florida");
	Thread.sleep(10000);
	pd.UserAdmin();
	Thread.sleep(3000);
	pd.Admin();
	Thread.sleep(3000);
	Get_In_Line of = new Get_In_Line(driver);
	of.Department_Link();
	Thread.sleep(3000);
	of.Get_in_line_link();
	Thread.sleep(3000);
	of.Getin_line_link2();
	Thread.sleep(10000);
	of.Getin_Next();
	Thread.sleep(30000);
	of.Email("udit@gmail.com");
	Thread.sleep(20000);
    WebElement Register=driver.findElement(By.xpath("//label[@for=\"register-acc\"]"));
	Assert.assertEquals(true, Register.isDisplayed());
	System.out.println("Register is Displayed- ASSERT PASS");
	of.Register();
	
	

}
}