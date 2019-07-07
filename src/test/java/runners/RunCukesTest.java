package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.stepDefenition.WikiSteps;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:testCases.feature",
        glue ="classpath:cucumber.stepDefenition",
        plugin = {"pretty","html:target/cucmber-reports"},
        monochrome = true
        )
public class RunCukesTest{

}
