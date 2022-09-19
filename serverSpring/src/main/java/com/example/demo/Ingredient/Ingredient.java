package com.example.demo.Ingredient;

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
    private String id;
    private String nome;
    private int quantityInBox;

    public Ingredient(String id, String nome, int quantityInBox) {
        this.id = id;
        this.nome = nome;
        this.quantityInBox = quantityInBox;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantityInBox() {
        return quantityInBox;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantityInBox(int quantityInBox) {
        this.quantityInBox = quantityInBox;
    }
}
