package progressive.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.bdd.common.CommonActions;

public class BundleSaveQuote {
	
	CommonActions actions;

	public BundleSaveQuote(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(tagName = "h2")
	WebElement homepageTextElement;

	public void validateSelectTitle(String expectedTitle) {
		actions.validate(homepageTextElement, expectedTitle);
	}

	@FindBy(xpath = "(//p[@class='text block-link is-simple bounce'])[1]")
	WebElement bundleSaveElement;

	public void clickBundleSave() {
		actions.click(bundleSaveElement);
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement insertZipElement;

	public void insertZipCodeField(String zip) {
		actions.insert(insertZipElement, zip);
	}

	@FindBy(xpath = "//input[@id='qsButton_overlay_subproducts']")
	WebElement getQuoryElement;

	public void clickGetQuory() {
		actions.click(getQuoryElement);
	}

}
