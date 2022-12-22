package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.Get_In_Line;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Document_tc_22 extends BaseClass

{
	
	
	public void Document() throws Exception
	{
		
	loginpage lp=new loginpage(driver);
	lp.setUserName(email);
	lp.setPassword(password);
	lp.clickSubmit();
	Thread.sleep(3000);
	//AdmUser ad=new AdmUser(driver);
	//ad.userlocation();
	//Thread.sleep(5000);
	//ad.okbutton();
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
	WebElement INCOMPLETE = driver.findElement(By.xpath("//span[contains(text(),'INCOMPLETE')]"));
	String ExpectedText = "INCOMPLETE";
	Assert.assertEquals(ExpectedText, INCOMPLETE.getText());
	System.out.println("INCOMPLETE text is a expected � Assert passed");
	Thread.sleep(5000);
	WebElement RCB = driver.findElement(By.xpath("//strong[contains(text(),'RCB')]"));
	String ExpectedRCB = "RCB";
	Assert.assertEquals(ExpectedText, RCB.getText());
	System.out.println("RCB text is a expected � Assert passed");
	Thread.sleep(5000);
	of.Text_Message();
	Thread.sleep(3000);
	of.Send_Email();
	Thread.sleep(3000);
	of.Send_Voice();
	Thread.sleep(3000);
	of.Terms();
	Thread.sleep(10000);
	of.Robot();
	Thread.sleep(3000);
    of.REGISTERANDGET_LINE();
    Thread.sleep(20000);

}
}