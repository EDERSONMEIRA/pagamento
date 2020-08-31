package org.example.testes;

import org.example.core.BaseTeste;
import org.example.core.DriverFactory;
import org.example.pages.LoginPage;
import org.junit.*;

public class LoginTeste extends BaseTeste {

    private LoginPage loginPage;


    @Before
    public void configurar() {
        DriverFactory.getDriver().get("localhost/");
        loginPage = new LoginPage();
    }

    @Test
    public void loginEfetuadoComSucesso() {
        loginPage.escreverEmail("teste");
        loginPage.escreverSenha("123");
        loginPage.clickBotaoEntrar();
        Assert.assertEquals("Dashboard", loginPage.obterTextoDashboard());
    }
    @Test
    public void loginIncorreto(){
        loginPage.escreverEmail("teste");
        loginPage.escreverSenha("12345");
        loginPage.clickBotaoEntrar();
        Assert.assertEquals("Dados incorretos", loginPage.obterAlertDadosIncorretos());
    }


}
