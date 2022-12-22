package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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
		System.out.println("USER LOCATION IS PRESENT");
    	}
    	catch(Exception e) 
    	{
    		System.out.println("USER LOCATION IS Not PRESENT");
    		
    	}
		RegtPage r=new RegtPage(driver);
		Thread.sleep(10000);
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
		of.Email("yash@mailinator.com");
		Thread.sleep(3000);
		of.Password("R@avi1234");
		Thread.sleep(3000);
		of.Confirm_Password("R@avi1234");
		Thread.sleep(3000);
		of.First_name("Yash");
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
		Thread.sleep(1000);
		of.Guest_Robot();
		Thread.sleep(1000);
	    of.REGISTERANDGET_LINE();
	    Thread.sleep(20000);
        of.My_Documents();
       //r.RCB_Report();
		r.RCB_FirstName("vivek");
		r.RCB_LastName("roy");
		r.RCB_Dob("09081994");
		Thread.sleep(3000);
		r.RCB_Ssn("777777777");
		Thread.sleep(3000);
		r.RCB_PatientStreetAddress("india");
		r.RCB_ZipCode("451010");
		r.RCB_Signature();
		r.RCB_Signature2();
		Thread.sleep(3000);
		r.RCB_save();
		Thread.sleep(20000);
		WebElement complete = driver.findElement(By.xpath(" //span[contains(text(),'COMPLETE')]"));
		String ExpectedText2 = "COMPLETE";
		Assert.assertEquals(ExpectedText2, complete.getText());
		System.out.println("COMPLETE text is a expected – Assert passed");
		Thread.sleep(5000);
		
		
	}
	

}
