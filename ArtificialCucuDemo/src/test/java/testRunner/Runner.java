package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Appointment Confirmation.feature",
                  glue="stepsDefinition",
                  dryRun=false,
                  monochrome=true,
                  plugin="html:test-output",
                  tags={"@Regression"}
                 )
                                  
                  


public class Runner {

}
