package runnerClass;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/jgk/Downloads/DemoCart.qa/src/test/resources/featureFile/testCase1.feature", glue = {
		"stepDefenation" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" })

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

	}

}
