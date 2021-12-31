/*
 * package stepDefenation;
 * 
 * import com.Democart.qa.Pages.MyAccount; import com.Democart.qa.base.TestBase;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * public class NotRegister extends TestBase {
 * 
 * 
 * public NotRegister() { super();
 * 
 * }
 * 
 * MyAccount my = new MyAccount(driver);
 * 
 * @Given("^User able to launch chrome browser sucessfully$") public void
 * user_able_to_launch_chrome_browser_sucessfully() throws Throwable {
 * TestBase.initialization();
 * 
 * }
 * 
 * 
 * @Given("^User go to My Account and Select Register$") public void
 * user_go_to_My_Account_and_Select_Register() throws Throwable {
 * my.Account.click(); my.RegisterLink.click(); }
 * 
 * @Given("^Enter First Name and Last Name$") public void
 * enter_First_Name_and_Last_Name() throws Throwable {
 * my.Firstname.sendKeys(prop.getProperty("FirstName"));
 * my.Lastname.sendKeys(prop.getProperty("LastName")); }
 * 
 * @Given("^Enter Email and Enter Telephone$") public void
 * enter_Email_and_Enter_Telephone() throws Throwable {
 * my.email.sendKeys(prop.getProperty("Email"));
 * my.Telephone.sendKeys(prop.getProperty("Telephone")); }
 * 
 * 
 * @Then("^Click Continue$") public void click_Continue() throws Throwable {
 * my.ContinueButton.click(); }
 * 
 * 
 * }
 */