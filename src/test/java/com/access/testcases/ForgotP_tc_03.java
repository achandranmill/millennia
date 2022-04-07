package com.access.testcases;


import org.testng.annotations.Test;

import com.access.pageobject.*;

public class ForgotP_tc_03   extends BaseClass
{

	@Test
	
	public void forgotp() throws Exception 
{
	ForgotPassword obj2=new ForgotPassword(driver);
	obj2.linkfogotpassword();
	
	obj2.fpemail("");
	
	
	
}
}