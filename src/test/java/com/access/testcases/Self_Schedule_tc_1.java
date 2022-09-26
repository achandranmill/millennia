package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Self_Schedule_tc_1 extends BaseClass

{
	
	public void Clipboard() throws Exception
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
		addp.lname("gayke");
		//User Enter FirstName
		addp.fname("rahul");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("malviya@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
	//	Thread.sleep(10000);
	//	addp.Clip_Seeing();
	//	Thread.sleep(1000);
	//	addp.Clip_Thoms();
		Thread.sleep(3000);
		addp.Clip_Comment("Nill");
		//addp.Clip_Reason("only checkup");
		//addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.printAccessPass();
		Thread.sleep(3000);
		addp.Clip_LinkConnectAccount();
		Thread.sleep(3000);
		addp.Clip_LinkSelfoption();
		Thread.sleep(3000);
		addp.Clip_LinkSelf();
		Thread.sleep(3000);
		addp.Clip_Addpatient();
		Thread.sleep(3000);
		addp.Clip_Checkin();
		Thread.sleep(5000);
		addp.Accesssprint_close();
		 addp.lname("s");
		 Thread.sleep(10000);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		r.search("gayke", "rahul");
		Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div/div/search-modal/div[2]/div[2]/table/tbody/tr[1]"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String listitem=list.get(i).getText();
			
			if(listitem.contains("gayke rahul"))
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
		Thread.sleep(10000);
		r.Document();
		Thread.sleep(10000);
		//r.Document_firstname("rahul");
		//r.Document_lastname("malviya");
		//r.Document_middlename("kumar");
		//r.Document_Dob("08091993");
		//r.Document_Saveform();
		//Thread.sleep(10000);
		//r.COVIDScreeningForm();
		//r.COVID_19SymptomsPresent();
	//	r.COVID_Whenwasthelasttimeyouleftthecountry();
		//r.COVID_Doyouhavedifficultybreathing();
	//	r.COVID_Haveyouhadanycranberries();
	//	r.COVID_DoyouhaveCOVID19();
	//	r.COVID_images1();
		//r.COVID_images2();
	//	r.COVID_save();
		//Thread.sleep(3000);
		//r.MRISafetyQuestionnaire();
		//r.MRI_Doyouvape_no();
		//r.MRI_AreyouMRIready_no();
	//	r.MRI_Selectthefollowingconditions_pain();
		//r.MRI_Ifotherpleasedescribe_formly_2_input_4_4search("nill");
		//r.MRI_signatureConsent_5();
	//	r.MRI_signatureConsent_sign();
		//Thread.sleep(5000);
	//	r.MRI_Dob("09101995");
		//r.MRI_save();
	//	Thread.sleep(10000);
		r.RCB_Report();
		r.RCB_FirstName("vivek");
		r.RCB_LastName("roy");
		r.RCB_Dob("09081994");
		r.RCB_Ssn("777777777");
		r.RCB_PatientStreetAddress("india");
		r.RCB_ZipCode("451010");
		r.RCB_Signature();
		r.RCB_Signature2();
		r.RCB_save();
		r.Doc_Print();

		
		
		
		
		
	}
}
