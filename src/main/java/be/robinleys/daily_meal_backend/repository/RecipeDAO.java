package be.robinleys.daily_meal_backend.repository;


import be.robinleys.daily_meal_backend.model.Ingredient;
import be.robinleys.daily_meal_backend.model.Recipe;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RecipeDAO {

    private final JdbcTemplate jdbcTemplate;

    public RecipeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(Recipe recipe) {
        var sql = "INSERT INTO recipes (name) VALUES (?)";
        jdbcTemplate.update(sql, recipe.getName());
    }

    public List<Recipe> findAll() {
        var sql = "SELECT * FROM recipes";
        var bprm = new BeanPropertyRowMapper<>(Recipe.class);
        return jdbcTemplate.query(sql, bprm);
    }

    public Recipe findById(int id) {
        var sql = "SELECT * FROM recipes WHERE id = ?";
        var bprm = new BeanPropertyRowMapper<>(Recipe.class);
        return jdbcTemplate.queryForObject(sql, bprm, id);
    }

    public void update(Recipe recipe) {
        var sql = "UPDATE recipes SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, recipe.getName(), recipe.getId());
    }

    public void delete(int id) {
        var sql = "DELETE FROM recipes WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public List<Ingredient> getIngredientsForRecipe(int recipeId) {
        var sql = "SELECT * " +
                  "FROM ingredients JOIN recipe_ingredients " +
                  "ON recipe_ingredients.ingredient_id = ingredients.id " +
                  "WHERE recipe_ingredients.recipe_id = ?";
        var bprm = new BeanPropertyRowMapper<>(Ingredient.class);
        return jdbcTemplate.query(sql, bprm, recipeId);
    }

    public void addIngredientToRecipe(int recipeId, int ingredientId, long quantity) {
        var sql = "INSERT INTO recipe_ingredients (recipe_id, ingredient_id, quantity) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, recipeId, ingredientId, quantity);
        }

    public void deleteIngredientFromRecipe(int recipeId, int ingredientId) {

    }


}