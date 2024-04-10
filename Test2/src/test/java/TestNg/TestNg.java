package TestNg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/feature/First.feature",glue ="stepDefination")
public class TestNg extends AbstractTestNGCucumberTests {

}
