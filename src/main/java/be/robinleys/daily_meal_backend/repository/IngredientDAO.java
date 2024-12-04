package be.robinleys.daily_meal_backend.repository;

import be.robinleys.daily_meal_backend.model.Ingredient;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IngredientDAO {

    private final JdbcTemplate jdbcTemplate;

    public IngredientDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(Ingredient ingredient) {
        var sql = "INSERT INTO ingredients (name, stock, unit) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, ingredient.getName(), ingredient.getStock(), ingredient.getUnit());
    }

    public List<Ingredient> findAll() {
        var sql = "SELECT * FROM ingredients";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Ingredient(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getBigDecimal("stock"),
                rs.getString("unit")
        ));
    }

    public Ingredient findById(int id) {
        var sql = "SELECT * FROM ingredients WHERE id = ?";
        var bprm = new BeanPropertyRowMapper<>(Ingredient.class);
        return jdbcTemplate.queryForObject(sql, bprm, id);
    }

    public void update(Ingredient ingredient) {
        var sql = "UPDATE ingredients SET name = ?, stock = ?, unit = ? WHERE id = ?";
        jdbcTemplate.update(sql, ingredient.getName(), ingredient.getStock(), ingredient.getUnit(), ingredient.getId());
    }

    public void delete(int id) {
        var sql = "DELETE FROM ingredients WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}