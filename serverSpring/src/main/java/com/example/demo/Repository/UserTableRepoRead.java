package com.example.demo.Repository;

import com.example.demo.Table.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface UserTableRepoRead extends JpaRepository<UserTable, String> {
    @Query("SELECT u FROM UserTable u")
    Collection<UserTable> findAllActiveUsers();
}
