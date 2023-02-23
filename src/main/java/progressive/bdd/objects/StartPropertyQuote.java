package progressive.bdd.objects;

import static progressive.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPropertyQuote {

	public StartPropertyQuote(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='PolicyData_FirstName']")
	WebElement firstNameElement;

	public void insertFirstName(String first) {
		insert(firstNameElement, first);
	}

	@FindBy(xpath = "(//input[@name='maskedInput'])[3]")
	WebElement lastNamElement;

	public void insertLastName(String last) {
		insert(lastNamElement, last);
	}

	@FindBy(xpath = "//input[@id='PolicyData_DateOfBirth']")
	WebElement dateElement;

	public void insertDateOfBirth(String date) {
		insert(dateElement, date);
	}

	@FindBy(xpath = "//button[@id='next-button']")
	WebElement nextElement;

	public void clickNextButton() {
		click(nextElement);
	}

}
