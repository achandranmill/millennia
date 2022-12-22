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
public class Document_tc_4 extends BaseClass

{
	public void Document() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		AdmUser ad=new AdmUser(driver);
		//ad.userlocation();
		//Thread.sleep(5000);
		//ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.Registration();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Ravina");
		//User Enter FirstName
		addp.fname("Mishra");
		//User Enter MiddleName
		addp.mname("kumari");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("mishra@gmail.com");
		addp.Clip_AppointTime("0945");
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(10000);
		addp.Clip_Seeing();
		Thread.sleep(1000);
		addp.Clip_Thoms();
		Thread.sleep(3000);
		addp.Clip_Flag();
		addp.Clip_Flag_Option();
		addp.Clip_Comment("Nill");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		Thread.sleep(20000);
		addp.Clip_Addpatient();
		Thread.sleep(10000);
		addp.Clip_Checkin();
		 Thread.sleep(10000);
		 addp.Alert_ok();
		 Thread.sleep(2000);
		 addp.lname("s");
		 Thread.sleep(10000);
		r.Registration();
		Thread.sleep(10000);
		r.search("Mishra", "ravina");
		Thread.sleep(30000);
		List<WebElement> list = driver.findElements(By.xpath("//tbody//tr[@class='ng-scope']//td/descendant::a[@class='ng-binding']"));
 		Thread.sleep(10000);
		System.out.println("size of the list:" +list.size());
		
		int size = list.size();
		
		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			if(listitem.contains("Mishra ravina"))
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
		r.COVIDScreeningForm();
		Thread.sleep(5000);
		r.COVID_19SymptomsPresent();
		//r.COVID_DoyouhaveCOVID19();
		r.COVID_Doyouhavedifficultybreathing();
		r.COVID_Haveyouhadanycranberries();
		r.COVID_images1();
		//r.COVID_Whenwasthelasttimeyouleftthecountry();
		r.COVID_images2();
		r.COVID_save();
		Thread.sleep(10000);
		WebElement complete = driver.findElement(By.xpath("/html/body/div[1]/div/div/patient-details-modal/div[2]/div/div[2]/jfh-patient-forms/div/div[1]/ul/li[3]/a/div"));
		Assert.assertEquals(true,complete.isDisplayed());
		System.out.println(" complete is displayed – Assert passed");
		Thread.sleep(15000);
		
		
		
		
	}	
}
