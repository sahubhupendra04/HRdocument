package com.hrproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;

public class EnterTimeTrackPage  extends BasePage
{
	//declaration
	@FindBy(id= "logoutLink")
	private WebElement logoutLNK;
	
	@FindBy(xpath = "//div[contains(text(), 'Settings') and @class= 'popup_menu_label']")
	private WebElement settings;

	@FindBy (linkText= "Licenses")
	private WebElement licences;
	
	//Initialization
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
	}
	
	//declaration
	public void clickLogout()
	{
		
		logoutLNK.click();
		
		
	}
	
	public void clickSettings()
	{
		settings.click();
	}
	
	public void clickLicences()
	{
		licences.click();
	}

}
