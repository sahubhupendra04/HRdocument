package com.hrdocument.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.hrproject.pages.LoginPage;

import generics.BaseTest;
import generics.UtilityLib;

public class InvalidLogin extends BaseTest
{
	
	@Test(priority= 2)
	public void testInvalidLogin()
	{
		int rc = UtilityLib.getRowCount(INPUT_PATH, "InvalidLogin");
		for(int i= 1; i<=rc; i++)
		{
			String un = UtilityLib.getCellValue(INPUT_PATH, "InvalidLogin", i, 0);
			String pw = UtilityLib.getCellValue(INPUT_PATH, "InvalidLogin", i, 1);
			//Enter Invalid userID
			LoginPage l = new LoginPage(driver);
			l.setUserName(un);
			
			//Enter invalid PAssword
			l.setPassword(pw);
			
			l.clickLogin();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Verify error msg
			l.verifyErrMsgIsSisplay();
			
		}
		
		
	}

}
