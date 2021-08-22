package br.eti.arthurgregorio.ocp_dip;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Arthur Gregorio
 */
public class Venda {

    private final String cliente;
    private final String tipoCliente;
    private final String enderecoEntrega;

    private final List<Item> itens;

    private double frete;
    private double desconto;

    public Venda(String cliente, String tipoCliente, String enderecoEntrega, List<Item> itens) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = itens;
    }

    public double getValorTotal() {
        return this.itens.stream()
                .mapToDouble(Item::valor)
                .sum();
    }

    public String getCliente() {
        return cliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

    public double getFrete() {
        return frete;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
