package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import utilities.Constants;

public class HomePage {

	WebDriver driver;

	@FindBy(linkText = "Sign in")
	private WebElement signIn;

	@FindBy(css = "a.sf-with-ul")
	private WebElement dresses;

	@FindBy(linkText = "Sign out")
	private WebElement signOut;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void goToHomePage() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
	}

	public void clickSignIn() {
		signIn.click();
	}

	public void clickDresses() {
		dresses.click();
	}

	public void clickSignOut() {
		signOut.click();
	}

}
