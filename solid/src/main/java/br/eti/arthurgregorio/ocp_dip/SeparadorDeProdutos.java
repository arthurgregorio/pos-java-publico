package br.eti.arthurgregorio.ocp_dip;

public class SeparadorDeProdutos implements AcoesAposFaturamento {

    @Override
    public void executar(Venda venda) {
        System.out.println("Separando produtos...");
    }
}
