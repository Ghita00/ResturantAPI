package com.example.demo.Table;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Ingredient {
    @Id
    @SequenceGenerator(
        name = "ingredient_sequence",
        sequenceName = "ingredient_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "ingredient_sequence"
    )
    private String idIngredient;
    private String name;
    private int quantityInBox;
    private double priceUnity;

    @OneToMany(mappedBy = "ingredient")
    Set<IngredientForRecipes> ingredientForRecipes;

    public Ingredient(String idIngredient, String name, int quantityInBox, double priceUnity) {
        this.idIngredient = idIngredient;
        this.name = name;
        this.quantityInBox = quantityInBox;
        this.priceUnity = priceUnity;
    }

    public String getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(String idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityInBox() {
        return quantityInBox;
    }

    public void setQuantityInBox(int quantityInBox) {
        this.quantityInBox = quantityInBox;
    }

    public double getPriceUnity() {
        return priceUnity;
    }

    public void setPriceUnity(double priceUnity) {
        this.priceUnity = priceUnity;
    }
}
