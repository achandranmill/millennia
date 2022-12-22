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
public class Get_in_Line_tc_11 extends BaseClass

{
	
	public void Get_In_Line() throws Exception
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
	Thread.sleep(10000);
	of.Getin_Next();
	Thread.sleep(20000);
	of.RCB_Report();
	Thread.sleep(10000);
	of.RCB_firstname("Udit");
	Thread.sleep(3000);
	of.RCB_lastname("Dudhe");
	Thread.sleep(10000);
	of.RCB_dob("12-09-1992");
	Thread.sleep(3000);
	of.RCB_Patient("Udit");
	Thread.sleep(3000);
	of.RCB_ssn("666666666");
	Thread.sleep(3000);
	of.RCB_ZipCode("555555555");
	of.RCB_Tick();
	Thread.sleep(3000);
	of.RCB_Signature2();
	Thread.sleep(3000);
	of.RCB_Done();
	Thread.sleep(10000);
	WebElement Expected = driver.findElement(By.xpath("//span[contains(text(),'COMPLETE')]"));
     String Actual = "COMPLETE";
     Assert.assertEquals(Actual, Expected.getText());
     
}
}