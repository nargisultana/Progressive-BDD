package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags = "@smoke and not @exclude", 
                               features = { "src/test/java/features/" }, 
                              glue = { "progressive.bdd.base", "stepdef"},
	                          monochrome = false, 
	                          dryRun = false, 
	                          plugin = { "pretty", "html:target/report.html","json:target/report_json.json", "junit:target/junit_report.xml" })
public class TestRunner {

}
