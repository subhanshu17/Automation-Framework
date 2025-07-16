package Runner;

import org.junit.runner.*;

//import io.cucumber.junit.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
  glue = {"stepdefiniation"},
		  plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
    monochrome = true,
    tags= "@test"
)

public class LoginRunnerTest extends AbstractTestNGCucumberTests {

}
