package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java",
				 glue = "StepDefinations"	)
public class TestRunner extends AbstractTestNGCucumberTests {

}
