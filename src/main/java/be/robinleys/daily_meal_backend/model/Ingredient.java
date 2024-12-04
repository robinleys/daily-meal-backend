package be.robinleys.daily_meal_backend.model;

import java.math.BigDecimal;

public class Ingredient {


    private int id;
    private String name;
    private BigDecimal stock;
    private String unit;

    public Ingredient() {
    }

    public Ingredient(int id) {
        this.id = id;
    }

    public Ingredient(String name, BigDecimal stock, String unit) {
        this.name = name;
        this.stock = stock;
        this.unit = unit;
    }

    public Ingredient(int id, String name, BigDecimal stock, String unit) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
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
