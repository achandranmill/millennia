package com.access.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserTestPage
{
     WebDriver ldriver;
     public UserTestPage(WebDriver rdriver)
     {
    	
		ldriver=rdriver;
    	 PageFactory.initElements(rdriver, this);
    	 
     }
     
     @FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/a")
     @CacheLookup
     WebElement linkUserTest;

      @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/navbar/header/div/div/div[2]/ul[2]/li/ul/section/ol/li/input")
      @CacheLookup
       WebElement filterdepartment;
      @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/navbar/header/div/div/div[2]/ul[2]/li/ul/section/ol/span/li/a")
       @CacheLookup
       WebElement linkImenso;
      @FindBy(how=How.XPATH,using="//*[@id=\"registration\"]/navbar/header/div/div/div[2]/ul[2]/li/ul/section/li[1]/a")
      @CacheLookup
      WebElement changedepartment;
      
      @FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/ul/li[3]/a")
      @CacheLookup
      WebElement Logout;
      
      public void Logout()
      {
    	  Logout.click();
      }
      
public void linkUserTest()
{
	linkUserTest.click();
}

public void clicklinkImenso()
{
	
	linkImenso.click();
			
}
 public void clickfilterdepartment()
 
 {
	 filterdepartment.click();
	 
 }
    
    public void clickchangeDepartment()
    {
    	changedepartment.click();
    	
    	
    }
 
    
    
    
    	
    	
    	
    	
    
    

     
     
}
