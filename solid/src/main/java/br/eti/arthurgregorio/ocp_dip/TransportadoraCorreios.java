package br.eti.arthurgregorio.ocp_dip;

public class TransportadoraCorreios implements Transportadora {

    @Override
    public double calcularFrete(Venda venda) {
        return venda.getEstadoEntrega().equalsIgnoreCase("Parana") ? 25 : 50;
    }
}
