package progressive.bdd.base;

import static progressive.bdd.utils.IConstant.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import progressive.bdd.utils.ReadProperties;

public class Hook {

	BaseClass baseClass;
	ReadProperties enVar = new ReadProperties();

	@Before
	public void initDriver() {
		baseClass = new BaseClass();
		baseClass.setUpDriver(enVar.getProperty(BROWSER));

	}

	@After
	public void exitingDriver() {
		baseClass.tearUp();
	}

}
