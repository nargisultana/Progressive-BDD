package progressive.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.bdd.common.CommonActions;

public class PropertyAddress {
	CommonActions actions;


	public PropertyAddress(WebDriver driver) {

		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(xpath = "//input[@id='addressLine1Modal']")
	WebElement insertPropertyAddress;

	public void insertPropertyAddress(String address) {
		actions.insert(insertPropertyAddress, address);
	}

	@FindBy(xpath = "(//input[@name='AddressLine2'])[2]")
	WebElement insertAptElements;

	public void insertAptElement(String Apt) {
		actions.insert(insertAptElements, Apt);
	}

	@FindBy(xpath = "(//input[@name='City'])[1]")
	WebElement insertCityElements;

	public void insertCityElement(String city) {
		actions.insert(insertCityElements, city);
	}

	@FindBy(xpath = "//input[@id='cityModal']")
	WebElement insertZipCode2;

	public void insertZipCode2(String zip) {
		actions.insert(insertZipCode2, zip);
	}

	@FindBy(id = "paModalButton")
	WebElement continuElement;

	public void clickContinueQuote() {
	actions.click(continuElement);
	}

}
