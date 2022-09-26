package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.WorkListPage;
import com.access.pageobject.loginpage;

@Test
public class R_Kiosk_tc_4 extends BaseClass

{
	
	public void Kiosk() throws Exception
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
		addp.lname("Mishra");
		//User Enter FirstName
		addp.fname("swapnil");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("mishra@gmail.com");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		Thread.sleep(20000);
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		 Thread.sleep(10000);
		 addp.Alert_ok();
		 Thread.sleep(20000);
		 WorkListPage w = new WorkListPage(driver);
			w.worklist();
			Thread.sleep(30000);			
			w.Searchworklist();
			w.Searchl("mishra");
			w.Searchf("swapnil");
			Thread.sleep(20000);
			List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div/div/search-modal/div[2]/div[2]/table/tbody"));
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++)
			{
				String listitem=list.get(i).getText();
				if(listitem.contains("mishra swapnil"))
					Thread.sleep(3000);
				{
					list.get(i).click();
					break;
				}
			}
			
			Thread.sleep(10000);
		 
		 
	}


}
