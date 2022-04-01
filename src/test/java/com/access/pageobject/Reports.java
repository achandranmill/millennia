package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Reports {
	WebDriver ldriver;
	public Reports(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Reports')]")
	@CacheLookup
	WebElement Reports;
	
	@FindBy(how = How.ID, using = "waitTimesReportTab")
	@CacheLookup
	WebElement selectedTab;
	
	@FindBy(how = How.XPATH, using = "//body/main[1]/div[1]/reports[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement selectallwaitTimes;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text()]")
	@CacheLookup
	WebElement waitTimesDatepicker;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Apply')]")
	@CacheLookup
	WebElement DatepickerApply;
	
	@FindBy(how = How.ID, using = "printReports")
	@CacheLookup
	WebElement print;

	@FindBy(how = How.ID, using = "appointmentsReportTab")
	@CacheLookup
	WebElement appointmentTab;
	
	@FindBy(how = How.XPATH, using = "//body[1]/main[1]/div[1]/reports[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement selectallappointment;
	
	@FindBy(how = How.ID, using = "usersReportTab")
	@CacheLookup
	WebElement usersTab;

	@FindBy(how = How.XPATH, using = "//body[1]/main[1]/div[1]/reports[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement selectallusers;
	
	@FindBy(how = How.ID, using = "surveysReportTab")
	@CacheLookup
	WebElement surveyTab;

	@FindBy(how = How.ID, using = "totalVisitsReportTab")
	@CacheLookup
	WebElement totalVisitTab;
	
	@FindBy(how = How.XPATH, using = "//body/main[1]/div[1]/reports[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement selectdepartmentVisitTab;
	
	@FindBy(how = How.XPATH, using = "//body/main[1]/div[1]/reports[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/label[1]/input[1]")
	@CacheLookup
	WebElement selectastageVisitTab;
	
	@FindBy(how = How.XPATH, using = "//body/main[1]/div[1]/reports[1]/div[2]/div[1]/div[1]/div[3]/select[1]")
	@CacheLookup
	WebElement selectdepartment;

	@FindBy(how = How.ID, using = "exportsReportTab")
	@CacheLookup
	WebElement exportsTab;
	
	@FindBy(how = How.XPATH, using = "//body[1]/main[1]/div[1]/reports[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement selectexportsTab;
	
	@FindBy(how = How.ID, using = "exportButton")
	@CacheLookup
	WebElement exportButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Reports')]")
	@CacheLookup
	WebElement selectedTab6;
	
	
	
	public void ReportClick()
	{
		Reports.click();
	}
	public void waitTimesReportTab()
	{
		selectedTab.click();
	}
	public void selectwaitTime()
	{
		selectallwaitTimes.click();
	}
	public void appointmentTab()
	{
		appointmentTab.click();
	}
	public void selectallappointment()
	{
		selectallappointment.click();
	}
	public void usersTab()
	{
		usersTab.click();
	}
	public void selectallusers()
	{
		selectallusers.click();
	}
	
	public void surveyTab()
	{
		surveyTab.click();
	}
	public void totalVisitTab()
	{
		totalVisitTab.click();
	}
	public void selectdepartmentVisitTab()
	{
		selectdepartmentVisitTab.click();
	}
	public void selectdepartment()
	{
		selectdepartment.click();
	}
	public void exportsTab()
	{
		exportsTab.click();
	}
	public void selectexportsTab()
	{
		selectexportsTab.click();
	}
	public void exportButton()
	{
		exportButton.click();
	}
	
	
}










