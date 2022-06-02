package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_24  extends BaseClass

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
			og.DocumentsAddNewForm();
			Thread.sleep(2000);
			og.Documentstitle("test");
			Thread.sleep(2000);
			og.DocumentSelectTemplate();
			Thread.sleep(2000);
			og.DocumentSelectTemplate1();
			Thread.sleep(2000);
			og.DocumentSelectTemplate1Continue();
			Thread.sleep(2000);
			og.DocumentProvider();
			Thread.sleep(2000);
			og.DocumentAddFiled();
			Thread.sleep(2000);
			og.DocumentfieldTitle("go");
			Thread.sleep(2000);
			og.DocumentfieldMasterKey("34");
			Thread.sleep(2000);
			og.DocumentfieldType();
			Thread.sleep(2000);
			og.DocumentfieldTypeDob();
			Thread.sleep(2000);
			og.DocumentfieldInstructions("hg");
			Thread.sleep(2000);
			og.Thifieldrequired();
			Thread.sleep(2000);
			og.DocumentFiledSave();
			Thread.sleep(2000);
}
}
