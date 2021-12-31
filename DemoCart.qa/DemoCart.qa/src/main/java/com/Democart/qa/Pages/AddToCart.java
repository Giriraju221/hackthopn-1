package com.Democart.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver driver;
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	public WebElement AddCartButton;
	
	@FindBy(xpath = "//a[contains(text(),'shopping cart')]")
	public WebElement Addedsucess;
	
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	public WebElement checkoutclick;
	//a[contains(text(),'Checkout')]
	
	@FindBy(xpath = "//a[contains(text(),'Use Coupon Code ')]")
	public WebElement couponCode;
	//a[contains(text(),'Use Coupon Code ')]
	
	@FindBy(xpath = "//input[@name='coupon']")
	public WebElement coupon;
	
	@FindBy(xpath = "//input[@id='button-coupon']")
	public WebElement Applycoupon;
	
	@FindBy(xpath = "//a[contains(text(),'Estimate Shipping & Taxes ')]")
	public WebElement Estimate;
	@FindBy(xpath = "//select[@name='country_id']")
	public WebElement country;
	@FindBy(xpath = "//select[@name='zone_id']")
	public WebElement state;
	@FindBy(xpath = "//input[@name='postcode']")
	public WebElement postcode;
	//button[@id='button-quote']
	@FindBy(xpath = "//i[@class=\"fa fa-times-circle\"]")
	public WebElement cancel;
	
	
	
	
	
	
	public AddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
}
