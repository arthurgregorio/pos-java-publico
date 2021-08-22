package br.eti.arthurgregorio.isp;

public class Analista extends Colaborador {

    public Analista(String nome, String documento, double salario) {
        super(nome, documento, salario);
    }

    @Override
    double getComissao() {
        return 0; // ???
    }
}
