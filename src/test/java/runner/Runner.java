package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {".\\src\\test\\java\\feature\\organization.feature"},
glue = {"stepDefinition"},
dryRun = false
)
public class Runner extends AbstractTestNGCucumberTests {

}
