package org.example.testes;

import org.example.core.BaseTeste;
import org.example.core.DriverFactory;
import org.example.pages.MovimentacoesPage;
import org.example.pages.TransferenciasPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovimentacoesTeste extends BaseTeste {
    private MovimentacoesPage movimentacaoPage;

    @Before
    public void configurar() {
        DriverFactory.getDriver().get("localhost/");
        movimentacaoPage = new MovimentacoesPage();
    }

    @Test
    public void adicionandoMovimentacaoSimples() {
        realizarLogin();
        movimentacaoPage.selecioanarRadioMeioPagamento("Inovapay");
        movimentacaoPage.selecionarComboBanco("Bradesco - Safepag Pagamentos SA");
        movimentacaoPage.selecionarComboTransacao("Débito");
        movimentacaoPage.setValorMovimentacao("30,00");
        movimentacaoPage.setObservacao("12345");
        movimentacaoPage.setObservacaoIngles("12345");
        movimentacaoPage.clickRealizarMovimentacao();

        Assert.assertEquals("Transção cadastrada com sucesso", movimentacaoPage.obterTextoTransacaoRealizada());

        movimentacaoPage.navegarPagina("localhost/");
        TransferenciasPage transferenciasPage = new TransferenciasPage();
        transferenciasPage.listarTranferenciasComSituacao("Concluída");
        transferenciasPage.clickBotaoPesquisa();
    }

    public void realizarLogin(){
        movimentacaoPage.escreverEmail("teste");
        movimentacaoPage.escreverSenha("123");
        movimentacaoPage.clickBotaoEntrar();
    }


}
