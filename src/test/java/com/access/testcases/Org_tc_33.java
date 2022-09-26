package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_33 extends BaseClass

{

	 public void Organization() throws Exception
		{
			loginpage lp=new loginpage(driver);
			lp.setUserName(email);
			lp.setPassword(password);
			lp.clickSubmit();
			Thread.sleep(3000);
			
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
			og.Documents();
			Thread.sleep(2000);
			og.Surveys();
			Thread.sleep(2000);
			og.AddSurvey();
			Thread.sleep(2000);
			og.Surveystitle("surveys");
			Thread.sleep(2000);
			og.SurveysDepartment();
			Thread.sleep(2000);
			og.SurveysDepartmentCheckAll();
			Thread.sleep(2000);
			og.SurveysSave();
			Thread.sleep(2000);
			og.SurveysEdit();
			Thread.sleep(5000);
}
}