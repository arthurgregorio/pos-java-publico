package br.eti.arthurgregorio.ocp_dip;

public class TransportadoraPlimor implements Transportadora {

    @Override
    public double calcularFrete(Venda venda) {
        return venda.getEstadoEntrega().equalsIgnoreCase("Parana") ? 10 : 20;
    }
}
