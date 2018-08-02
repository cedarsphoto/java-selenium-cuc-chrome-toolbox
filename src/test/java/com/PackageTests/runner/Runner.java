package com.PackageTests.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


// Do not include "test" in the name or it is interpreted as a unit test
@RunWith(Cucumber.class)
@CucumberOptions(
         //plugin = {"pretty", "json:target/cucumber-report/cucumber-json-report.json"} // use for pretty reports
        features = "src/test/resources",
        glue = {"com.PackageTests.com.PackageTests.stepdefinitions"},
        tags = ("@wip") // this can be used to target specific feature files to run during debug
)

public class Runner {

    // @BeforeClass can go here, e.g.
 //   public static void setup() {
//         Setup something like selenide
//         setupSelenide();
//
//    }
//
}
