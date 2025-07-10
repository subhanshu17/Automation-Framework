package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepDefinitions"},
    plugin = {
        "pretty",
        "html:target/cucumber-reports/testng-html-report.html",
        "json:target/cucumber-reports/testng-cucumber.json",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
    },
    monochrome = true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}