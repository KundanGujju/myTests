package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CheckoutPage;
import pages.DressesPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.Constants;

public class TechTestStepDefs {

	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	RegistrationPage registrationPage;
	DressesPage dressesPage;
	CheckoutPage checkoutPage;

	public TechTestStepDefs() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		registrationPage = new RegistrationPage(driver);
		dressesPage = new DressesPage(driver);
		checkoutPage = new CheckoutPage(driver);
	}

	@Given("^I am on Home page$")
	public void navigateToHomePage() {
		homePage.goToHomePage();

	}

	@Then("^I Register an account as new user with emailId as \"(.*)\" and \"(.*)\"$")
	public void iRegisterAnAccount(String userId, String password) {
		homePage.clickSignIn();
		loginPage.enterEmailInCreate(Constants.REG_EMAIL);
		registrationPage.accountRegistration(Constants.CUST_FIRST_NAME, Constants.CUST_LAST_NAME,
				Constants.REG_PASSWORD, Constants.FIRST_NAME_IN_ADD, Constants.LAST_NAME_IN_ADD, Constants.ADDRESS1,
				Constants.REG_CITY, Constants.REG_STATE, Constants.REG_COUNTRY, Constants.REG_MOB_NO,
				Constants.REG_ALIAS_ADD);

	}

	@Given("^I login into application$")
	public void iLogin() {
		homePage.goToHomePage();
		homePage.clickSignIn();
		loginPage.login(Constants.REG_EMAIL, Constants.REG_PASSWORD);
	}

	@When("^I add the expensive dress to Cart$")
	public void addExpensiveDress() {
		homePage.clickDresses();
		dressesPage.clickAddToBasket();
		dressesPage.clickProceed();
	}

	@And("^I logout$")
	public void iLogout() {
		homePage.clickSignOut();
	}

	@Then("^I should see the expensive dress in the cart$")
	public void checkItemInTheCart() {
		Assert.assertTrue("Product is not present in the Cart", checkoutPage.prodIsPresent());

	}
}