package progressive.bdd.objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.bdd.common.CommonActions;

public class GetAQuate {
	CommonActions actions;

	public GetAQuate(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement insertZipCodElement;

	public void insertZipCode(String zip) {
		actions.insert(insertZipCodElement, zip);

	}

	@FindBy(xpath = "(//input[@name='qsButton'])[3]")
	WebElement getAQuote;

	public void clickGetAQuote() {
	actions.click(getAQuote);
	}

}
