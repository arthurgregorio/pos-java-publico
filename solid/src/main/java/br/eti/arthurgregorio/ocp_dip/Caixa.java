package br.eti.arthurgregorio.ocp_dip;

import java.util.List;

public final class Caixa {

    private final List<AcoesAposFaturamento> acoesAposFaturamento;

    public Caixa(List<AcoesAposFaturamento> acoesAposFaturamento) {
        this.acoesAposFaturamento = acoesAposFaturamento;
    }

    public Venda faturar(Venda venda, Transportadora transportadora, TabelaDescontos tabelaDescontos) {

        // verifica o calculo do frete
        venda.setFrete(transportadora.calcularFrete(venda));

        // verifica o calculo do desconto
        venda.setDesconto(tabelaDescontos.calcularDesconto(venda));

        System.out.println("Venda faturada!");

        // executa as acoes apos o faturamento
        this.acoesAposFaturamento.forEach(acao -> acao.executar(venda));
        
        return venda;
    }
}
