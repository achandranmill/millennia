package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.access.pageobject.*;
import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Get_In_Line;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Document_tc_1 extends BaseClass

{

	public void Document() throws Exception
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
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		//-----------------REGISTRATION PAGE ------------------------------
		Thread.sleep(10000);
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Provider pd = new Provider(driver);
		//		pd.LocationPopup("Florida");
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
		Thread.sleep(20000);
		//of.Getin_Next();
		//Thread.sleep(10000);
		of.Email("ram@gmail.com");
		Thread.sleep(3000);
		of.Password("R@am1234");
		Thread.sleep(3000);
		of.Confirm_Password("R@am1234");
		Thread.sleep(3000);
		of.First_name("Ram");
		Thread.sleep(3000);
		of.Location1("Yadav");
		Thread.sleep(3000);
		of.SSN("09-07-1998");
		Thread.sleep(3000);
		of.Male();
		Thread.sleep(3000);
		of.Phone("8888888888");
		Thread.sleep(3000);
		of.Location2("newyork");
		Thread.sleep(3000);
		of.Last4ofSSNTITLE("1998");
		Thread.sleep(3000);
		of.Text_Message();
		Thread.sleep(3000);
		of.Send_Email();
		Thread.sleep(3000);
		of.Send_Voice();
		Thread.sleep(3000);
		of.Terms();
		Thread.sleep(5000);
		of.Robot();
		Thread.sleep(3000);
		of.REGISTERANDGET_LINE();
		Thread.sleep(20000);
        of.My_Documents();
		Document d  =  new Document(driver);
		d.RCB_edit();
		Thread.sleep(1000);
		d.RCB_First_Name("Ujjawal");
		d.RCB_Last_Name("yadav");
		d.RCB_DOB("01091999");
		d.RCB_SSN("123456789");
		d.RCB_PATIENT("48,Road");
		d.RCB_SIGNATURE1();
		d.RCB_Signature2();
		d.RCB_DONE();
		Thread.sleep(5000);
		WebElement complete = driver.findElement(By.xpath(" //span[contains(text(),'COMPLETE')]"));
		String ExpectedText2 = "COMPLETE";
		Assert.assertEquals(ExpectedText2, complete.getText());
		System.out.println("Test case Passed");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("//span[@class=\"label status-label ng-binding label-success\"]"));
		String back_color = e.getCssValue("background-color");
		System.out.println(back_color);
		String hex_back_color = Color.fromString(back_color).asHex();
		System.out.println(hex_back_color);
		if(hex_back_color.equals("#2ECC71"))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");


	}


}
