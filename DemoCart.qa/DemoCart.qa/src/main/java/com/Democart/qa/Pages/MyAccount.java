package com.Democart.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Democart.qa.base.TestBase;

public class MyAccount extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "//i[@class='fa fa-user']")

	public WebElement Account;
	
	@FindBy(xpath = "//a[@href='https://demo.opencart.com/index.php?route=account/register']")

	public WebElement RegisterLink;

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement Firstname;
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement Lastname;

	@FindBy(xpath = "//input[@name='email'] ")
	public WebElement email;
	@FindBy(xpath = "//input[@name='telephone']")
	public WebElement Telephone;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	@FindBy(xpath = "//input[@name='confirm']")
	public WebElement ConfirmPassword;
	@FindBy(xpath = "//input[@name='agree']")
	public WebElement CheckBox;
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement ContinueButton;
	@FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a ")
	public WebElement LogOut;
	@FindBy(xpath = "//a[contains(text(),'Your Store')]")
	public WebElement Title;
	
	//a[contains(text(),'Your Store')]
	//a[contains(text(),'Logout')]
	

	public MyAccount(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
	
	}


		
}
