package com.example.demo.model;
import javax.persistence.*;

//REMEMBER: EVERY TABLE HAVE ONE FILE! ==> 3 TABLE == 3 CLASS FILE with different package
//convert this class in a database's table
//when the application will start if the table wasn't in database, the table will create
@Entity
@Table
public class ingredient {
    //this is for primary key with auto increment
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private String id; //with the annotation @Id this row is a primary key with auto increment was started by 1
    private String name;
    private int quantity;

    public ingredient(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}