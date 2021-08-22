package br.eti.arthurgregorio.srp;

public class CalculadoraBonificacao {

    public double calculaBonificacao(Colaborador colaborador) {
        
        double bonificacao = 0;
        double salarioBase = colaborador.salario();
        
        if (colaborador.cargo() == Cargo.GERENTE) {
            bonificacao = salarioBase * 0.1; // 10% do salario
        } else if (colaborador.cargo() == Cargo.ANALISTA) {
            bonificacao = salarioBase * 0.05; // 5% do salario
        } else if (colaborador.cargo() == Cargo.DESENVOLVEDOR) {
            bonificacao = salarioBase * 0.01; // 1% do salario;
        }
        
        return bonificacao;
    }
}