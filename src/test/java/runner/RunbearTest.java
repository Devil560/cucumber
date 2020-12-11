package runner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/order.feature" }, glue = {
		"stepdef" }, tags = "" , plugin = { "pretty", "html:Reports/cucumberHTMLReport",
				"json:Reports/cucumberJSONReport/jsonreport" },

		monochrome = true)


public class RunbearTest {

	@AfterClass
	public static void extendReport() {

	}

}
