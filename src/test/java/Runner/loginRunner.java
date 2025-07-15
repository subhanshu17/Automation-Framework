package Runner;

import org.junit.runner.*;

//import io.cucumber.junit.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/Resource/Features",
  glue = {"stepdefiniation"},
		  plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
    monochrome = true,
    tags= "@tag1"
)

public class loginRunner extends AbstractTestNGCucumberTests {

}
