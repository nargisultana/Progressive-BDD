package progressive.bdd.objects;

import static progressive.bdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BundleSaveQuote {

	public BundleSaveQuote(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "h2")
	WebElement homepageTextElement;

	public void validateSelectTitle(String expectedTitle) {
		validate(homepageTextElement, expectedTitle);
	}

	@FindBy(xpath = "(//p[@class='text block-link is-simple bounce'])[1]")
	WebElement bundleSaveElement;

	public void clickBundleSave() {
		click(bundleSaveElement);
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement insertZipElement;

	public void insertZipCodeField(String zip) {
		insert(insertZipElement, zip);
	}

	@FindBy(xpath = "//input[@id='qsButton_overlay_subproducts']")
	WebElement getQuoryElement;

	public void clickGetQuory() {
		click(getQuoryElement);
	}

}
