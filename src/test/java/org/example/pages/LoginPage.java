package org.example.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void escreverEmail(String email) {
        utlts.escrever(By.name("auth[login]"), email);
    }

    public void escreverSenha(String senha) {
        utlts.escrever(By.name("auth[password]"), senha);
    }

    public void clickBotaoEntrar() {
        utlts.clicarBotao(By.tagName("button"));
    }

    public String obterTextoDashboard(){
        return utlts.obterTexto(By.xpath("//h3[text()='Dashboard']"));
    }

    public String obterAlertDadosIncorretos(){
        return utlts.obterTexto(By.tagName("span"));
    }

}
