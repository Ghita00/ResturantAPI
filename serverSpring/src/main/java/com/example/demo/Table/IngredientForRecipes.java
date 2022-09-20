package com.example.demo.Table;

import org.apache.catalina.User;

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

    @ManyToOne
    @MapsId("idRecipes")
    @JoinColumn(name = "recipes_id")
    Recipese recipese;

    @ManyToOne
    @MapsId("idIngredient")
    @JoinColumn(name = "ingredient_id")
    Ingredient ingredient;

    public IngredientForRecipes(int idIngRec, int quantityUse) {
        this.idIngRec = idIngRec;
        this.quantityUse = quantityUse;
    }

    public int getIdIngRec() {
        return idIngRec;
    }

    public void setIdIngRec(int idIngRec) {
        this.idIngRec = idIngRec;
    }

    public int getQuantityUse() {
        return quantityUse;
    }

    public void setQuantityUse(int quantityUse) {
        this.quantityUse = quantityUse;
    }
}
