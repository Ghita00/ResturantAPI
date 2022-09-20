package com.example.demo.Table;

import javax.persistence.*;
import java.util.Set;

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
    @JoinColumn(name="user_fk", nullable=false)
    private UserTable user;

    @OneToMany(mappedBy = "recipese")
    Set<IngredientForRecipes> ingredientForRecipes;

    public Recipese(int idRecipes, String name, int timeHour, String description, UserTable user) {
        this.idRecipes = idRecipes;
        this.name = name;
        this.timeHour = timeHour;
        this.description = description;
        this.user = user;
    }

    public int getIdRecipes() {
        return idRecipes;
    }

    public void setIdRecipes(int idRecipes) {
        this.idRecipes = idRecipes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public void setTimeHour(int timeHour) {
        this.timeHour = timeHour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserTable getUser() {
        return user;
    }

    public void setUser(UserTable user) {
        this.user = user;
    }
}
