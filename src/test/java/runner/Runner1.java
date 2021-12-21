package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {".\\src\\test\\java\\feature\\Datatable.feature"},
glue = {"stepDefinition"},
dryRun = false,	//check the stepdefinition whether all the scnarios steps impelmented or not
plugin= {"pretty"},	//to print the scenario steps in console
monochrome= true	// to remove special characters in console output

)
public class Runner1 extends AbstractTestNGCucumberTests {

}
