package progressive.bdd.objects;

import progressive.bdd.common.CommonActions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	
	CommonActions actions;
	
	public AddressPage(WebDriver driver) {	
	PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(xpath = "//input[@id='singleLineAddress']")
	WebElement insertPropertyAddress;

	public void insertPropertyAddress(String property) {
		actions.insert(insertPropertyAddress, property);
	}

	@FindBy(xpath = "(//input[@id='paButtonSingleLine'])[1]")
	WebElement letsGoElement;

	public void clickLetsGoElement() {
		actions.click(letsGoElement);
	}

}
