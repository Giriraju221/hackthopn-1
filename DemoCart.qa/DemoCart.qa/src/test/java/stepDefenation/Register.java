package stepDefenation;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Democart.qa.Pages.AddToCart;
import com.Democart.qa.Pages.GuestAccount;
import com.Democart.qa.Pages.LoginPage;
import com.Democart.qa.Pages.MyAccount;
import com.Democart.qa.base.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register extends TestBase {

	public Register() {
		super();

	}

	AddToCart ac = new AddToCart(driver);
	MyAccount my = new MyAccount(driver);
	LoginPage lp = new LoginPage(driver);
	GuestAccount ga = new GuestAccount(driver);

	@Given("^User able to launch chrome browser sucessfully$")
	public void user_able_to_launch_chrome_browser_sucessfully() throws Throwable {
		TestBase.initialization();

	}

	@Given("^User go to My Account and Select Register$")
	public void user_go_to_My_Account_and_Select_Register() throws Throwable {
		// MyAccount my = new MyAccount();
		my.Account.click();
		my.RegisterLink.click();

	}

	@Given("^Enter First Name and Last Name$")
	public void enter_First_Name_and_Last_Name() throws Throwable {
		my.Firstname.sendKeys(prop.getProperty("FirstName"));
		my.Lastname.sendKeys(prop.getProperty("LastName"));
	}

	@Given("^Enter Email and Enter Telephone$")
	public void enter_Email_and_Enter_Telephone() throws Throwable {
		my.email.sendKeys(prop.getProperty("Email"));
		my.Telephone.sendKeys(prop.getProperty("Telephone"));

	}

	@Given("^Enter Password and Confirm Password$")
	public void enter_Password_and_Confirm_Password() throws Throwable {
		my.Password.sendKeys(prop.getProperty("Password"));
		my.ConfirmPassword.sendKeys(prop.getProperty("confirmpassword"));
	}

	@When("^Check Privacy policy$")
	public void check_Privacy_policy() throws Throwable {
		my.CheckBox.click();

	}

	@Then("^Click Continue$")
	public void click_Continue() throws Throwable {
		my.ContinueButton.click();
		Thread.sleep(5000);
		my.Account.click();
		Thread.sleep(5000);
		my.LogOut.click();
		Thread.sleep(5000);
		
	}

	@Given("^User go to My Account and Select Login$")
	public void user_go_to_My_Account_and_Select_Login() throws Throwable {
		my.Account.click();
		lp.login.click();
	}

	@When("^Enter email address$")
	public void enter_email_address() throws Throwable {
		lp.EnterEmail.sendKeys(prop.getProperty("Email"));

	}

	@When("^Enter password$")
	public void enter_password() throws Throwable {
		lp.EnterPassword.sendKeys(prop.getProperty("Password"));
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		lp.LoginButton.click();
	}

	@Then("^user able to see the title$")
	public void user_able_to_see_the_title() throws Throwable {
		boolean c = my.Title.isDisplayed();
		System.out.println(c);
		Thread.sleep(2000);
		my.Account.click();
		my.LogOut.click();

	}

	@Given("^User able to mousehover desktops$")
	public void user_able_to_mousehover_desktops() throws Throwable {
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(lp.mousehover).build().perform();

	}

	@When("^select mac book$")
	public void select_mac_book() throws Throwable {
		lp.SelectMac.click();
		lp.AddToCart.click();
		Thread.sleep(5000);
		lp.Addedsucess.isDisplayed();

	}

	@When("^click the checkout button$")
	public void click_the_checkout_button() throws Throwable {
		ac.checkoutclick.click();

	}

	@When("^After adding product display a message$")
	public void after_adding_product_display_a_message() throws Throwable {
		boolean b = ac.Addedsucess.isDisplayed();
		System.out.println(b);
		
	}

	@Then("^user able to click on checkout$")
	public void user_able_to_click_on_checkout() throws Throwable {
		ac.checkoutclick.click();
		Thread.sleep(5000);
		ac.cancel.click();
		Thread.sleep(5000);

	}

	@Given("^Mouse over on Laptops and Notebooks and click on Show all laptops and Notebooks$")
	public void mouse_over_on_laptops_and_notebooks_and_click_on_show_all_laptops_and_notebooks() throws Throwable {
		
		ga.DesktopAndNotepads.click();
		ga.AllLaptops.click();
	}

	@And("^Select HP LP3065$")
	public void select_hp_lp3065() throws Throwable {
		ga.HPLaptopSelect.click();

	}

	@And("^Scroll down the page and change the delivery date to a future date \"([^\"]*)\"$")
	public void scroll_down_the_page_and_change_the_delivery_date_to_a_future_date_something(String strArg1) {
		ga.DelivaryDate.sendKeys(strArg1);
	}

	@And("^Scroll down the page and click on Add to Cart button$")
	public void scroll_down_the_page_and_click_on_add_to_cart_button() throws Throwable {
		ga.Addtocart.click();
	}

	@Then("^Click on the Guest checkout button and enter details and comments confirm order$")
	public void click_on_the_guest_checkout_button_and_enter_details_and_comments_confirm_order() throws Throwable {
		ga.CheckOut.click();
		Thread.sleep(5000);
		ga.ClickGuest.click();
		ga.Continue.click();
		Thread.sleep(2000);
		ga.firstname.sendKeys("naveen");
		ga.lastname.sendKeys("reddy");
		ga.email.sendKeys(prop.getProperty("Email"));
		ga.telephone.sendKeys(prop.getProperty("Telephone"));
		ga.company.sendKeys("hcl");
		ga.address1.sendKeys("anantapur");
		ga.address2.sendKeys("anantapuram");
		ga.city.sendKeys("anantapur");
		ga.postcode.sendKeys("515001");
		Select selectcountry = new Select(ga.selectcountry);
		selectcountry.selectByVisibleText("india");

		Select selectregion = new Select(ga.Region);
		selectregion.selectByVisibleText("AndharaPradesh");
		ga.continuebutton.click();
		ga.delivarycomment.sendKeys("thankyou");
		ga.shippingcontinue.click();
		ga.agree.click();
		ga.confirmorder.click();
		boolean b = ga.confirmed.isDisplayed();
		System.out.println(b);

	}
	
	    @And("^Select the Edit Account from the right side corner update the Last Name (.+)$")
	    public void select_the_edit_account_from_the_right_side_corner_update_the_last_name(String lastname) throws Throwable {
	        
	    	lp.reName.click();
	    	lp.RenameLastName.sendKeys(lastname);
	    	
	    }

	    @And("^Click continue and Log the success msg success Your account as been successfully updated$")
	    public void click_continue_and_log_the_success_msg_success_your_account_as_been_successfully_updated() throws Throwable {
	        lp.renamesubmit.click();
	    }
	    @Then("^Scroll down Click on logout button and Click continue to return to homepage$")
	    public void scroll_down_click_on_logout_button_and_click_continue_to_return_to_homepage() throws Throwable {
	        lp.returnhome.click();
	        lp.myaccount.click();
	        lp.logout.click();
	    }
	    
	    @And("^Mouseover to the Components tab Click on monitors Click on Apple Cinema30$")
	    public void mouseover_to_the_components_tab_click_on_monitors_click_on_apple_cinema30() throws Throwable {
	        lp.components.click();
	        lp.moniter.click();
	        lp.apple30.click();
	        
	    }

	    @And("^Enter all the required fields and upload file  in available options Click on Add to cart button$")
	    public void enter_all_the_required_fields_and_upload_file_in_available_options_click_on_add_to_cart_button() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^The item should be added to the cart$")
	    public void the_item_should_be_added_to_the_cart() throws Throwable {
	        throw new PendingException();
	    }
	    @Then("^If the file is not uploaded then it should throw an error message and the item is not added to cart$")
	    public void if_the_file_is_not_uploaded_then_it_should_throw_an_error_message_and_the_item_is_not_added_to_cart() throws Throwable {
	        throw new PendingException();
	    }
	    

	}
	    


