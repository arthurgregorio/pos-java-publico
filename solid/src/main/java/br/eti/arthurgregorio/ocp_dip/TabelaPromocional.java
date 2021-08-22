package br.eti.arthurgregorio.ocp_dip;

public class TabelaPromocional implements TabelaDescontos {

    @Override
    public double calcularDesconto(Venda venda) {
        final var descontoNormal = venda.getTipoCliente().calcularDesconto(venda.getValorTotal());
        return descontoNormal * 0.02;
    }
}
