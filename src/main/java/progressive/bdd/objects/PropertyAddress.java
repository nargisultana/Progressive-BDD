package progressive.bdd.objects;

import static progressive.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyAddress {

	public PropertyAddress(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='addressLine1Modal']")
	WebElement insertPropertyAddress;

	public void insertPropertyAddress(String address) {
		insert(insertPropertyAddress, address);
	}

	@FindBy(xpath = "(//input[@name='AddressLine2'])[2]")
	WebElement insertAptElements;

	public void insertAptElement(String Apt) {
		insert(insertAptElements, Apt);
	}

	@FindBy(xpath = "(//input[@name='City'])[1]")
	WebElement insertCityElements;

	public void insertCityElement(String city) {
		insert(insertCityElements, city);
	}

	@FindBy(xpath = "//input[@id='cityModal']")
	WebElement insertZipCode2;

	public void insertZipCode2(String zip) {
		insert(insertZipCode2, zip);
	}

	@FindBy(id = "paModalButton")
	WebElement continuElement;

	public void clickContinueQuote() {
		click(continuElement);
	}

}
