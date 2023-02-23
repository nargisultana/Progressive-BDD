package progressive.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import static progressive.bdd.utils.IConstant.*;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import progressive.bdd.objects.AddressPage;
import progressive.bdd.objects.BundleSaveQuote;
import progressive.bdd.objects.GetAQuate;
import progressive.bdd.objects.HomePage;
import progressive.bdd.objects.MailingAddress;
import progressive.bdd.objects.PropertyAddress;
import progressive.bdd.objects.StartPropertyQuote;
import progressive.bdd.utils.Constant;
import progressive.bdd.utils.ReadProperties;

public class BaseClass {
	public static WebDriver driver;

	public static HomePage homePage;
	public static GetAQuate getAQuate;
	public static AddressPage addressPage;
	public static PropertyAddress propertyAddress;
	public static StartPropertyQuote startPropertyAddress;
	public static BundleSaveQuote bundleSaveQuote;
	public static MailingAddress mailingAddress;
	ReadProperties envVar = new ReadProperties();

	public void setUpDriver(String browserName) {
		// Enum example
		// String browserName = envVar.getProperty(getString(browser));
		// String browserName = envVar.getProperty(browser.name());
		// String browserName = envVar.getProperty(BROWSER);
		String url = envVar.getProperty(URL);
		long pageLoadWait = envVar.getNumProperty(PAGELOAD_WAIT);
		long implicitwait = envVar.getNumProperty(IMPLICIT_WAIT);

		initDriver(browserName);
		initClasses(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait));
	}

	public void initClasses(WebDriver driver) {
		homePage = new HomePage(driver);
		getAQuate = new GetAQuate(driver);
		addressPage = new AddressPage(driver);
		propertyAddress = new PropertyAddress(driver);
		startPropertyAddress = new StartPropertyQuote(driver);
		bundleSaveQuote = new BundleSaveQuote(driver);
		mailingAddress = new MailingAddress(driver);
	}

	public void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
	}

	public void tearUp() {
		driver.quit();
	}

	@SuppressWarnings("unused")
	private String getString(Constant constant) {
		return constant.name();
	}
}
