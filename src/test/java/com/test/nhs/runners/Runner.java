package com.test.nhs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/nhs/userLogin.feature",//content
        glue="com/test/nhs/stepdefinitions",//source
        dryRun = false,
        tags="@regression",
        plugin = {"pretty", "html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class Runner {
}
