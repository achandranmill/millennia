package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_Messg_tc_24 extends BaseClass

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
		dept.Message_Edit();
		Thread.sleep(2000);
		dept.Message_EditTitle("covid");
		Thread.sleep(2000);
		dept.Message_EditTrigger();
		Thread.sleep(2000);
		dept.Message_EditCategory();
		Thread.sleep(2000);
		dept.Message_EditLimits();
		Thread.sleep(2000);
		dept.Message_EditLimitsCHECKALL();
		Thread.sleep(5000);
		dept.Message_EditTextMessage();
		Thread.sleep(2000);
		dept.Message_EditSendFrom();
		Thread.sleep(2000);
		dept.Message_EditRecipients();
		Thread.sleep(2000);
		dept.Message_EditTextMessageContent("yes");
		Thread.sleep(2000);
		dept.Message_EditVoiceMessage();
		Thread.sleep(2000);
		dept.Message_EditVoiceSendFrom();
		Thread.sleep(2000);
		dept.Message_EditVoiceRecipients();
		Thread.sleep(2000);
		dept.Message_EditVoiceRecipientsUser();
		Thread.sleep(2000);
		dept.Message_EditVoiceContent("hello");
		Thread.sleep(2000);
		dept.Message_EditVoiceMailContent_SAMEASABOVE();
		Thread.sleep(2000);
		dept.Message_EditVoiceMailContentText("hi");
		Thread.sleep(2000);
		dept.Message_EditMail();
		Thread.sleep(2000);
		dept.Message_EditMailSendFrom();
		Thread.sleep(2000);
		dept.Message_EditMailRecipients();
		Thread.sleep(2000);
		//dept.Message_EditMail();
		//Thread.sleep(2000);
		dept.Message_EditMailRecipientsAppoint();
		Thread.sleep(2000);
		dept.Message_EditMailCC();
		Thread.sleep(2000);
		dept.Message_EditMailCCUSER();
		Thread.sleep(3000);
		dept.Message_EditMailBCCUSER();
		Thread.sleep(2000);
		dept.Message_EditMailSUBJECT("checkup");
		Thread.sleep(2000);
		dept.Message_EditMailContent("checkup time");
		Thread.sleep(2000);
		dept.Message_EditHl7();
		Thread.sleep(2000);
		dept.Message_EditHl7Address("Abroad city");
		Thread.sleep(2000);
		dept.Message_EditHl7MessageContent("good checkup process");
		Thread.sleep(2000);
		dept.Message_Edit_save();
		Thread.sleep(5000);
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(3000);
		og.Messages();
		Thread.sleep(2000);
	    og.Org_message_Search("covid");
		Thread.sleep(5000);
		og.MessageEdit();
		Thread.sleep(10000);
		
		
	
	
}
}