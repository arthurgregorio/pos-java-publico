package br.eti.arthurgregorio.cervejada.dados;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 *
 * @author Arthur Gregorio
 */
public class Beer {

    private final int id;
    private final UUID uid;
    private final String brand;
    private final String name;
    private final String style;
    private final String hop;
    private final String yeast;
    private final String malts;
    private final int ibu;
    private final double alcohol;
    private final double ballingScale;

    @JsonCreator
    public Beer(@JsonProperty("id") int id, @JsonProperty("uid") UUID uid,
            @JsonProperty("brand") String brand, @JsonProperty("name") String name,
            @JsonProperty("style") String style, @JsonProperty("hop") String hop,
            @JsonProperty("yeast") String yeast, @JsonProperty("malts") String malts,
            @JsonProperty("ibu") int ibu, @JsonProperty("alcohol") double alcohol,
            @JsonProperty("blg") double ballingScale) {
        this.id = id;
        this.uid = uid;
        this.brand = brand;
        this.name = name;
        this.style = style;
        this.hop = hop;
        this.yeast = yeast;
        this.malts = malts;
        this.ibu = ibu;
        this.alcohol = alcohol;
        this.ballingScale = ballingScale;
    }

    public int getId() {
        return id;
    }

    public UUID getUid() {
        return uid;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getHop() {
        return hop;
    }

    public String getYeast() {
        return yeast;
    }

    public String getMalts() {
        return malts;
    }

    public int getIbu() {
        return ibu;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public double getBallingScale() {
        return ballingScale;
    }
    
    public boolean isToMuchAlcoholic() {
        return this.alcohol > 8;
    }

    @Override
    public String toString() {
        return "Beer{" + "id=" + id + ", uid=" + uid + ", brand=" + brand + ", name=" + name + '}';
    }
}
