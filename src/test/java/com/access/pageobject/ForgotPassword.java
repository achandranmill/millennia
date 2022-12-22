package com.access.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
public class ForgotPassword
{
	WebDriver ldriver;
	public ForgotPassword(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 20), this);
		
	}

	@FindBy(xpath="//*[@id=\"login\"]/main/div[1]/login/section/div/div[1]/form/a")
	@CacheLookup
	WebElement link_fogotpassword;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"restorePassword\"]/div/form/div[2]/div/input")
	@CacheLookup
	WebElement txtfpemail;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"restorePassword\"]/div/form/div[3]/button/span")
	@CacheLookup
	WebElement submitfp;
	public void linkfogotpassword()
	{
		link_fogotpassword.click();
		
	}
	
	public void fpemail(String email) throws Exception
	{
		txtfpemail.sendKeys(email);
		Thread.sleep(3000);
	
		submitfp.click();
		
	}
	
	public void clearfp()
	{
		txtfpemail.clear();
	}
	
	
	
}
