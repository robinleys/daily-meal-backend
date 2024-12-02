package be.robinleys.daily_meal_backend.controller;

import be.robinleys.daily_meal_backend.model.Recipe;
import be.robinleys.daily_meal_backend.repository.RecipeDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeDAO recipeDAO;

    public RecipeController(RecipeDAO recipeDAO) {
        this.recipeDAO = recipeDAO;
    }

    @GetMapping
    public List<Recipe> getRecipes() {
        return recipeDAO.findAll();
    }

    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe) {
        recipeDAO.create(recipe);
    }

    @PutMapping
    public void updateRecipe(@RequestBody Recipe recipe) {
        recipeDAO.update(recipe);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable int id) {
        recipeDAO.delete(id);
    }
}