package br.eti.arthurgregorio.copos;

import br.eti.arthurgregorio.liquidos.Liquido;

public class Copo<T extends Liquido> {

    protected final T conteudo;

    public Copo(T conteudo) {
        this.conteudo = conteudo;
    }

    public String getOQueEstouBebendo() {
        return this.conteudo.getNome();
    }
}
