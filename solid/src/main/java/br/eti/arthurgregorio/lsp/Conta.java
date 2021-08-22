package br.eti.arthurgregorio.lsp;

public class Conta {

    protected final ManipuladorSaldo ManipuladorSaldo;

    public Conta(ManipuladorSaldo ManipuladorSaldo) {
        this.ManipuladorSaldo = ManipuladorSaldo;
    }

    public double getSaldo() {
        return this.ManipuladorSaldo.getSaldo();
    }

    public void depositar(double valor) {
        this.ManipuladorSaldo.depositar(valor);
    }

    public void sacar(double valor) {
        this.ManipuladorSaldo.sacar(valor);
    }

    public void render() {
        this.ManipuladorSaldo.render();
    }
}