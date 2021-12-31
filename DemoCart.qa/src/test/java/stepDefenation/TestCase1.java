package stepDefenation;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.Democart.qa.Pages.TestPage;
import com.Democart.qa.base.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase1 extends TestBase {
	public TestCase1() {
		super();

	}

	TestPage tstpage = new TestPage(driver);

	@Then("^Click on the Menu \\(Three Dotted line\\)$")
	public void click_on_the_Menu_Three_Dotted_line() throws Throwable {

		tstpage.SigninButton.click();
		tstpage.email.clear();
		tstpage.email.sendKeys(prop.getProperty("Email"));
		tstpage.password.clear();
		tstpage.password.sendKeys(prop.getProperty("Password"));
		tstpage.signtoproceed.click();

	}

	@When("^Select Rooms$")
	public void select_Rooms() throws Throwable {
		tstpage.dottes.click();
		tstpage.rooms.click();
	}

	@Then("^Click on the Book Now button on the Executive Rooms$")
	public void click_on_the_Book_Now_button_on_the_Executive_Rooms() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		tstpage.exectiverooms.click();
	}

	@When("^Check the Room Price \\$(\\d+)\\.(\\d+)$")
	public void check_the_Room_Price_$(int arg1, int arg2) throws Throwable {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
		// switch to parent window
		// driver.switchTo().window(newTb.get(0));
		Assert.assertEquals(tstpage.amount.getText(), "$2,000.00");

	}

	@Then("^Click on the Book Now$")
	public void click_on_the_Book_Now() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		tstpage.book.click();
	}

	@Then("^Click on Proceed to checkout button$")
	public void click_on_Proceed_to_checkout_button() throws Throwable {
		tstpage.proceedtocheck.click();
	}

	@Then("^Click on Proceed$")
	public void click_on_Proceed() throws Throwable {
		tstpage.proceed.click();
	}

	@When("^Click on Login Now from Guest Information section$")
	public void click_on_Login_Now_from_Guest_Information_section() throws Throwable {

		/*
		 * tstpage.Loginproceed.click();
		 * tstpage.emailidproceed.sendKeys(prop.getProperty("Email"));
		 * tstpage.passwordproceed.sendKeys(prop.getProperty("Password"));
		 * tstpage.signtoproceed.click();
		 */
		/*
		 * tstpage.customerfirstname.sendKeys(prop.getProperty("FirstName"));
		 * tstpage.customerlastname.sendKeys(prop.getProperty("LastName"));
		 * tstpage.customeremail.sendKeys(prop.getProperty("Email"));
		 * tstpage.customerpassword.sendKeys(prop.getProperty("Password"));
		 * tstpage.customerphnumber.sendKeys(prop.getProperty("Telephone"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,350)", ""); tstpage.save.click();
		 */
		tstpage.proceedtopayment.click();
	}

	@When("^Enter Email address$")
	public void enter_Email_address() throws Throwable {
		tstpage.customeremail.sendKeys(prop.getProperty("Email"));
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		 tstpage.customerpassword.sendKeys(prop.getProperty("Password"));

	}

	@When("^Click on check box to agree the Terms of services$")
	public void click_on_check_box_to_agree_the_Terms_of_services() throws Throwable {
		tstpage.checkbox.click();
	}

	@When("^click on Pay by bank wire$")
	public void click_on_Pay_by_bank_wire() throws Throwable {
		tstpage.bankwire.click();
	}

	@When("^Click on I confirm my order$")
	public void click_on_I_confirm_my_order() throws Throwable {
		tstpage.confromorder.click();
	}

	@Then("^Click on Logout$")
	public void click_on_Logout() throws Throwable {
		tstpage.demo.click();
		tstpage.logout.click();
	}

	// ------------------------------------------------------------------------------

	@Given("^Go to \"([^\"]*)\" and enter email Address and password$")
	public void go_to_and_enter_email_Address_and_password(String arg1) throws Throwable {

		tstpage.SigninButton.click();
		tstpage.email.clear();
		tstpage.email.sendKeys(prop.getProperty("Email"));
		tstpage.password.clear();
		tstpage.password.sendKeys(prop.getProperty("Password"));
		tstpage.signtoproceed.click();
	}

	@When("^Click on the \"([^\"]*)\" from My Account page$")
	public void click_on_the_from_My_Account_page(String arg1) throws Throwable {
		tstpage.mypersonalaccount.click();
	}

	@Then("^Modify your name and DOB$")
	public void modify_your_name_and_DOB() throws Throwable {

	}

	@Then("^Enter the Current Password$")
	public void enter_the_Current_Password() throws Throwable {
		tstpage.currentpaswd.sendKeys(prop.getProperty("currentpassword"));

	}

	@Then("^Click on Save$")
	public void click_on_Save() throws Throwable {
		tstpage.savebutton.click();

	}

	@When("^Click on Log Out$")
	public void click_on_Log_Out() throws Throwable {
		tstpage.demo.click();
		tstpage.logout.click();

	}

}
