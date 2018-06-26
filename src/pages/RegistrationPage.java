package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

	WebDriver driver;

	@FindBy(id = "id_gender1")
	private WebElement radioButton1;

	@FindBy(id = "customer_firstname")
	private WebElement customeFirstNameField;

	@FindBy(id = "customer_lastname")
	private WebElement customeLastNameField;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "firstname")
	private WebElement firstNameInAddress;

	@FindBy(id = "lastname")
	private WebElement lastNameInAddress;

	@FindBy(id = "address1")
	private WebElement address1;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "id_state")
	private WebElement state;

	@FindBy(id = "id_country")
	private WebElement country;

	@FindBy(id = "phone_mobile")
	private WebElement mobilePhoneField;

	@FindBy(className = "alias")
	private WebElement aliasAddress;

	@FindBy(id = "submitAccount")
	private WebElement registerButton;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void accountRegistration(
			String firstName,
			String LastName,
			String passwrd,
			String frstNameInAdd,
			String lastNameInAdd,
			String add1,
			String city,
			String state,
			String country,
			String mobNo,
			String aliasAdd
			){
		selectRadio1();
		enterCustFirstName(firstName);
		enterCustLastName(LastName);
		enterPassword(passwrd);
		enterFirstNameInAdd(frstNameInAdd);
		enterLastNameAdd(lastNameInAdd);
		enterAdd1(add1);
		enterCity(city);
		enterState(state);
		enterCountryName(country);
		enterMobileNo(mobNo);
		enterAliasAdd(aliasAdd);
		registerButton.click();
	}
	
	public void selectRadio1(){
		radioButton1.click();
	}

	public void enterCustFirstName(String firstName){
		customeFirstNameField.sendKeys(firstName);;
		
	}

	public void enterCustLastName(String lastName){
		customeLastNameField.sendKeys(lastName);;
	}

	public void enterPassword(String passwd){
		password.sendKeys(passwd);;
	}

	public void enterFirstNameInAdd(String firstNameAdd){
		firstNameInAddress.sendKeys(firstNameAdd);;
	}

	public void enterLastNameAdd(String lastNameAdd){
		lastNameInAddress.sendKeys(lastNameAdd);;
	}

	public void enterAdd1(String add1){
		address1.sendKeys(add1);;
	}

	public void enterCity(String cityName){
		city.sendKeys(cityName);;
	}

	public void enterState(String stateName){
		state.sendKeys(stateName);;
	}

	public void enterCountryName(String contryName){
		country.sendKeys(contryName);;
	}

	public void enterMobileNo(String mobNo){
		mobilePhoneField.sendKeys(mobNo);;
	}

	public void enterAliasAdd(String aliasAdd){
		aliasAddress.sendKeys(aliasAdd);;
	}

}
