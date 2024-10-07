package Runner;

import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(
	features={"src/test/resources/Feature"},
	glue={"StepDefinitions","Hooks"},
	tags= "@DI",
	plugin={"pretty","html:target/Sample/HtmlReports.htm"}
		
		)
public class TeestRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel=false)
	@Override
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	

}
