package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author maksims.gusakovs@accenture.com
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        // Here some tags can be set, for example, tags = {"@Example", "~@ignore"},
        tags = {"@INSERT_TAG_HERE"},
        plugin = {"html:target/cucumber", "json:target/cucumber.json"},
        features = {"src/tests/resources/features/"},
        glue = {"stepDefinitions"}
)

public class UniversalRunner {
}
