package br.eti.arthurgregorio.lsp;

import java.util.List;

public class Lsp {

    public static void main(String[] args) {
        final Lsp lsp = new Lsp();
        lsp.executa();
    }

    private void executa() {

        final var conta1 = new Conta();
        final var conta2 = new ContaPremium();

        conta1.depositar(100);
        conta2.depositar(100);

        final List<Conta> contas = List.of(conta1, conta2);

        contas.stream()
                .peek(Conta::render)
                .forEach(conta -> System.out.println("Saldo da conta " + conta.getSaldo()));
    }
}