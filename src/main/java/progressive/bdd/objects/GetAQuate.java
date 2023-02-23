package progressive.bdd.objects;

import static progressive.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetAQuate {

	public GetAQuate(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement insertZipCodElement;

	public void insertZipCode(String zip) {
		insert(insertZipCodElement, zip);

	}

	@FindBy(xpath = "(//input[@name='qsButton'])[3]")
	WebElement getAQuote;

	public void clickGetAQuote() {
		click(getAQuote);
	}

}
