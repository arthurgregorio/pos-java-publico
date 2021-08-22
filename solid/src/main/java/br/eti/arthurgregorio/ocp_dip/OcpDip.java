package br.eti.arthurgregorio.ocp_dip;

import java.util.List;

public class OcpDip {

    public static void main(String[] args) {
        final OcpDip ocpDip = new OcpDip();
        ocpDip.executa();
    }

    private void executa() {
        
        final List<Item> itens = List.of(
                new Item("Arroz", 10, 3d),
                new Item("Feijao", 7, 5d),
                new Item("Tomate", 50, 1.89),
                new Item("Cerveja", 6, 5.99)
        );
        
        final Venda venda = new Venda("Foz", "Juvenal", "PF", itens);
        
        final Caixa caixa = new Caixa();
        
        final Venda vendaFaturada = caixa.faturar(venda);
        
        System.out.println("O desconto da venda é: " + vendaFaturada.getDesconto());
        System.out.println("O frete da venda é: " + vendaFaturada.getFrete());
    }
}
