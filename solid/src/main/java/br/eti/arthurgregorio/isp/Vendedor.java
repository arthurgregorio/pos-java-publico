package br.eti.arthurgregorio.isp;

public class Vendedor extends Colaborador {

    public Vendedor(String nome, String documento, double salario) {
        super(nome, documento, salario);
    }

    @Override
    double getComissao() {
        return 0.1;
    }
}
