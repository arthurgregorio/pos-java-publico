package br.eti.arthurgregorio.cervejada.dados;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author Arthur Gregorio
 */
public class BeerReader {

    final InputStream inputData;

    public BeerReader(String dataFile) {
        this.inputData = this.getClass()
                .getClassLoader()
                .getResourceAsStream(dataFile);
    }
    
    public List<Beer> toList() {
        
        if (inputData == null) {
            return List.of();
        }
        
        final ObjectMapper mapper = new ObjectMapper();
        
        mapper.disable(
                DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES,
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES
        );
        
        try {
            return mapper.readValue(inputData, new TypeReference<List<Beer>>(){});
        } catch (IOException ex) {
            throw new RuntimeException("Impossível ler o arquivo!", ex);
        }
    }
}
