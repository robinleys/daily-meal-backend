package be.robinleys.daily_meal_backend.repository;


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
        var sql = "INSERT INTO recipes (name) VALUES (?, ?)";
        jdbcTemplate.update(sql, recipe.getName());
    }

    public List<Recipe> findAll() {
        var sql = "SELECT * FROM recipes";
        var bprm = new BeanPropertyRowMapper<>(Recipe.class);
        return jdbcTemplate.query(sql, bprm);
    }

    public void update(Recipe recipe) {
        var sql = "UPDATE recipes SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, recipe.getName(), recipe.getId());
    }

    public void delete(Recipe recipe) {
        var sql = "DELETE FROM recipes WHERE id = ?";
        jdbcTemplate.update(sql, recipe.getId());
    }
}