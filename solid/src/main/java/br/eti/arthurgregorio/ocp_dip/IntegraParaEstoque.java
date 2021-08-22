package br.eti.arthurgregorio.ocp_dip;

public class IntegraParaEstoque implements AcoesAposFaturamento {

    @Override
    public void executar(Venda venda) {
        System.out.println("Enviando para o estoque do sistema XPTO...");
    }
}