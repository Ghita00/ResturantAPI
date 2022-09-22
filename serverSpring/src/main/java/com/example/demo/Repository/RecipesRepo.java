package com.example.demo.Repository;

import com.example.demo.Table.Recipese;
import com.example.demo.Table.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface RecipesRepo extends JpaRepository<Recipese, Integer> {
    @Query("SELECT u FROM UserTable u")
    Collection<Recipese> findAllRecipes(String name);
}
