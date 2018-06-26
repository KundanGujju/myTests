package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	@FindBy(linkText = "Create an account")
	private WebElement createAnAccount;

	@FindBy(id = "SubmitLogin")
	private WebElement signIn;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "email_create")
	private WebElement emailCreate;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String email, String pass) {
		enterEmail(email);
		enterPassword(pass);
		signIn.click();
	}

	public void enterEmailInCreate(String email) {
		emailCreate.sendKeys(email);
	}

	public void clickCreateAccount() {
		createAnAccount.click();
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void enterEmail(String emailId) {
		email.sendKeys(emailId);
	}

}
