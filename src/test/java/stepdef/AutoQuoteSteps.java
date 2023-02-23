package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import progressive.bdd.base.BaseClass;

public class AutoQuoteSteps extends BaseClass {

	@Given("Validating landing page Title")
	public void validating_landing_page_title() {
		homePage.validateSelectTitle("Select a product to quote");

	}

	@Given("click start quote button")
	public void click_start_quote_button() {
		homePage.clickStartNewQuote();

	}

	@When("insert zip code field {string}")
	public void insert_zip_code_field(String string) {
		getAQuate.insertZipCode("11219");
	}

	@When("click get a quote button")
	public void click_get_a_quote_button() {
		getAQuate.clickGetAQuote();

	}

	@When("insert home address {string}")
	public void insert_home_address(String string) {
		addressPage.insertPropertyAddress("244 Dahill road, Brooklyn ,NY -11219");

	}

	@Then("click let's go button")
	public void click_let_s_go_button() {
		addressPage.clickLetsGoElement();

	}

	@Then("insert property address {string}")
	public void insert_property_address(String string) {
		propertyAddress.insertPropertyAddress("244 Dahill road");

	}

}