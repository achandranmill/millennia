package com.access.pageobject;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginpage {

	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 20), this);
	}
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(tagName = "button")
	@CacheLookup
	WebElement btnLogin;

	@Test
	public WebElement test()
	{
		return btnLogin;
	}
	@Test
	public void setUserName(String email)
	{
		txtUserName.sendKeys(email);
	}
	@Test
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}	
	@Test
	public void clickSubmit()
	{
		btnLogin.click();
	}		
}
