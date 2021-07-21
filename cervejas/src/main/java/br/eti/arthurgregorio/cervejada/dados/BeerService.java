package br.eti.arthurgregorio.cervejada.dados;

import java.util.Optional;
import java.util.UUID;

/**
 *
 * @author Arthur Gregorio
 */
public class BeerService {

//    public static Beer getBeerFromSomewhere(String filter) {
//        if (filter.isBlank()) {
//            return null;
//                   
//        }
//        return new Beer(1, UUID.randomUUID(), filter, filter, filter, filter, 
//                filter, filter, 50, 14, 4);
//    }
    
    public static Optional<Beer> getBeerFromSomewhere(String filter) {
        
        final Beer found = new Beer(1, UUID.randomUUID(), filter, filter, filter, 
                filter, filter, filter, 50, 14, 4);
        
        if (filter.isBlank()) {
            return Optional.empty();
        } else {
            return Optional.of(found);
        }
    }
}
