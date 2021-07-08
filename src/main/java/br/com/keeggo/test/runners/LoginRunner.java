package br.com.keeggo.test.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.keeggo.test.manager.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(//
		features = "src/main/resources/features", //
		glue = "br.com.keeggo.test.steps", //
		tags = "@Login", //
		monochrome = true, //
		snippets = SnippetType.CAMELCASE //
)
public class LoginRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("Nome do usuário", System.getProperty("user.name"));
		Reporter.setSystemInfo("Local", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Máquina", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.141.59");
		Reporter.setSystemInfo("Maven", "3.6.3");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");

	}
}
