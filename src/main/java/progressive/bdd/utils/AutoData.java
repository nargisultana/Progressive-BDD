package progressive.bdd.utils;

public class AutoData {

	private String zipCode;
	private String addressPageTitle;
	private String propertyPageTitle;
	private String getAQuoteTitle;

	public AutoData(String zipCode, String addressPageTitle1, String propertyPageTitle, String getAQuoteTitle) {
		if (zipCode == null || addressPageTitle1== null || propertyPageTitle == null || getAQuoteTitle == null ||
		zipCode.length() == 0 || addressPageTitle1.length() == 0 || propertyPageTitle.length() == 0 || 
		getAQuoteTitle.length() == 0) {
				throw new NullPointerException();
		}else {
			this.zipCode = zipCode;
			addressPageTitle = addressPageTitle1;
			this.propertyPageTitle = propertyPageTitle;
			this.getAQuoteTitle = getAQuoteTitle;
		
		}

	}

	public String getZipCode() {
		return zipCode;
	}

	public String getAddressPageTitle() {
		return addressPageTitle;
	}

	public String getPropertyPageTitle() {
		return propertyPageTitle;
	}

	public String getGetAQuoteTitle() {
		return getAQuoteTitle;
	}
}