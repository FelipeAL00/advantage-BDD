package br.com.keeggo.test.steps;

import br.com.keeggo.test.context.ContextTest;
import br.com.keeggo.test.logic.HomeLogic;
import br.com.keeggo.test.logic.LoginLogic;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	public LoginLogic loginLogic;
	public HomeLogic homeLogic;

	public LoginSteps(ContextTest context) {
		loginLogic = new LoginLogic(context);
		homeLogic = new HomeLogic(context);
	}

	@Dado("que estou na pagina inicial do Advantage Shopping")
	public void acessaHome() throws Throwable {
		homeLogic.acessaHome();
	}

	@Quando("preencho os dados para realizar login")
	public void realizaLogin() throws Throwable {
		loginLogic.clickBtnLogar();
	}

	@Entao("terei um login realizado")
	public void loginFeito() throws Throwable {
	}
}
