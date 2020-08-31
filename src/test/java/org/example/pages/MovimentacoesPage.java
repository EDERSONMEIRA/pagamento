package org.example.pages;
import org.example.core.BasePage;
import org.openqa.selenium.By;

public class MovimentacoesPage extends BasePage {

    public void escreverEmail(String email) {
        utlts.escrever(By.name("auth[login]"), email);
    }

    public void escreverSenha(String senha) {
        utlts.escrever(By.name("auth[password]"), senha);
    }

    public void clickBotaoEntrar() {
        utlts.clicarBotao(By.tagName("button"));
    }

    public void clickRealizarMovimentacao(){
        utlts.clicarBotao("button-send-form");
    }

    public String obterTextoTransacaoRealizada(){
        return utlts.obterTexto(By.className("m-alert__text"));
    }

    public void selecioanarRadioMeioPagamento(String valor) {
        int valueRadio = 0;
        switch (valor) {
            case "EzMerchant": valueRadio = 3; break;
            case "Inovapay"  : valueRadio = 2; break;
            case "Safepag"   : valueRadio = 1; break;
        }
        utlts.clicarRadio(By.xpath("//label/input[@name=\"cashier_id\" and @value= "+valueRadio+"]/../span"));
    }

    public void selecionarComboBanco(String valor){
        utlts.selecionarCombo("js-bank-account",valor);
    }

    public void selecionarComboTransacao( String valor){
        utlts.selecionarCombo(By.name("transfers_type_id"),valor);
    }

    public void setValorMovimentacao(String valor){
        utlts.escrever(By.name("amount"),valor.replace(",",""));
    }

    public void setObservacao(String texto){
        utlts.escrever(By.name("observation"),texto);
    }

    public void setObservacaoIngles(String texto){
        utlts.escrever(By.name("merchant_observation"),texto);
    }

    public void navegarPagina(String url){
        utlts.navegarPagina(url);
    }
}
