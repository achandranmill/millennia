package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Document_tc_17 extends BaseClass

{
	

	public void Document() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);

		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("mahajan");
		//User Enter FirstName
		addp.fname("rohan");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("rohan@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Seeing();
		Thread.sleep(2000);
		addp.Clip_Comment("Nill");
	//	addp.Clip_Reason("only checkup");
	//	addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		addp.Alert_ok();
		 Thread.sleep(10000);
		 addp.lname("s");
		 Thread.sleep(10000);
		r.Registration();
		Thread.sleep(2000);
		r.search("mahajan", "rohan");
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div/div/search-modal/div[2]/div[2]/table/tbody"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			if(listitem.contains("mishra mohit"))
				Thread.sleep(3000);
			{
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(10000);
		r.Document();
		Thread.sleep(5000);
		WebElement INcomplete = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[1]/a/div"));
		String ExpectedText = "INCOMPLETE";
		Assert.assertEquals(ExpectedText, INcomplete.getText());
		System.out.println("INCOMPLETE text is a expected – Assert passed");
		Thread.sleep(5000);
		
		
	}

}
