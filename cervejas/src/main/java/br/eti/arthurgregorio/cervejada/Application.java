package br.eti.arthurgregorio.cervejada;

import br.eti.arthurgregorio.cervejada.dados.Beer;
import br.eti.arthurgregorio.cervejada.dados.BeerReader;
import br.eti.arthurgregorio.cervejada.dados.BeerService;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 *
 * @author Arthur Gregorio
 */
public class Application {

    public Application() {
        final List<Beer> beers = new BeerReader("beers.json").toList();
//        testConsumers(beers);
//        testSuppliers(beers);
//        testPredicates(beers);
        testFunctions(beers);
    }
    
    public static void main(String[] args) {
        new Application();
    }

    private void testConsumers(List<Beer> beers) {
        
        final Consumer<Beer> beerConsumer = beer -> System.out.println(beer);
        
        beers.forEach(beerConsumer);
        
//        for (Beer beer : beers) {
//            System.out.println(beer);
//        }
    }

    private void testSuppliers(List<Beer> beers) {
        
//        final Beer beer = BeerService.getBeerFromSomewhere("Qualquer Breja");
//        
//        if (beer != null) {
//            System.out.println(beer.getBrand());
//        } else {
//            System.err.println("Nenhum breja encontrada");
//        }

        final var beer = BeerService.getBeerFromSomewhere("");
        
        final Supplier<Beer> beerSupplier = () -> beers.get(0);
        System.out.println(beer.orElseGet(beerSupplier));
    }

    private void testPredicates(List<Beer> beers) {
        
//        for (Beer beer : beers) {
//            if (beer.getAlcohol() > 9) {
//                System.out.println(beer);
//            }
//        }
        
        beers.stream()
//                .filter(beer -> beer.getAlcohol() > 9)
                .filter(Beer::isToMuchAlcoholic)
                .forEach(System.out::println);
    }

    private void testFunctions(List<Beer> beers) {
        
//        final List<String> brands = new ArrayList<>();
//        
//        for (Beer beer : beers) {
//            final String brand = beer.getBrand();
//            if (!brands.contains(brand)) {
//                brands.add(brand);
//            }
//        }
//        
//        System.out.println(brands);

        beers.stream()
                .map(Beer::getBrand)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
