package com.example.demo.Table;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class IngredientForRecipes {
    @Id
    @SequenceGenerator(
            name = "ingredientForRecipes_sequence",
            sequenceName = "ingredientForRecipes_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ingredientForRecipes_sequence"
    )
    private int idIngRec;
    private int quantityUse;
    //association 1 to many with ingredient
    @OneToMany(mappedBy = "IngredientForRecipes")
    private List<Ingredient> ingredientList;

    //association 1 to many with recipes
    @OneToMany(mappedBy = "ingredientForRecipes")
    private List<Recipese> recipeseList;
}
