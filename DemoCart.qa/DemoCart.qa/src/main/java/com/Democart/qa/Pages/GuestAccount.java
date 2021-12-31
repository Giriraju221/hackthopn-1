package com.Democart.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestAccount {
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks')]")

	public WebElement DesktopAndNotepads;
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")

	public WebElement AllLaptops;

	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")

	public WebElement HPLaptopSelect;
	@FindBy(xpath = "//input[@name='option[225]']")

	public WebElement DelivaryDate;

	@FindBy(xpath = "//button[@id='button-cart']")

	public WebElement Addtocart;
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")

	public WebElement CheckOut;

	@FindBy(xpath = "//input[@value='guest']")

	public WebElement ClickGuest;
	@FindBy(xpath = "//input[@value='Continue']")

	public WebElement Continue;
	@FindBy(xpath = "//input[@name='firstname']")

	public WebElement firstname;
	@FindBy(xpath = "//input[@name='lastname']")

	public WebElement lastname;
	@FindBy(xpath = "//input[@id='input-payment-email']")

	public WebElement email;
	@FindBy(xpath = "//input[@id='input-payment-telephone']")

	public WebElement telephone;
	@FindBy(xpath = "//input[@id='input-payment-company']")

	public WebElement company;
	@FindBy(xpath = "//input[@id='input-payment-address-1']")

	public WebElement address1;
	
	@FindBy(xpath = "//input[@id='input-payment-address-2']")

	public WebElement address2;
	@FindBy(xpath = "//input[@id='input-payment-city']")

	public WebElement city;
	@FindBy(xpath = "//input[@id='input-payment-postcode']")

	public WebElement postcode;

	@FindBy(xpath = "//select[@id='input-payment-country']")

	public WebElement selectcountry;
	@FindBy(xpath = "//select[@id='input-payment-zone']")

	public WebElement Region;
	@FindBy(xpath = "//input[@id='button-guest']")

	public WebElement continuebutton;

	@FindBy(xpath = "//textarea[@name='comment']")

	public WebElement delivarycomment;
	@FindBy(xpath = "//input[@id='button-shipping-method']")

	public WebElement shippingcontinue;
	@FindBy(xpath = "//input[@name='agree']")

	public WebElement agree;
	@FindBy(xpath = "//input[@value='Confirm Order']")

	public WebElement confirmorder;
	@FindBy(xpath = "//p[contains(text(),'Your order has been successfully processed!')]")

	public WebElement confirmed;

	public GuestAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
