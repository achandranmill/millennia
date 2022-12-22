package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Departments;

import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Flag_tc_1 extends BaseClass

{
	
	 public void Organization() throws Exception
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
			Provider pd = new Provider(driver);
		//	pd.LocationPopup("Florida");
			Thread.sleep(3000);
			pd.UserAdmin();
			Thread.sleep(3000);
			pd.Admin();
			Thread.sleep(3000);
			Organization og = new Organization(driver);
			og.Organization();
			Thread.sleep(3000);
			og.Flags();
			Thread.sleep(2000);
	        og.Choosefile();
	        Thread.sleep(5000);
	        og.Cropimage();
	        Thread.sleep(3000);
	        og.FlagLabel("covisit");
	        Thread.sleep(2000);
	        og.Persistent();
	        Thread.sleep(3000);
	        og.AddNewFlag();
	        Thread.sleep(2000);
	        Departments dept=new Departments(driver);
			dept.departmentlink();
			Thread.sleep(5000);
			dept.Dep_Flag();
			Thread.sleep(2000);
			dept.Dep_Flag_Assigned();
			Thread.sleep(2000);
			dept.Dep_Flag_Adminuser();
			Thread.sleep(10000);
			dept.Dep_Flag_ReturnAccess();
			Thread.sleep(3000);
			Clipboard addp=new Clipboard(driver);
			addp.LinkclickBoard();
			Thread.sleep(5000);
			//User Enter lastName
			addp.lname("Patil");
			//User Enter FirstName
			addp.fname("Rakesh");
			//User Enter MiddleName
			addp.mname("Thomson");
			//User Enter Birthdate
			addp.DOB("01031999");
			//User Enter PhoneNumber
			addp.pnumber("9878900912");
			Thread.sleep(2000);
			//User Enter Email
			addp.textemail("john@gmail.com");
			Thread.sleep(2000);
			addp.Clip_AppointTime("0930");
			addp.Clip_Location();
			Thread.sleep(2000);
			addp.Clip_Location_option();
			addp.Clip_Appointment_Type();
			Thread.sleep(2000);
			addp.Clip_Appointment_option();
			Thread.sleep(2000);
			addp.Clip_Flag();
			Thread.sleep(2000);
			addp.Clip_Flag_Option();
			Thread.sleep(2000);
		//	addp.Clip_Seeing();
		//	Thread.sleep(2000);
		//	addp.Clip_Thoms();
			addp.Clip_Comment("only checkup");
		//	addp.Clip_Reason("only checkup ");
		//	addp.Clip_Copay("10000");
			Thread.sleep(2000);
			addp.sendSmsMessages();
			addp.sendEmailMessages();
			//addp.printAccessPass();
			addp.Clip_Addpatient();
			Thread.sleep(10000);
			//addp.Clip_Checkin();
			 //Thread.sleep(10000);
            RegtPage r1=new RegtPage(driver);
			r1.Registration();
			Thread.sleep(3000);
			r1.search("patil", "Rakesh");
			Thread.sleep(20000);
			List<WebElement> list = driver.findElements(By.xpath("//tbody//tr[@class='ng-scope']//td/descendant::a[@class='ng-binding']"));
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++)
			{
				String listitem=list.get(i).getText();
				Thread.sleep(10000);
				if(listitem.contains("patil Rakesh"))
				{
					list.get(i).click();
					break;
				}
			}
			
			Thread.sleep(10000);
			r1.FLAGS();
			
		
			
			
			    
		}
}
