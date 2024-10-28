package org.example.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/feature",
                glue = {"org.example.StepDefs"},
                plugin = {"pretty",
                        "html:target/cucumber.html"

                },
                tags = "@asd"
        )
public class runner extends AbstractTestNGCucumberTests {
}
