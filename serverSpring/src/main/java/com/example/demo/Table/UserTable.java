package com.example.demo.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class UserTable {
    @Id
    @SequenceGenerator(
            name = "userTable_sequence",
            sequenceName = "userTable_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userTable_sequence"
    )
    private int idUser;
    private String username;
    private String password;

    @OneToMany(mappedBy="user")
    private Set<Recipese> recipese;

    public UserTable(int idUser, String username, String password, Set<Recipese> recipese) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.recipese = recipese;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Recipese> getRecipese() {
        return recipese;
    }

    public void setRecipese(Set<Recipese> recipese) {
        this.recipese = recipese;
    }
}