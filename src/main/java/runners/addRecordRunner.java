package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty", 
				"html:target/cucumber-reports",
				"json:target/cucumber-reports/cucumber.json",
				"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"
				},
		features = "src/main/resources/features/addRecord.feature",
		glue={"steps"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		tags = "@cenario",
		strict = false, 
		dryRun = false
)


public class addRecordRunner {
	
}
