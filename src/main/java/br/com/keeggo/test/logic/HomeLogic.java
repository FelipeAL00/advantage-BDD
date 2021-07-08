package br.com.keeggo.test.logic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.keeggo.test.context.ContextTest;
import br.com.keeggo.test.manager.FileReaderManager;
import br.com.keeggo.test.page.HomePage;

public class HomeLogic {
	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	private HomePage homePage;
	
	public HomeLogic(ContextTest context) {
		this.driver = context.getWebDriverManager().getDriver();
		wait = new WebDriverWait(this.driver,10);		
		js = (JavascriptExecutor) this.driver;
		homePage = context.getPageObjectManager().getHomePage();
	}
	
	public void acessaHome() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getUrl());
	}
	
}
