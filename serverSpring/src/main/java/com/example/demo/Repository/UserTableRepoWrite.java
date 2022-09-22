package com.example.demo.Repository;

import com.example.demo.Table.UserTable;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public class UserTableRepoWrite {
    private EntityManager entityManager;

    @Transactional
    public void insertWithQuery(UserTable userTable) {
        entityManager.createNativeQuery("INSERT INTO person (idUser, username, password) VALUES (?,?,?)")
                .setParameter(1, userTable.getIdUser())
                .setParameter(2, userTable.getPassword())
                .setParameter(3, userTable.getPassword())
                .executeUpdate();
    }
}

