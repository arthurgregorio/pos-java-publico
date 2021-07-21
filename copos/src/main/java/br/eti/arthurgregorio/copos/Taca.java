package br.eti.arthurgregorio.copos;

import br.eti.arthurgregorio.liquidos.Vinho;

public class Taca<T extends Vinho> extends Copo<T> {

    public Taca(T conteudo) {
        super(conteudo);
    }

    @Override
    public String getOQueEstouBebendo() {
        return super.getOQueEstouBebendo();
    }
}
