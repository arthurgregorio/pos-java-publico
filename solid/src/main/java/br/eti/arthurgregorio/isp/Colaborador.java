package br.eti.arthurgregorio.isp;

public abstract class Colaborador {

    private final String nome;
    private final String documento;
    private final double salario;

    public Colaborador(String nome, String documento, double salario) {
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public double getSalario() {
        return salario;
    }
}
