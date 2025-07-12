package Runner;

import org.junit.runner.*;

import io.cucumber.junit.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/Resource/Features/login.feature",
  glue = {"stepdefiniation"},
		  plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
    monochrome = true,
    tags= "@tag1"
)

public class loginRunner extends AbstractTestNGCucumberTests {

}
