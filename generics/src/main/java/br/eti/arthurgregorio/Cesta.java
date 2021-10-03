package br.eti.arthurgregorio;

import br.eti.arthurgregorio.frutas.Fruta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cesta<T> {

    private final List<T> items;

    public Cesta() {
        this.items = new ArrayList<>();
    }

    public void adicionar(T item) {
        this.items.add(item);
    }

    public List<T> pegarTudo() {
        return Collections.unmodifiableList(this.items);
    }
}
