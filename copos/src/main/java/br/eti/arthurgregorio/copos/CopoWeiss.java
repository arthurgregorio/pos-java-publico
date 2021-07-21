package br.eti.arthurgregorio.copos;

import br.eti.arthurgregorio.liquidos.CervejaWeiss;

public class CopoWeiss<T extends CervejaWeiss> extends Copo<T> {

    public CopoWeiss(T conteudo) {
        super(conteudo);
    }
}
