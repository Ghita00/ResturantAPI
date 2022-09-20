package com.example.demo.Table;

import javax.persistence.*;

@Entity
@Table
public class Recipese {
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
    private int idRecipes;
    private String name;
    private int timeHour;
    private String description;

    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name="idIngRec")
    private IngredientForRecipes ingredientForRecipes;
}
