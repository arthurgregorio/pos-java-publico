package br.eti.arthurgregorio.ocp_dip;

public class TabelaNormal implements TabelaDescontos {

    @Override
    public double calcularDesconto(Venda venda) {
        return venda.getTipoCliente().calcularDesconto(venda.getValorTotal());
    }
}
