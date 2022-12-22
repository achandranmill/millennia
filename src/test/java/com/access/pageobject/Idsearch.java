package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Idsearch

{

	WebDriver ldriver;
	public Idsearch(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 10), this);
	}

	
	
	@FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/a/span[1]")
	@CacheLookup
	WebElement ID_Deo_Deo;
	
	public void ID_Deo_Deo()
	{
		ID_Deo_Deo.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'ID Search')]")
	@CacheLookup
	WebElement ID_Search;
	
	public void ID_Search()
	{
		ID_Search.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[2]/id-search/div/div[1]/div[1]/input")
	@CacheLookup
	WebElement ID_SearchFilter;
	
	public void ID_SearchFilter(String s)
	{
		ID_SearchFilter.click();
		ID_SearchFilter.sendKeys(s);
	}
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Departments')]")
	@CacheLookup
	WebElement ID_Department;
	
	public void ID_Department()
	{
		ID_Department.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Providers')]")
	@CacheLookup
	WebElement ID_Provider;
	
	public void ID_Provider()
	{
		ID_Provider.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'A - Z')]")
	@CacheLookup
	WebElement ID_AZ;
	
	public void ID_AZ()
	{
		ID_AZ.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[2]/id-search/div/div[1]/button/span")
	@CacheLookup
	WebElement ID_Crossbtn;
	
	public void ID_Crossbtn()
	{
		ID_Crossbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
