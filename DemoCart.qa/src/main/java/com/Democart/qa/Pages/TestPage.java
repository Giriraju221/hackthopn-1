package com.Democart.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Democart.qa.base.TestBase;

public class TestPage extends TestBase {
	WebDriver driver;
	@FindBy(xpath = "//span[@class='hide_xs']")
	public WebElement SigninButton;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement password;

	@FindBy(xpath = "//i[@class='icon-lock left']")
	public WebElement signtoproceed;

	@FindBy(xpath = "//button[@class='nav_toggle']")
	public WebElement dottes;

	@FindBy(xpath = "//a[contains(text(),'Rooms')]")
	public WebElement rooms;

	@FindBy(xpath = "//a[@href='https://demo.qloapps.com/the-hotel-prime/3-super-delux-rooms.html']")
	public WebElement exectiverooms;

	@FindBy(xpath = "//span[@class='total_rooms_price_block']")
	public WebElement amount;

	@FindBy(xpath = "//button[@class='exclusive book_now_submit']")
	public WebElement book;

	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	public WebElement proceedtocheck;

	@FindBy(xpath = "//a[@href='https://demo.qloapps.com/quick-order?proceed_to_customer_dtl=1']")
	public WebElement proceed;

	@FindBy(xpath = "//a[@id='openLoginFormBlock' and contains(text(),'Login Now')]")
	public WebElement Loginproceed;

	@FindBy(xpath = "//input[@id='login_email']")
	public WebElement emailidproceed;

	@FindBy(xpath = "//a[@title='Proceed to Payment']")
	public WebElement proceedtopayment;

	@FindBy(xpath = "//input[@id='login_passwd']")
	public WebElement passwordproceed;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	public WebElement customerfirstname;
	@FindBy(xpath = "//input[@id='customer_lastname']")
	public WebElement customerlastname;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement customeremail;
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement customerpassword;
	@FindBy(xpath = "//input[@id='phone_mobile']")
	public WebElement customerphnumber;
	@FindBy(xpath = "//button[@id='submitAccount']")
	public WebElement save;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement checkbox;

	@FindBy(xpath = "//a[@class='bankwire']")
	public WebElement bankwire;

	@FindBy(xpath = "//button[@class='btn pull-right button button-medium']")
	public WebElement confromorder;
	@FindBy(xpath = "//span[@class='account_user_name hide_xs']")
	public WebElement demo;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public WebElement logout;

	@FindBy(xpath = "//input[@id='email_create']")
	public WebElement emailadress;

	@FindBy(xpath = "//button[@id='SubmitCreate']")
	public WebElement createacctount;

	@FindBy(xpath = "//a[@title='Information']")
	public WebElement mypersonalaccount;

	@FindBy(xpath = "//button[@class='btn btn-default button button-medium']")
	public WebElement savebutton;

	@FindBy(xpath = "//input[@id='old_passwd']")
	public WebElement currentpaswd;

	public TestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
