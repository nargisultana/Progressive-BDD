package progressive.bdd.objects;

import progressive.bdd.common.CommonActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	CommonActions actions;


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(tagName = "h2")
	WebElement homepageTextElement;

	public void validateSelectTitle(String expectedTitle) {
		actions.validate(homepageTextElement, expectedTitle);
	}

	@FindBy(xpath = "(//span[@class='last-word'])[2]")
	WebElement getaQuate;

	public void clickStartNewQuote() {
		actions.click(getaQuate);

	}

}
