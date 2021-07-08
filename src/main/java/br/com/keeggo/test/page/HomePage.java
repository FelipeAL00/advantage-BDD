package br.com.keeggo.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	private static WebElement btnLogar;

	@FindBy(how = How.XPATH, using = "//*[@id=\"menuUserLink\"]/span")
	private static WebElement UserLog;

	@FindBy(how = How.ID, using = "speakersImg")
	private static WebElement componentSpeakers;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private static WebElement btnCriarConta;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/footer/div/h3")
	private WebElement followUS;

	public WebElement getBtnLogar() {
		return btnLogar;
	}

	public WebElement getComponentSpeakers() {
		return componentSpeakers;
	}

	public WebElement getBtnCriarConta() {
		return btnCriarConta;
	}

	public static WebElement getUserLog() {
		return UserLog;
	}

	public WebElement getFollowUS() {
		return followUS;
	}
	
}
