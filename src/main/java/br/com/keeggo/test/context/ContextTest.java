package br.com.keeggo.test.context;

import br.com.keeggo.test.manager.PageObjectManager;
import br.com.keeggo.test.manager.WebDriverManager;

public class ContextTest {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public ContextTest() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
