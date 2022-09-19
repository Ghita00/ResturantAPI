package com.example.demo.Recipese;

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
    private String id;
    private String name;
    private int timeHour;
    private String price;

    public Recipese(String id, String name, int timeHour, String price) {
        this.id = id;
        this.name = name;
        this.timeHour = timeHour;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public String getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeHour(int timeHour) {
        this.timeHour = timeHour;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
