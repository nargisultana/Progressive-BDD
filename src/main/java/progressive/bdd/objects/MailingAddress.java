package progressive.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.bdd.common.CommonActions;

public class MailingAddress{
	CommonActions actions;

	
	public MailingAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}
	
	@FindBy(xpath = "//input[@name='NameAndAddressEdit_embedded_questions_list_FirstName']")
	WebElement insertFirstNameElement;
	
	public void insertFirstName(String name) {
		actions.insert(insertFirstNameElement, name);
	}
	@FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']")
	WebElement insertDateOfBirthElement;
	
	public void insertDateOfBirth(String date) {
		actions.insert(insertDateOfBirthElement, date);
	}
	@FindBy(xpath = "//input[@name='NameAndAddressEdit_embedded_questions_list_MailingAddress']")
	WebElement insertStreeElement;
	
	public void insertStreetNumber(String street) {
	actions.insert(insertStreeElement, street);
	}
	@FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_City']")
	WebElement insertCityElement;
	public void insertCityAddress(String city) {
		actions.insert(insertCityElement, city);
	}
	@FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
	WebElement clickOkayStartElement;
	
	public void clickOkayStartQuote() {
		actions.click(clickOkayStartElement);
	}
	

}
