package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@RunWith(Cucumber.class)
@CucumberOptions(
features= "features"      //Name of feature file
,glue= {"stepDefinition"}                //Name of package
,tags= {"@tag2"}
)*/

@CucumberOptions(
features = "features"
,glue={"stepDefinition"}
,tags= {"@tag2"}
,plugin = {"html:cucumber_reports","junit:cucumber_reports/sucumber.xml"}
)

public class sprint_testRunner extends AbstractTestNGCucumberTests {

}
