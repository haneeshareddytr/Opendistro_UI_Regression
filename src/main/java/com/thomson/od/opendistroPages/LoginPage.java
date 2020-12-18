package com.thomson.od.opendistroPages;

import org.openqa.selenium.WebDriver;

import com.thomson.od.opendistroElements.LoginElements;

public class LoginPage extends LoginElements {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	public void Login(String username, String password) {
		
		loginUsername.sendKeys(username);
		loginPassword.sendKeys(password);
		loginButton.click();
		
	}
}
