package Runner;

import org.junit.runner.*;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/Resource/Features/login.feature",
  glue = {"stepdefiniation"},
   plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true,
    tags= "@tag1"
)

public class loginRunner {

}
