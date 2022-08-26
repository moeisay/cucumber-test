package SeleniumTestforCucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature1"
		,glue={"stepDefinition2"},
		plugin={"pretty", "junit:target/cucumber-reports-junit"},

		monochrome = true
		
		)

public class testRunner1 {

	}
