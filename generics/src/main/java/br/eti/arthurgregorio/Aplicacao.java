package br.eti.arthurgregorio;

import br.eti.arthurgregorio.frutas.Banana;
import br.eti.arthurgregorio.frutas.Fruta;
import br.eti.arthurgregorio.frutas.Maca;
import br.eti.arthurgregorio.legumes.Cebola;
import br.eti.arthurgregorio.legumes.Chuchu;
import br.eti.arthurgregorio.legumes.Legume;

public class Aplicacao {

    public Aplicacao() {
//        rawType();
//        generic();
        wildcard();
    }

    private void metodo(final String nome) {
        if (nome.equals("Jovem")) {
            // faz algo para jovem
        }
    }

    private void wildcard() {

        // wildcard
        // PECS - producer extends consumer super

        final Cesta<? extends Fruta> cestaExtend = new Cesta<>(); // producer
//        final Cesta<Maca> cestaExtend = new Cesta<>();
//        final Cesta<Banana> cestaExtend = new Cesta<>();

//        cestaExtend.adicionar(new Maca());
//        cestaExtend.adicionar(new Banana());

        cestaExtend.pegarTudo()
                .stream()
                .map(Fruta::quemSouEu)
                .forEach(System.out::println);

        final Cesta<? super Fruta> cestaSuper = new Cesta<>(); // consumer
//        final Cesta<Vegetal> cestaSuper = new Cesta<>();
//        final Cesta<Object> cestaSuper = new Cesta<>();

        cestaSuper.adicionar(new Maca());
        cestaSuper.adicionar(new Banana());

        for (Object possivelFruta : cestaSuper.pegarTudo()) {
            if (possivelFruta instanceof Fruta fruta) {
                System.out.println(fruta.quemSouEu());
            }
        }
    }

    private void rawType() {

        // raw type
        final var cestaDeFrutas = new Cesta();

        cestaDeFrutas.adicionar(new Maca());
        cestaDeFrutas.adicionar(new Banana());

        // raw type
        final var cestaDeLegumes = new Cesta();

        cestaDeLegumes.adicionar(new Cebola());
        cestaDeLegumes.adicionar(new Chuchu());
    }

    private void generic() {

        final var cestaDeFrutas = new Cesta<Fruta>();

        cestaDeFrutas.adicionar(new Maca());
        cestaDeFrutas.adicionar(new Banana());

        cestaDeFrutas.pegarTudo()
                .stream()
                .map(Fruta::quemSouEu)
                .forEach(System.out::println);

        final var cestaDeLegumes = new Cesta<Legume>();

        cestaDeLegumes.adicionar(new Cebola());
        cestaDeLegumes.adicionar(new Chuchu());

        cestaDeLegumes.pegarTudo()
                .stream()
                .map(Legume::quemSouEu)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Aplicacao();
    }
}
