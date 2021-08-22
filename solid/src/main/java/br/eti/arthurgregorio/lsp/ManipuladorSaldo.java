package br.eti.arthurgregorio.lsp;

public interface ManipuladorSaldo {

    void depositar(double valor);

    void sacar(double valorSaque);

    void render();

    double getSaldo();
}
