package be.robinleys.daily_meal_backend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Ingredient {
    public long id;
    public String name;
    public int stock;
    public String unit;

    public Ingredient(long id) {
        this.id = id;
    }

    public Ingredient(long id, String name, int stock, String unit) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.unit = unit;
    }

    public Ingredient(String name, int stock, String unit) {
        this.name = name;
        this.stock = stock;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", unit='" + unit + '\'' +
                '}';
    }
}
