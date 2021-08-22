package br.eti.arthurgregorio.lsp;

public class Conta {

    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void render() {
        this.saldo += this.saldo * 0.05; // rende 5%
    }
}