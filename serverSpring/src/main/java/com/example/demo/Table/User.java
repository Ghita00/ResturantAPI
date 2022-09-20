package com.example.demo.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private int idUser;
    private String user;
    private String password;
    //association 1 to many with recipies
    @OneToMany(mappedBy = "user")
    private List<Recipese> recipeseList;




}
