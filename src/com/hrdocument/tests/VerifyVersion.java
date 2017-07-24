package com.hrdocument.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.hrproject.pages.EnterTimeTrackPage;
import com.hrproject.pages.LicencesPage;
import com.hrproject.pages.LoginPage;

import generics.BaseTest;
import generics.UtilityLib;

public class VerifyVersion extends BaseTest
{
	
	@Test(priority=3)
	public void testVerifyVersion()
	{
		System.out.println("start version");
		String un = UtilityLib.getCellValue(INPUT_PATH, "VerifyVersion", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "VerifyVersion", 1, 1);
		
		//get the verison present in login page
		LoginPage l = new LoginPage(driver);
		String version = l.getVersion();
		
		//Enter valid user name
		l.setUserName(un);
		
		//Enter Vaild password
		l.setPassword(pw);
		
		//click on login
		l.clickLogin();
		
		
		//click setting
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		WebDriverWait ww=new WebDriverWait(driver, 3);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.clickSettings();
		
		//click licences
		e.clickLicences();
		
		//veriify that version & Edition is same
		LicencesPage lc = new LicencesPage(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("version frm login page="+version);
		lc.veriftProductEdition(version);
		
		
		
		//logout
		e.clickLogout();
		
		
		
	}
	

}
