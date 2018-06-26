package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage {
	WebDriver driver;

	@FindBy(className = "price product-price")
	private List<WebElement> productPrice;

	@FindBy(xpath = "*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	private WebElement addToBasket;
	
	@FindBy(linkText = "Proceed to checkout")
	private WebElement proceedToCheckout;

	public DressesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAddToBasket(){
		addToBasket.click();
	}
	
	public void clickProceed(){
		proceedToCheckout.click();
	}
	
	public int findExpensiveProd(){
		int price = 0;
		for(WebElement prodPrice: productPrice){
			String dressPrice = prodPrice.getText();
			int newPrice = Integer.parseInt(dressPrice);
			if(price<=newPrice){
				price=newPrice;
			}
		}
		return price;
	}

}