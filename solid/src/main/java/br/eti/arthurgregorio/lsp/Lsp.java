package br.eti.arthurgregorio.lsp;

import java.util.Arrays;
import java.util.List;

public class Lsp {

    public static void main(String[] args) {
        final Lsp lsp = new Lsp();
        lsp.executa();
    }

    private void executa() {

        final List<Conta> contas = Arrays.asList(
                new Conta(),
                new ContaPremium()
        );

        contas.forEach(Conta::render);
    }
}