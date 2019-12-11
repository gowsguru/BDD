package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		
		format={"pretty","html:report/html","json:report/json/cucumber.json"},
		tags={"@Reg"},
		features="src/main/java/feature",
		glue={"java_cucumber"}	
		
		)
public class runner_class extends AbstractTestNGCucumberTests {

}
