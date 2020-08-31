package org.example.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;

public class TransferenciasPage extends BasePage {

    public void listarTranferenciasComSituacao(String situacao){
        utlts.selecionarCombo(By.name("situations_group"),situacao);
    }

    public void clickBotaoPesquisa(){
        utlts.clicarBotao(By.xpath("//button[@type='submit']"));
    }
}
