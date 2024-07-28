package cucumberOptions;

import io.cucumber.testng.*;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome=true,
plugin= {"pretty", "html:target/cucumber.html","json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
