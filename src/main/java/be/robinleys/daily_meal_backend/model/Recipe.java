package be.robinleys.daily_meal_backend.model;

import org.springframework.data.annotation.Id;

public class Recipe {

    @Id
    private int id;
    private String name;

    public Recipe(int id) {
        this.id = id;
    }

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
