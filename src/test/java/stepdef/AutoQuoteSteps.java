package stepdef;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import progressive.bdd.base.BaseClass;


public class AutoQuoteSteps extends BaseClass {

 
	

	@When("insert zip code field {string}")
	public void insert_zip_code_field(String zipcode) {
		getAQuate.insertZipCode(zipcode);
	}

	@When("click get a quote button")
	public void click_get_a_quote_button() {
		getAQuate.clickGetAQuote();

	}

	@When("insert home address {string}")
	public void insert_property_address(String string) {
		addressPage.insertPropertyAddress("244 Dahill road, Brooklyn ,NY -11219");

	}

	@Then("click let's go button")
	public void click_let_s_go_button() {
		addressPage.clickLetsGoElement();

	}

	@Then("insert property address {string}")
	public void insert_home_address(String string) {
		propertyAddress.insertPropertyAddress("244 Dahill road");

	}
	


}
