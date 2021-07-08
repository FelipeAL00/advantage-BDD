package br.com.keeggo.test.logic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.keeggo.test.context.ContextTest;
import br.com.keeggo.test.page.HomePage;

public class LoginLogic {
	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	private HomePage homePage;

	public LoginLogic(ContextTest context) {
		this.driver = context.getWebDriverManager().getDriver();
		wait = new WebDriverWait(this.driver,10);		
		js = (JavascriptExecutor) this.driver;
		homePage = context.getPageObjectManager().getHomePage();
	}
	
	public void clickBtnLogar() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(homePage.getBtnLogar()));
		homePage.getBtnLogar().click();
		Thread.sleep(10000);
	}

	public void clickCriarConta() {
		wait.until(ExpectedConditions.visibilityOf(homePage.getBtnCriarConta()));
		js.executeScript("arguments[0].click()", homePage.getBtnCriarConta());
	}

	public void clicarComponentSpeakers() {
		wait.until(ExpectedConditions.visibilityOf(homePage.getComponentSpeakers()));
		js.executeScript("arguments[0].click()", homePage.getComponentSpeakers());
	}

	public String getUserLog() {
		wait.until(ExpectedConditions.urlToBe("https://www.advantageonlineshopping.com/#/"));
		if (HomePage.getUserLog().isEnabled()) {
			wait.until(ExpectedConditions.visibilityOf(HomePage.getUserLog()));
			return HomePage.getUserLog().getText();
		}
		return "Não está ativo";
	}
	
}
