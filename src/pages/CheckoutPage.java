package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath = "*[@id='product_4_16_0_0']/td[2]/p/a")
	private WebElement prodDesc;
	
	public boolean prodIsPresent(){
		return prodDesc.isDisplayed();
	}

}
