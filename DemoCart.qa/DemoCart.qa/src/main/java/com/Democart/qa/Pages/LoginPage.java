package com.Democart.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Login')]")

	public WebElement login;

	@FindBy(xpath = "//input[@name='email']")

	public WebElement EnterEmail;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement EnterPassword;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	public WebElement LoginButton;
	@FindBy(xpath = "//a[@href='https://demo.opencart.com/index.php?route=product/category&path=20' and @class='dropdown-toggle']")
	public WebElement mousehover;
	@FindBy(xpath = "//a[contains(text(),'shopping cart')]")
	public WebElement Addedsucess;

	@FindBy(xpath = "//a[contains(text(),'Mac (1)')]")
	public WebElement SelectMac;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement AddToCart;

	@FindBy(xpath = "//a[contains(text(),'Edit Account')]")
	public WebElement reName;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement RenameLastName;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement renamesubmit;
	@FindBy(xpath = "//a[contains(text(),'Your Store')]")
	public WebElement returnhome;
	@FindBy(xpath = "//a[@href='https://demo.opencart.com/index.php?route=account/logout']")
	public WebElement logout;
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	public WebElement myaccount;
	
	@FindBy(xpath = "//a[@href='https://demo.opencart.com/index.php?route=product/category&path=25' and @class='dropdown-toggle']")
	public WebElement components;
	@FindBy(xpath = "//a[contains(text(),'Monitors (2)')]")
	public WebElement moniter;
	@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30\"')]")
	public WebElement apple30;
	@FindBy(xpath = "//input[@value='10']")
	public WebElement checkbox;
	@FindBy(xpath = "//select[@name='option[217]']")
	public WebElement clour;
	@FindBy(xpath = "//input[@name='option[208]']")
	public WebElement text;
	@FindBy(xpath = "//textarea[@name='option[209]']")
	public WebElement textarea;
	@FindBy(xpath = "//button[@id='button-upload222']")
	public WebElement uploadfile;
	@FindBy(xpath = "//button[@id='button-cart']")
	public WebElement Addcart;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
