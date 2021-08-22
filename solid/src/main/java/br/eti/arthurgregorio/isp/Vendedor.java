package br.eti.arthurgregorio.isp;

public class Vendedor extends Colaborador implements Comissionavel {

    public Vendedor(String nome, String documento, double salario) {
        super(nome, documento, salario);
    }

    @Override
    public double getComissao() {
        return 0.1;
    }
}
