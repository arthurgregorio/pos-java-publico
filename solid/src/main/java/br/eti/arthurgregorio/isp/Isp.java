package br.eti.arthurgregorio.isp;

import java.util.List;

public class Isp {

    public static void main(String[] args) {
        final Isp isp = new Isp();
        isp.executa();
    }

    private void executa() {

        final var analista = new Analista("Jose", "123", 1000);
        final var vendedor = new Analista("Manuel", "321", 1000);

        final List<Colaborador> colaboradores = List.of(analista, vendedor);

        colaboradores.forEach(colaborador -> System.out.printf("A comissão de %s é de %s",
                colaborador.getNome(), colaborador.getComissao()).println());
    }
}
