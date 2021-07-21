package br.eti.arthurgregorio;

import br.eti.arthurgregorio.copos.Copo;
import br.eti.arthurgregorio.copos.Taca;
import br.eti.arthurgregorio.liquidos.Agua;
import br.eti.arthurgregorio.liquidos.Cerveja;
import br.eti.arthurgregorio.liquidos.Liquido;
import br.eti.arthurgregorio.liquidos.Vinho;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OQueVouBeber {

    @Test
    void bebereiAguaNoCopo() {
        final Copo<Agua> copo = new Copo<>(new Agua());
        assertThat(copo.getOQueEstouBebendo()).isEqualTo("Agua");
    }

    @Test
    void bebereiVinhoNaTaca() {
        final Taca<Vinho> taca = new Taca<>(new Vinho());
        assertThat(taca.getOQueEstouBebendo()).isEqualTo("Vinho");
    }

    @Test
    void bebereiCervejaNoCopo() {
        final Copo<Cerveja> copo = new Copo<>(new Cerveja());
        assertThat(copo.getOQueEstouBebendo()).isEqualTo("Cerveja");
    }

    @Test
    void possoBeberQualquerCoisaNoCopo() {
        final Copo<? extends Liquido> copoDeAgua = new Copo<>(new Agua());
        assertThat(copoDeAgua.getOQueEstouBebendo()).isEqualTo("Agua");

        final Copo<? extends Liquido> copoDeVinho = new Copo<>(new Vinho());
        assertThat(copoDeVinho.getOQueEstouBebendo()).isEqualTo("Vinho");
    }
}
