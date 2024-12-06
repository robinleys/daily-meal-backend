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
    public List<Recipe> getAllRecipes() {
        return recipeDAO.findAll();
    }

    @GetMapping("/{id}")
    public Recipe getRecipeById(@PathVariable int id) {
        return recipeDAO.findById(id);
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

    @GetMapping("/{recipeId}/ingredients")
    public void findIngredientsForRecipe(@PathVariable int id) {
        recipeDAO.findIngredientsForRecipe(id);
    }

    @PostMapping("/{recipeId}/ingredients/{ingredientId}/{quantity}")
    public void addIngredientToRecipe(@PathVariable int recipeId,
                                      @PathVariable int ingredientId,
                                      @PathVariable long quantity) {
        recipeDAO.addIngredientToRecipe(recipeId, ingredientId, quantity);
    }

    @DeleteMapping("/{recipeId}/ingredients/{ingredientId}")
    public void deleteIngredientFromRecipe(@PathVariable int recipeId,
                                           @PathVariable int ingredientId) {
        recipeDAO.deleteIngredientFromRecipe(recipeId, ingredientId);
    }

}