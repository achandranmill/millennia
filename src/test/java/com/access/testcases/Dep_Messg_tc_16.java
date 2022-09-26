package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Dep_Messg_tc_16 extends BaseClass

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
		dept.Message_Templatetitle("covid3");
		Thread.sleep(2000);
		dept.Message_TemplateLimits();
		Thread.sleep(2000);
		dept.Message_TemplateLimitsCHECKall();
		Thread.sleep(2000);
		dept.Message_TemplateTrigger_FLOW();
		Thread.sleep(2000);
		dept.Message_TemplateNodeTrigger_THRESHOLD();
		Thread.sleep(2000);
		dept.Message_TemplateNodeTrigger_Whenthepatientposition();
		Thread.sleep(2000);
		dept.Message_TemplateNodeTrigger_andtotalqueuesizeis("2");
		Thread.sleep(2000);
		dept.Message_TemplateNodeTrigger_andtotalqueuesizeis2();
		Thread.sleep(2000);
		dept.Message_TemplateNodeTrigger_andtotalqueuesizeistext("5");
		Thread.sleep(2000);
		dept.Message_TemplateSave();
		Thread.sleep(2000);
}
}