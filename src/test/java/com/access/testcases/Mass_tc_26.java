package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.MassMessaging;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.UserTestPage;
import com.access.pageobject.loginpage;

public class Mass_tc_26 extends BaseClass

{
	@Test
	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Provider pd = new Provider(driver);
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(3000);
		r.Attributes();
		Thread.sleep(15000);
		List<WebElement>Free_text = driver.findElements(By.id("editButton"));
		System.out.println(Free_text.size());
		Free_text.get(50).click();
		Thread.sleep(5000);
		r.Attributes_Value("true");
		r.Attribute_Save();
		Thread.sleep(2000);
		pd.UserAdmin();
		Thread.sleep(1000);
		r.Returnto_Access();
		Thread.sleep(1000);
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Yadav");
		//User Enter FirstName
		addp.fname("Umesh");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("9878900912");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("sathe@mailinator.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Thoms();
		Thread.sleep(1000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Comment("Routine checkup");
		addp.sendEmailMessages();
		addp.sendSmsMessages();
		addp.Clip_LinkConnectAccount();
		addp.Clip_Linkpatient();
		Thread.sleep(2000);
		addp.Clip_LinkSelfoption();
		Thread.sleep(1000);
		addp.Clip_Addpatient();
		Thread.sleep(1000);
		addp.Clip_Checkin();
		Thread.sleep(1000);
		addp.Alert_ok();
		Thread.sleep(10000);
		UserTestPage u =new  UserTestPage(driver);
		u.linkUserTest();
		MassMessaging m = new MassMessaging(driver);
		m.MassMessaging();
	    Thread.sleep(20000);
		WebElement Select =driver.findElement(By.xpath("//*[@id=\"messages\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", Select);
		m.Select_Message();
		m.Free_Text();
		m.Variable_Visit_Code();
		m.Edit_Freetext_Message("  Mr. Umesh your Visit Code is 03 is");
		WebElement Send_Message_Patient =driver.findElement(By.cssSelector("#massMessaging > main > div:nth-child(1) > mass-messaging > div > div > div.sidebar > div:nth-child(3) > div:nth-child(5) > div.col-sm-6.text-right > button"));
		click(driver,Send_Message_Patient ,30);
		Thread.sleep(10000);
		m.Send_Message_Modal_Print();
		
	}
	public static void click(WebDriver driver,WebElement element ,int timeout)
	{
		new WebDriverWait(driver , timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
