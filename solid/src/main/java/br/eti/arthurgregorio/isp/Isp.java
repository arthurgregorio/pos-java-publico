package br.eti.arthurgregorio.isp;

import java.util.List;

public class Isp {

    public static void main(String[] args) {
        final Isp isp = new Isp();
        isp.executa();
    }

    private void executa() {

        final var analista = new Analista("Jose", "123", 1000);
        final var vendedor = new Vendedor("Manuel", "321", 1500);
        final var vendedor2 = new Vendedor("Juca", "999", 1700);
        final var cozinheira = new Cozinheira("Maria", "456", 2500);

        final List<Colaborador> colaboradores = List.of(analista, vendedor, cozinheira, vendedor2);

        colaboradores.forEach(colaborador -> System.out.printf("A comissão de %s é de %s",
                colaborador.getNome(), colaborador.getComissao()).println());
    }
}
