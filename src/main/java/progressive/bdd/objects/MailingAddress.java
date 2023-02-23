package progressive.bdd.objects;

import static progressive.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailingAddress{
	
	public MailingAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='NameAndAddressEdit_embedded_questions_list_FirstName']")
	WebElement insertFirstNameElement;
	
	public void insertFirstName(String name) {
		insert(insertFirstNameElement, name);
	}
	@FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']")
	WebElement insertDateOfBirthElement;
	
	public void insertDateOfBirth(String date) {
		insert(insertDateOfBirthElement, date);
	}
	@FindBy(xpath = "//input[@name='NameAndAddressEdit_embedded_questions_list_MailingAddress']")
	WebElement insertStreeElement;
	
	public void insertStreetNumber(String street) {
		insert(insertStreeElement, street);
	}
	@FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_City']")
	WebElement insertCityElement;
	public void insertCityAddress(String city) {
		insert(insertCityElement, city);
	}
	@FindBy(xpath = "(//span[@class='ng-star-inserted'])[9]")
	WebElement clickOkayStartElement;
	
	public void clickOkayStartQuote() {
		click(clickOkayStartElement);
	}
	

}
