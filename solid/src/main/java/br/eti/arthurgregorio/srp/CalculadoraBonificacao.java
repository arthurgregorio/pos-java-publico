package br.eti.arthurgregorio.srp;

public class CalculadoraBonificacao {

    public double calculaBonificacao(Colaborador colaborador) {
        
        double salarioBase = colaborador.salario();
        
        return switch (colaborador.cargo()) {
            case GERENTE -> salarioBase * 0.08;
            case ANALISTA -> salarioBase * 0.05;
            case DESENVOLVEDOR -> salarioBase * 0.01;
            case CEO -> salarioBase * 0.1;
            default -> throw new IllegalStateException("Cargo não reconhecido");
        };
    }
}