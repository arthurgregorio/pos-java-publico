package br.eti.arthurgregorio.srp;

import java.util.List;

public class Srp {

    public static void main(String[] args) {
        final Srp srp = new Srp();
        srp.executar();
    }

    private void executar() {

        final List<Colaborador> colaboradores = List.of(
                new Colaborador("Tio Patinhas", Cargo.CEO, 5000),
                new Colaborador("Huguinho", Cargo.DESENVOLVEDOR, 500),
                new Colaborador("Zezinho", Cargo.ANALISTA, 1000),
                new Colaborador("Goku", Cargo.ESTAGIARIO, 500),
                new Colaborador("Luizinho", Cargo.GERENTE, 2000)
        );

        final CalculadoraBonificacao calculadora = new CalculadoraBonificacao();

        colaboradores.forEach(colaborador -> {
            System.out.printf("O colaborador %s tem salario de %f%n",
                    colaborador.nome(), calculadora.calculaBonificacao(colaborador)).println();
        });
    }
}
