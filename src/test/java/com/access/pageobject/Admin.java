package com.access.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Admin 
{
	
	WebDriver ldriver;
	public Admin(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"userLocation\"]")
	@CacheLookup
	WebElement userlocation;
	
	public void userlocation()
	{
		
		userlocation.click();
		userlocation.sendKeys("Florida");
		//*[@id="userLocation"]
		
		//WebElement userlocation = ldriver.findElement(By.xpath("//*[@id=\"userLocation\"]"));  
		//Select dropdown = new Select(userlocation); 
		//dropdown.selectByIndex(1);
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default pull-right']")
	@CacheLookup
	WebElement edituser;
	
	public void edituser()
	{
		
		edituser.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Filter Users']")
	@CacheLookup
	WebElement filteruserbtn;
	
	public void filteruserbtn()
	{
		
		filteruserbtn.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='lastname']")
	@CacheLookup
	WebElement filterbylname;
	
	public void filterbylname(String fil)
	{
		
		filterbylname.sendKeys(fil);
		
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary pull-right']")
	@CacheLookup
	WebElement clkfilterbtn;
	
	public void clkfilterbtn()
	{
		
		clkfilterbtn.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//tbody/tr[1]/td[5]/div[1]/button[1]/span[1]")
	@CacheLookup
	WebElement clkthreedotbtn;
	
	public void clkthreedotbtn()
	{
		
		clkthreedotbtn.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='btn-group pull-right btn-group--margin-left dropdown open']//a[@class='ng-binding'][normalize-space()='Resend Verification Email']")
	@CacheLookup
	WebElement resendverifyemail;
	
	public void resendverifyemail()
	{
		
		resendverifyemail.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='dropdown-toggle']")
	@CacheLookup
	WebElement clkprofiledropdown;
	
	public void clkprofiledropdown()
	{
		
		clkprofiledropdown.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//a[@ng-click='menu.doLogout(); menu.isNavCollapsed = true']")
	@CacheLookup
	WebElement clklogoutlink;
	
	public void clklogoutlink()
	{
		
		clklogoutlink.click();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"login\"]/main/div[1]/login/section/div/div[1]/form/div/input[1]")
	@CacheLookup 
	WebElement enterusername;
	
	public void enterusername(String uname)
	{
		
		enterusername.sendKeys(uname);
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"login\"]/main/div[1]/login/section/div/div[1]/form/div/input[2]")
	@CacheLookup
	WebElement enterpassword;
	
	public void enterpassword(String pass)
	{
		
		enterpassword.sendKeys(pass);
		
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='ng-scope']")
	@CacheLookup
	WebElement login;
	
	public void login()
	{
		
		login.click();
		
	}
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	@CacheLookup
	WebElement enteremailaddess;
	
	public void enteremailaddess(String email)
	{
		
		enteremailaddess.sendKeys(email);
		
	}
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	@CacheLookup
	WebElement editfirstname;
	
	public void editfirstname(String fname)
	{
		editfirstname.clear();
		editfirstname.sendKeys(fname);
		
	}
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	@CacheLookup
	WebElement editlastname;
	
	public void editlastname(String lname)
	{
		editlastname.clear();
		editlastname.sendKeys(lname);
		
	}
	@FindBy(how=How.XPATH,using="//input[@placeholder='Current Password']")
	@CacheLookup
	WebElement entercurrentpasw;
	
	public void entercurrentpasw(String current)
	{
		
		entercurrentpasw.sendKeys(current);
		
	}
	@FindBy(how=How.XPATH,using="//input[@placeholder='New Password']")
	@CacheLookup
	WebElement enternewpswd;
	
	public void enternewpswd(String new1)
	{
		
		enternewpswd.sendKeys(new1);
		
	}
	@FindBy(how=How.XPATH,using="//input[@placeholder='Repeat New Password']")
	@CacheLookup
	WebElement enterconfpaswd;
	
	public void enterconfpaswd(String connew1)
	{
		
		enterconfpaswd.sendKeys(connew1);
		
	}
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Change Password']")
	@CacheLookup
	WebElement clkchangepassword;
	
	public void clkchangepassword()
	{
		
		clkchangepassword.click();;;
		
	}
	
	
	
	
}