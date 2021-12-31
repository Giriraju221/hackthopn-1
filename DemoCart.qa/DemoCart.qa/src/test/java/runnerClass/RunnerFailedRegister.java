package runnerClass;



	import java.io.File;

	import org.junit.AfterClass;
	import org.junit.runner.RunWith;

	import com.cucumber.listener.Reporter;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	import managers.FileReaderManager;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/featureFile/NotRegister.feature", glue = { "stepDefenation/NotRegister" }, plugin = {
			"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

	public class RunnerFailedRegister {

		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

		}




}
