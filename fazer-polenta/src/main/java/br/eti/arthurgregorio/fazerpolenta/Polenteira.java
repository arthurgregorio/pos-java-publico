package br.eti.arthurgregorio.fazerpolenta;

import java.util.concurrent.atomic.AtomicBoolean;

public class Polenteira implements Runnable {

    private final AtomicBoolean executando;

    private final String nome;
    private final Tacho tacho;

    public Polenteira(String nome, Tacho tacho) {
        this.nome = nome;
        this.tacho = tacho;

        this.executando = new AtomicBoolean(false);
    }

    public void parar() {
        this.executando.set(false);
    }

    public void iniciar() {
        final var thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        this.executando.set(true);
        while (executando.get()) {
            try {
                this.tacho.mexerPolenta(this.nome);
                Thread.sleep(2000L);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                System.err.println("Impossivel finalizar, a thread foi interrompida...");
                System.exit(1);
            }
        }
        System.out.printf("%s finalizou", this.nome).println();
    }
}
