package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Document_tc_16 extends BaseClass

{

	
	public void Document() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.Registration();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("patidar");
		//User Enter FirstName
		addp.fname("rajendra");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("golu@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(10000);
		//addp.Clip_Seeing();
		//Thread.sleep(1000);
		//addp.Clip_Thoms();
		Thread.sleep(3000);
		addp.Clip_Flag();
		addp.clipflag1();
		addp.Clip_Comment("Nill");
	   //addp.Clip_Reason("only checkup");
        //addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_LinkConnectAccount();
		addp.Clip_Linkpatient();
		addp.Clip_Link_PatientismyGrandchild();
		Thread.sleep(20000);
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		 Thread.sleep(10000);
		 addp.Alert_ok();
		 Thread.sleep(2000);
		 addp.lname("s");
		 Thread.sleep(10000);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		r.search("patidar", "rajendra");
		Thread.sleep(10000);
			List<WebElement> list = driver.findElements(By.xpath("//tbody//tr[@class='ng-scope']//td/descendant::a[@class='ng-binding']"));
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++)
			{
				String listitem=list.get(i).getText();
				if(listitem.contains("patidar rajendra"))
				{
					list.get(i).click();
					break;
				}
			}
			
			WebElement rajendra = driver.findElement(By.xpath("//span[contains(text(),'patidar, rajendra')]"));
			String ExpectedText = "patidar, rajendra";
			Assert.assertEquals(ExpectedText, rajendra.getText());
			System.out.println("rajendra text is a expected – Assert passed");
			Thread.sleep(5000);
			
		 
	
	}
	
}
