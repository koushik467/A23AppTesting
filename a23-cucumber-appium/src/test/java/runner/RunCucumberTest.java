package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Path to the feature files
		glue = { "stepDefinitions" }, // Package where step definitions are located
		plugin = { "pretty", "html:target/cucumber-reports" }, // Report generation
		monochrome = true // Better console output formatting
)
public class RunCucumberTest {
}
