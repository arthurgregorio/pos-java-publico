package br.eti.arthurgregorio;

import br.eti.arthurgregorio.copos.Copo;
import br.eti.arthurgregorio.copos.CopoWeiss;
import br.eti.arthurgregorio.liquidos.CervejaTripel;
import br.eti.arthurgregorio.liquidos.CervejaWeiss;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class VouBeberCerveja {

    @Test
    void bebendoCervejaDeTrigo() {
        final Copo<CervejaWeiss> copo = new CopoWeiss<>(new CervejaWeiss());
        Assertions.assertThat(copo.getOQueEstouBebendo()).isEqualTo("Cerveja de trigo");
    }

    @Test
    void bebendoCervejaTripel() {
        final Copo<CervejaWeiss> copo = new CopoWeiss<>(new CervejaTripel());
        Assertions.assertThat(copo.getOQueEstouBebendo()).isEqualTo("Cerveja de trigo");
    }
}
