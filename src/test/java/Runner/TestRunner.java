package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"src/test/resources/Feature"},
	glue={"StepDefinitions","Hooks"},
	plugin={"pretty","html:target/Sample/HtmlReports.htm"}
		
		)
public class TestRunner {

}
