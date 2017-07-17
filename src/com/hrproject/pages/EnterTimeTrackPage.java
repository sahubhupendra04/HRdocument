package com.hrproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.BasePage;

public class EnterTimeTrackPage  extends BasePage
{
	
	@FindBy(id= "logoutLink")
	private WebElement logoutLNK;
	
	@FindBy(xpath = "(//div[contains(text(),'Settings')])[1]")
	private WebElement settings;

	@FindBy (linkText= "Licences")
	private WebElement licences;
	
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
	}
	
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
