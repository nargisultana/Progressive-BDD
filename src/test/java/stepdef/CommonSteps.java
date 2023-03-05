package stepdef;

import progressive.bdd.base.BaseClass;
import progressive.bdd.reporting.Logs;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseClass{
	
	@Given ("this is a property test")
	public void this_is_a_peoperty_test() {
		Logs.log("*** This is a background step ***");
	}
	@Given("Validating landing page Title")
	public void validating_landing_page_title() {
		homePage.validateSelectTitle("Select a product to quote");

	}
	@Given("click start quote button")
	public void click_start_quote_button() {
		homePage.clickStartNewQuote();

	}

}
