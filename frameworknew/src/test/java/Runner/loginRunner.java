package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/Resource/login",
  glue = {"stepDefinition"},
   plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true,
    tags= "@tag1"
)

public class loginRunner {

}
