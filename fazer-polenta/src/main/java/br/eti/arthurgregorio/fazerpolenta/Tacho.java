package br.eti.arthurgregorio.fazerpolenta;

import java.util.concurrent.atomic.AtomicInteger;

public class Tacho {

    private final AtomicInteger totalMexidas;

    public Tacho() {
        this.totalMexidas = new AtomicInteger(0);
    }

    public synchronized void mexerPolenta(String nomePolenteira) {
        System.out.printf("Polenteira %s mexendo a polenta...%n", nomePolenteira);
        this.totalMexidas.incrementAndGet();
        System.out.printf("A polenta foi mexida %s vezes", this.totalMexidas.get()).println();
    }

    public int getTotalMexidas() {
        return totalMexidas.get();
    }
}
