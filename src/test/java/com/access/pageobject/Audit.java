package com.access.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Audit {

	WebDriver ldriver;
	public Audit(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"users\"]/navbar/header/div/div/div[2]/ul[1]/li[3]/a")
	@CacheLookup
	WebElement auditlink;
	
	public void auditlink()
	{
		
		auditlink.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"daterangeCom\"]")
	@CacheLookup
	WebElement daterange;
	public void daterange(String dt)
	{
		daterange.clear();
		daterange.sendKeys(dt);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"audit\"]/div[2]/div[1]/div[1]/input")
	@CacheLookup
	WebElement setstartdate;
	public void setstartdate(String date)
	{
		setstartdate.clear();
		setstartdate.sendKeys(date);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"audit\"]/div[2]/div[2]/div[1]/input")
	@CacheLookup
	WebElement setenddate;
	public void setenddate(String dateend)
	{
		setenddate.clear();
		setenddate.sendKeys(dateend);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"audit\"]/div[2]/div[3]/div/button[1]")
	@CacheLookup
	WebElement clkapplydate;
	public void clkapplydate()
	{
		
		clkapplydate.click();
	}	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/div/div/jf-com-audit/div[1]/div[2]/div/button")
	@CacheLookup
	WebElement clksearchbtn;
	public void clksearchbtn()
	{
		
		clksearchbtn.click();
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"lastNameInput\"]")
	@CacheLookup
	WebElement searchbylname;
	public void searchbylname(String lname)
	{
		
		searchbylname.sendKeys(lname);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"firstNameInput\"]")
	@CacheLookup
	WebElement searchbyfname;
	public void searchbyfname(String fname)
	{
		
		searchbyfname.sendKeys(fname);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"mrnInput\"]")
	@CacheLookup
	WebElement searchbyMRN;
	public void searchbyMRN(String fname)
	{
		
		searchbyMRN.sendKeys(fname);
	}	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/div/div/jf-com-audit/div[1]/div[1]/div[5]/input")
	@CacheLookup
	WebElement searchbydob;
	public void searchbydob(String dob)
	{
		searchbydob.clear();
		searchbydob.sendKeys(dob);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"audit\"]/main/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement clicksystem;
	public void clicksystem()
	{
		
		clicksystem.click();
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"daterangeSys\"]")
	@CacheLookup
	WebElement daterangesystem;
	public void daterangesystem(String dates)
	{
		daterangesystem.clear();
		daterangesystem.sendKeys(dates);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"resultButton\"]")
	@CacheLookup
	WebElement btnsearchsys;
	public void btnsearchsys()
	{
		
		btnsearchsys.click();
	}	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"serviceSelect\"]")
	@CacheLookup
	WebElement orgnization;
	public void orgnization(String org)
	{
		
		orgnization.sendKeys(org);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"serviceSelect\"]")
	@CacheLookup
	WebElement patient;
	public void patient(String pat)
	{
		
		patient.sendKeys(pat);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"serviceSelect\"]")
	@CacheLookup
	WebElement user;
	public void user(String pat)
	{
		
		user.sendKeys(pat);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"eventType\"]")
	@CacheLookup
	WebElement eventtype;
	public void eventtype(String evttype)
	{
		
		eventtype.sendKeys(evttype);
	}	
	
	@FindBy(how=How.XPATH,using="/html")
	@CacheLookup
	WebElement outerclk;
	public void outerclk()
	{
		
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("window.scrollBy(0,1000)");

	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"audit\"]/main/div[1]/ul/li[3]/a")
	@CacheLookup
	WebElement userclick;
	public void userclick()
	{
		
		userclick.click();
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"daterangeCom\"]")
	@CacheLookup
	WebElement userdaterange;
	public void userdaterange(String dateuser)
	{
		userdaterange.clear();
		userdaterange.sendKeys(dateuser);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"resultButton\"]")
	@CacheLookup
	WebElement usersearchbtn;
	public void usersearchbtn()
	{
		
		usersearchbtn.click();
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"lastNameInput\"]")
	@CacheLookup
	WebElement userlname;
	public void userlname(String ulname)
	{
		
		userlname.sendKeys(ulname);
	}	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"firstNameInput\"]")
	@CacheLookup
	WebElement userfname;
	public void userfname(String ufname)
	{
		
		userfname.sendKeys(ufname);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"mrnInput\"]")
	@CacheLookup
	WebElement useremail;
	public void useremail(String uemail)
	{
		
		useremail.sendKeys(uemail);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"callerInput\"]")
	@CacheLookup
	WebElement filtbyuseremail;
	public void filtbyuseremail(String usremail)
	{
		
		filtbyuseremail.sendKeys(usremail);
	}	
	
	
	}
	

