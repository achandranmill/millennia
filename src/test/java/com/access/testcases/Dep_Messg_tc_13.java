package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_Messg_tc_13 extends BaseClass

{
	public void departments() throws Exception 
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
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.Dept_Messages();
		Thread.sleep(2000);
		dept.Message_Addnew();
		Thread.sleep(2000);
		dept.Message_ChoosefromCoreMessages();
		Thread.sleep(2000);
		dept.Message_fromTemplate();
		Thread.sleep(2000);
		dept.Message_continue();
		Thread.sleep(2000);
		dept.Message_TemplateTextMessage();
		Thread.sleep(2000);
		dept.Message_TemplateTextContent("Pre-Op is ready for $FIRST_NAME. Please make your way to the door Marked #1. A nurse will meet you there to assist you further.");
		dept.Message_TemplateTextSend();
		Thread.sleep(2000);
		dept.Message_TemplateTextRecipients();
		Thread.sleep(2000);
		dept.Message_TemplateTextRecipientsUser();
		Thread.sleep(2000);
	    dept.Message_TemplateVoiceMessage();
		Thread.sleep(2000);
		dept.Message_TemplateVoiceSend();
	    Thread.sleep(2000);
		dept.Message_TemplateVoiceRecipients();
		Thread.sleep(2000);
		dept.Message_TemplateVoiceRecipientsAppoint();
		Thread.sleep(2000);
		dept.Message_TemplateVoiceContent("Pre-Op is ready for $FIRST_NAME. Please make your way to the door Marked #1. A nurse will meet you there to assist you further");
		Thread.sleep(2000);
		dept.Message_TemplateVoiceMailContent("send");
		Thread.sleep(2000);
		dept.Message_TemplateSave();
		Thread.sleep(3000);
		    
	
	
}
}
