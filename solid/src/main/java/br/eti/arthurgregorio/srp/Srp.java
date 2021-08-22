package br.eti.arthurgregorio.srp;

import java.util.Arrays;
import java.util.List;

public class Srp {

    public static void main(String[] args) {
        final Srp srp = new Srp();
        srp.executar();
    }
    
    private void executar() {
        
        final List<Colaborador> colaboradores = Arrays.asList(
                new Colaborador("Huguinho", Cargo.DESENVOLVEDOR, 500),
                new Colaborador("Zezinho", Cargo.ANALISTA, 1000),
                new Colaborador("Luizinho", Cargo.GERENTE, 2000)
        );
        
        final CalculadoraBonificacao calculadora = new CalculadoraBonificacao();
        
        colaboradores.forEach(colaborador -> {
            System.out.println(String.format("O colaborador %s tem bonificacao de %f", 
                    colaborador.nome(), calculadora.calculaBonificacao(colaborador)));
        });
    }
}
