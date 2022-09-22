package com.example.demo.Service;

import com.example.demo.Repository.RecipesRepo;
import com.example.demo.Table.Recipese;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@Service
public class RecipesService {
    private final RecipesRepo recipesRepo;

    public RecipesService(RecipesRepo recipesRepo) {
        this.recipesRepo = recipesRepo;
    }

    @GetMapping("/getRecipes")
    @CrossOrigin(origins = "http://localhost:3000")
    Collection<Recipese> allRecipes(@RequestParam(name = "name") String name){
        Collection<Recipese> r = recipesRepo.findAllRecipes(name);
        r.add(new Recipese(1, "pasta al ragu", 2, "woman cook", null));
        return r;
    }
}
