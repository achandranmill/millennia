package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Forms_tc_19 extends BaseClass

{

	public void Forms() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);

		RegtPage r=new RegtPage(driver);
		r.Registration();
		Thread.sleep(3000);

		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Mishra");
		//User Enter FirstName
		addp.fname("mohit");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("mishra@gmail.com");
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
		//Thread.sleep(3000);
		addp.Clip_Comment("Nill");
		//addp.Clip_Reason("only checkup");
		//addp.Clip_Copay("10000");
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
		r.clickRegistrationPage();
		Thread.sleep(10000);
		r.search("mishra", "mohit");
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
		Thread.sleep(3000);
		r.MRISafetyQuestionnaire();
		Thread.sleep(2000);
		r.MRI_Doyouvape_no();
		Thread.sleep(2000);
		r.MRI_AreyouMRIready_no();
		Thread.sleep(3000);
		r.MRI_Selectthefollowingconditions_pain();
		Thread.sleep(5000);
		r.MRI_Ifotherpleasedescribe_formly_2_input_4_4search("hello");
		Thread.sleep(2000);
		r.MRI_signatureConsent_5();
		Thread.sleep(3000);
		r.MRI_signatureConsent_sign();
		Thread.sleep(10000);
		r.MRI_Dob("02041997");
		Thread.sleep(3000);
		r.MRI_save();
		Thread.sleep(3000);
		
		
	
	}
}