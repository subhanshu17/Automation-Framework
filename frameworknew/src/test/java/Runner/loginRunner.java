package Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
    features = "src/test/Resource/login",
  glue = {"stepDefinition"},
   plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true,
    tags= "@tag1"
)

public class loginRunner extends AbstractTestNGCucumberTests{

}
