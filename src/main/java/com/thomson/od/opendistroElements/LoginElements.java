package com.thomson.od.opendistroElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
	@FindBy(xpath="//input[@id='opendistro_security.username']")
	 public WebElement loginUsername;

	@FindBy(xpath="//input[@id='opendistro_security.password']")
	 public WebElement loginPassword;
	
	@FindBy(xpath="//button[@id='opendistro_security.login']")
	 public WebElement loginButton;

	
	
	public LoginElements(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

}
