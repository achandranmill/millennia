package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile 

{


	WebDriver ldriver;
	public Profile(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/a")
	@CacheLookup
	WebElement profileclick;

	public void profileclick()
	{

		profileclick.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/ul/li[2]/a")
	@CacheLookup
	WebElement accountsetting;

	public void accountsetting()
	{

		accountsetting.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@id=\"oldPassword\"]")
	@CacheLookup
	WebElement oldpassword;

	public void oldpassword(String str)
	{

		oldpassword.sendKeys(str);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id=\"newPassword\"]")
	@CacheLookup
	WebElement newpassword;

	public void newpassword(String str)
	{

		newpassword.sendKeys(str);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id=\"repeatNewPassword\"]")
	@CacheLookup
	WebElement repeatnewpassword;

	public void repeatnewpassword(String str)
	{

		repeatnewpassword.sendKeys(str);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/user/section/article/div[2]/form/div[4]/button")
	@CacheLookup
	WebElement clickresetpasswdbtn;

	public void clickresetpasswdbtn()
	{

		clickresetpasswdbtn.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/user/section/aside/a[2]")
	@CacheLookup
	WebElement changelocation;

	public void changelocation()
	{

		changelocation.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/user/section/article/div[2]/button")
	@CacheLookup
	WebElement changelocationbtnclk;

	public void changelocationbtnclk()
	{

		changelocationbtnclk.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/user-location-modal/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement enterlocation;

	public void enterlocation(String str)
	{

		enterlocation.click();
		enterlocation.sendKeys(str);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/user-location-modal/div[3]/button")
	@CacheLookup
	WebElement okbutton;

	public void okbutton()
	{

		okbutton.click();
		
	}
	
	
	
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/ul/li[3]/a")
	@CacheLookup
	WebElement logoutlink;

	public void logoutlink()
	{

		logoutlink.click();
		
	}
	//------
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/ul/li[2]/a")
	@CacheLookup
	WebElement useraccountsetting;

	public void useraccountsetting()
	{

		useraccountsetting.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@id=\"oldPassword\"]")
	@CacheLookup
	WebElement useroldpassword;

	public void useroldpassword(String str)
	{

		useroldpassword.sendKeys(str);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id=\"newPassword\"]")
	@CacheLookup
	WebElement usernewpassword;

	public void usernewpassword(String str)
	{

		usernewpassword.sendKeys(str);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id=\"repeatNewPassword\"]")
	@CacheLookup
	WebElement userrepeatnewpassword;

	public void userrepeatnewpassword(String str)
	{

		userrepeatnewpassword.sendKeys(str);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/user/section/article/div[2]/form/div[4]/button")
	@CacheLookup
	WebElement userclickresetpasswdbtn;

	public void userclickresetpasswdbtn()
	{

		userclickresetpasswdbtn.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/user/section/aside/a[2]")
	@CacheLookup
	WebElement userchangelocation;

	public void userchangelocation()
	{

		userchangelocation.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/user/section/article/div[2]/button")
	@CacheLookup
	WebElement userchangelocationbtnclk;

	public void userchangelocationbtnclk()
	{

		changelocationbtnclk.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/user-location-modal/div[2]/div[2]/div/input")
	@CacheLookup
	WebElement userenterlocation;

	public void userenterlocation(String str)
	{

		userenterlocation.click();
		userenterlocation.sendKeys(str);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/user-location-modal/div[3]/button")
	@CacheLookup
	WebElement userokbutton;

	public void userokbutton()
	{

		userokbutton.click();
		
	}
	
	
	
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/ul/li[3]/a")
	@CacheLookup
	WebElement userlogoutlink;

	public void userlogoutlink()
	{

		userlogoutlink.click();
		
	}

}
