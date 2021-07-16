package runner;   

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		features=".", // "." represents the root directory (we were using feature before)
		glue="stepDefinition",
		monochrome=true,
		dryRun=false,
		plugin= {
				"html:target/cucumber-reports/cucumber-html",
				"json:target/cucumber-reports/cucumber.json",
				"rerun:rerun/failed_scenario.txt"   // here we create a rerun file inside rerun folder 
		}
		)
public class TestRunner {

}
