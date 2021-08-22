package br.eti.arthurgregorio.lsp;

public class ManipuladorSaldoComum implements ManipuladorSaldo {

    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
    }

    public void render() {
        this.saldo += this.saldo * 0.05;
    }

    public double getSaldo() {
        return saldo;
    }
}
