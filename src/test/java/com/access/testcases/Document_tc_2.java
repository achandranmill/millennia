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
public class Document_tc_2 extends BaseClass

{

	public void Document() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Rohan");
		//User Enter FirstName
		addp.fname("mahajan");
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
		addp.Clip_Flag();
		addp.Clip_Flag_Option();
		//addp.Clip_Seeing();
		//Thread.sleep(2000);
		addp.Clip_Comment("Nill");
	   //addp.Clip_Reason("only checkup");
		//addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		Thread.sleep(10000);
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		Thread.sleep(10000);
		addp.Alert_ok();
		r.clickRegistrationPage();
		Thread.sleep(2000);
		r.search("mahajan", "Rohan");
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div/div/search-modal/div[2]/div[2]/table/tbody/tr[1]"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			
			if(listitem.contains("mahajan Rohan"))
			{
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(10000);
		r.FormsOnDemand();
		Thread.sleep(10000);
		r.FormsOnDemand_Select();
		r.FormsOnDemand_Select_checkAll();
		r.Appointment_Type();
		r.Appointment_Type_CheckAll();
		r.Forms_on_Demand_send();
		Thread.sleep(20000);
		r.Document();
		Thread.sleep(10000);
		r.Doc_Print();
		Thread.sleep(3000);
		
		
	}
	
}
