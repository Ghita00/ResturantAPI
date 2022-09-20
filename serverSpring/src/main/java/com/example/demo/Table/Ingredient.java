package com.example.demo.Table;

import javax.persistence.*;

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
    @ManyToOne
    @JoinColumn(name="idIngRec")
    private IngredientForRecipes ingredientForRecipes;
}
