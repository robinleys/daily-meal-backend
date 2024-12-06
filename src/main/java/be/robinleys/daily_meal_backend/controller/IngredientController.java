package be.robinleys.daily_meal_backend.controller;

import be.robinleys.daily_meal_backend.model.Ingredient;
import be.robinleys.daily_meal_backend.repository.IngredientDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/ingredients")
public class IngredientController {
    private final IngredientDAO ingredientDAO;

    public IngredientController(IngredientDAO ingredientDAO) {
        this.ingredientDAO = ingredientDAO;
    }

    @GetMapping
    public List<Ingredient> findIngredients() {
        return ingredientDAO.findAll();
    }

    @GetMapping("/{id}")
    public Ingredient getIngredientById(@RequestParam int id) {
        return ingredientDAO.findById(id);
    }

    @PostMapping
    public void addIngredient(@RequestBody Ingredient ingredient) {
        ingredientDAO.create(ingredient);
    }

    @PutMapping
    public void updateIngredient(@RequestBody Ingredient ingredient) {
        ingredientDAO.update(ingredient);
    }

    @DeleteMapping("/{id}")
    public void deleteIngredient(@PathVariable int id) {
        ingredientDAO.delete(id);
    }
}