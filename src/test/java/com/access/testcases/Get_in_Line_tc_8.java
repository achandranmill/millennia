package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Get_In_Line;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

@Test
public class Get_in_Line_tc_8 extends BaseClass

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
	Thread.sleep(20000);
	of.Guest();
	Thread.sleep(5000);
	of.Guest_Firstname("chirag");
	Thread.sleep(6000);
	of.Guest_Lastname("gayke");
	Thread.sleep(1000);
	of.Guest_Dob("09-09-1999");
	Thread.sleep(1000);
	of.Guest_Male();
	Thread.sleep(1000);
	of.Guest_PhoneNumber("8888888888");
	Thread.sleep(1000);
	of.Guest_Location("Newyork");
	Thread.sleep(1000);
	of.Guest_Sendsms();
	of.Guest_sendEmail();
	of.Guest_sendVoice();
	of.Guest_Terms();
	of.Guest_Robot();
	of.Guest_Get_in_Line();
	Thread.sleep(30000);
	of.Link_StageA();
	Thread.sleep(10000);
	WorkListPage w = new WorkListPage(driver);
	w.worklist();
	Thread.sleep(30000);
	WebElement Name=driver.findElement(By.xpath("// span [contains(text(),'1-chirag gayke')]"));
	Assert.assertEquals(true, Name.isDisplayed());
	System.out.println("Visit code displayed");
	Thread.sleep(1000);
	WebElement connect=driver.findElement(By.xpath("//span[@ng-switch-when='Status']//span[contains(text(),'Connect Check In')]"));
	Assert.assertEquals(true, connect.isDisplayed());
	System.out.println("Status  displayed");
	Thread.sleep(1000);
	WebElement DOB=driver.findElement(By.xpath("//span[contains(text(),'09/09/1999')]"));
	Assert.assertEquals(true, DOB.isDisplayed());
	System.out.println("DOB displayed");
	
	
}
}